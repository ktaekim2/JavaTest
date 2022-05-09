package day28_20220426_01;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Member mem = new Member();
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		boolean result = false;
		int idNum = 0, age = 0, select = 0;
		String pw = "";
		String id = "";
		String name = "";
		String tel = "";

		while (run) {
			System.out.println("1.회원가입|2.로그인|3.회원조회|4.정보수정|5.종료");
			System.out.print("원하는 번호 입력: ");
			select = scan.nextInt();

			if (select == 1) {
				System.out.println("1.먼저입력|2.나중입력");
				System.out.print("회원가입 방법 선택: ");
				select = scan.nextInt();

				if (select == 1) {
					// save1
					System.out.print("회원번호: ");
					idNum = scan.nextInt();
					scan.nextLine();
					System.out.print("아이디: ");
					id = scan.nextLine();
					System.out.print("비밀번호: ");
					pw = scan.next();
					scan.nextLine();
					System.out.print("이름: ");
					name = scan.nextLine();
					System.out.print("전화번호: ");
					tel = scan.nextLine();
					System.out.print("나이: ");
					age = scan.nextInt();
					mem.save1(idNum, id, pw, name, tel, age);
				} else if (select == 2) {
					mem.save2();
				} else {
					System.out.println("번호입력 오류");
				}
			} else if (select == 2) {
				scan.nextLine();
				System.out.print("아이디: ");
				id = scan.nextLine();
				System.out.print("비밀번호: ");
				pw = scan.next();
				result = mem.memberLogin(id, pw);
				if (result == true) {
					System.out.println("로그인 성공");
				} else {
					System.out.println("로그인 실패");
				}
			} else if (select == 3) {
				mem.findById();
			} else if (select == 4) {
				scan.nextLine();
				System.out.print("전화번호: ");
				tel = scan.nextLine();
				mem.update(tel);
			} else if (select == 5) {
				System.out.println("종료");
				run = false;
			} else {
				System.out.println("번호입력 오류");
			}

		}
	}
}
