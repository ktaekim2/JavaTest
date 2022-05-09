package day31_20220429_01;

import java.util.List;
import java.util.Scanner;

import day29_20220427_02.HumanDTO;

public class MemberService {

	Scanner scan = new Scanner(System.in);
	MemberRepository memberRepository = new MemberRepository();
	static Long id = 0L; // 초기화 되지 않도록 static

	// Service save()
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
		MemberDTO newMember = new MemberDTO(++id, memberId, memberPassword, memberName, memberAge, memberMobile);
		boolean saveResult = memberRepository.save(newMember);
		if (saveResult) {
			System.out.println("가입을 축하합니다^^");
		} else {
			System.out.println("가입이 거절되었습니다^^");
		}

	}

	// Service login()
	public void login() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();
		boolean loginResult = memberRepository.login(memberId, memberPassword);
		if (loginResult) {
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
		findAll(); // 같은 class내의 다른 method를 쓸 수 있다
		System.out.print("관리번호: ");
		Long id = scan.nextLong(); // 지역변수 id
		MemberDTO member = memberRepository.findById(id);
		if (member == null) {
			System.out.println("조회결과가 없습니다!!");
		} else {
			System.out.println(member);
		}
	}

	// Service update()
	public void update() {
		System.out.print("아이디: ");
		String memberId = scan.next();
		System.out.print("비밀번호: ");
		String memberPassword = scan.next();
		Long loginId = memberRepository.loginCheck(memberId, memberPassword);
		// 로그인 체크가 되면 그 다음...
		// loginId: 로그인을 시도한 회원의 관리번호(id)
		if (loginId != null) {
			System.out.print("수정할 전화번호: ");
			String updateMobile = scan.next();
			MemberDTO member = memberRepository.update(loginId, updateMobile);
			System.out.println(member);
		} else {
			System.out.println("아이디 또는 비밀번호가 틀립니다!!");
		}
	}

	// Service delete()
	public void delete() {
		findAll();
		System.out.print("삭제할 번호: ");
		Long deleteId = scan.nextLong();
		List<MemberDTO> memberList = memberRepository.delete(deleteId);
		for (MemberDTO m : memberList) {
			System.out.println(m);
		}
	}

	public void temp() {
		// 객체 비교하기
		MemberDTO member1 = new MemberDTO(1L, "id1", "pw1", "name1", 11, "111");
		MemberDTO member2 = new MemberDTO(1L, "id1", "pw1", "name1", 11, "111");
		if (member1.equals(member2)) { // object가 정의한 equals, 기본적으로 object를 따름
			System.out.println("두 객체가 동일합니다.");
		} else {
			System.out.println("두 객체가 동일하지 않습니다.");
		}
		// 주소값을 비교한것
	}
}
