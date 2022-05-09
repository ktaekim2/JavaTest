package day28_20220426_01;

import java.util.Scanner;

public class MemberMain2 {

	public static void main(String[] args) {
		Member2 member1 = new Member2(1L, "id1", "1234", "name1", "010-5555-2232", 20);
		Member2 member2 = new Member2();
		member2.id = 2L;
		member2.memberId = "id2";
		member2.memberPassword = "0000";
		member2.memberName = "name2";
		member2.memberPhone = "010-1232-1232";
		member2.memberAge = 22;

		// 조회
		System.out.println(member1.id);
		System.out.println(member1.memberId);

		// 조회(메서드 호출)
		member1.findById(); // member1과 2는 각각의 필드를 갖고있음
		member2.findById();

		Scanner scan = new Scanner(System.in);
		System.out.println("아이디: ");
		String memberId = scan.next();
		System.out.println("비밀번호: ");
		String memberPassword = scan.next();
		boolean loginResult = member1.memberLogin(memberId, memberPassword);
		if (loginResult) {
			System.out.println("로그인성공");
		} else {
			System.out.println("아이디 또는 비밀번호를 확인하세요");
		}

		System.out.println("변경할 전화번호: ");
		String memberPhone = scan.next();
		member1.update(memberPhone);
		member1.findById();
	}

}
