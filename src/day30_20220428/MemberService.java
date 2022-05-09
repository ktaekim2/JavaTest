package day30_20220428;

import java.util.List;
import java.util.Scanner;

import day29_20220427_02.HumanDTO;

public class MemberService {
	Scanner scan = new Scanner(System.in);
	MemberRepository memberRepository = new MemberRepository();
	static Long id = 0L;

	// Service save()
	void save() {
		String[] idPwArray = memberRepository.idPw();
		System.out.print("이름: ");
		String memberName = scan.next();
		System.out.print("나이: ");
		int memberAge = scan.nextInt();
		System.out.print("전화번호: ");
		String memberMobile = scan.next();
		MemberDTO member1 = new MemberDTO(id++, idPwArray[0], idPwArray[1], memberName, memberAge, memberMobile);
		memberRepository.save(member1);
		System.out.println("가입을 축하합니다^^");
	}

	// Service login()
	public void login() {
		String[] idPwArray = memberRepository.idPw();
		boolean result = memberRepository.login(idPwArray[0], idPwArray[1]);
		if (result == true) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	// Service findAll()
	public void findAll() {
		List<MemberDTO> memberList = memberRepository.findAll();
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}

	// Service findById()
	public void findById() {
		System.out.print("관리번호: ");
		Long id = scan.nextLong();
		MemberDTO member = memberRepository.findById(id);
		if (member == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}

	// Service update()
	public void update() {
		String[] idPwArray = memberRepository.idPw();
		boolean result = memberRepository.login(idPwArray[0], idPwArray[1]);
		if (result == true) {
			System.out.println("로그인 성공");
			System.out.print("수정할 전화번호: ");
			String memberMobile = scan.next();
			MemberDTO member = memberRepository.update(idPwArray[0], memberMobile);
			System.out.println(member);

		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}

	}

	// Service delete()
	public void delete() {
		System.out.print("관리번호: ");
		Long id = scan.nextLong();
		List<MemberDTO> memberList = memberRepository.delete(id);
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}
}
