package day33_20220503_03;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import day31_20220429_01.MemberDTO;

public class MemberService {

	Scanner scan = new Scanner(System.in);
	MemberRepository memberRepository = new MemberRepository();
	static Long id = 0L;

	// save()
	void save() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();
		System.out.print("이름: ");
		String memberName = scan.next();
		System.out.print("나이: ");
		int memberAge = scan.nextInt();
		System.out.print("전화번호: ");
		String memberMobile = scan.next();
		MemberDTO newMember = new MemberDTO(id++, memberId, memberPassword, memberName, memberAge, memberMobile);
		if (memberRepository.save(newMember) == null) {
			System.out.println("가입을 축하합니다^^");
		} else {
			System.out.println("가입이 거절되었습니다^^");
		}
	}

	// login()
	public void login() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();

		if (memberRepository.login(memberId, memberPassword)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	// findAll()
	public void findAll() {
		Map<Long, MemberDTO> memberMap = memberRepository.findAll();
		for (Long l : memberMap.keySet()) {
			System.out.println(memberMap.get(l));
		}
	}

	// findById()
	public void findById() {
		findAll();
		System.out.print("관리번호: ");
		Long id = scan.nextLong();
		MemberDTO member = memberRepository.findById(id);
		if (member == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}

	// update()
	public void update() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();

		Long loginId = memberRepository.loginCheck(memberId, memberPassword);

		if (loginId != null) {
			System.out.print("수정할 전화번호: ");
			String updateMobile = scan.next();
			MemberDTO member = memberRepository.update(loginId, updateMobile);
			System.out.println(member);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	// delete()
	public void delete() {
		findAll();
		System.out.print("삭제할 번호: ");
		Long deleteId = scan.nextLong();
		Map<Long, MemberDTO> memberMap = memberRepository.delete(deleteId);
		for (Long l : memberMap.keySet()) {
			System.out.println(memberMap.get(l));
		}
	}
}
