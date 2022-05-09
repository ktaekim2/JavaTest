package day30_20220428;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int select = 0;

		MemberService memberService = new MemberService();

		while (run) {
			System.out.println("1.회원가입|2.로그인|3.회원조회|4.상세조회|5.회원정보수정|6.회원삭제|7.종료");
			System.out.print("번호입력: ");
			select = scan.nextInt();

			// 1.Main save()
			if (select == 1) {
				memberService.save();
			}

			// 2.Main login()
			else if (select == 2) {
				memberService.login();
			}

			// 3.Main findAll()
			else if (select == 3) {
				memberService.findAll();
			}

			// 4.Main findById()
			else if (select == 4) {
				memberService.findById();
			}

			// 5.Main update()
			else if (select == 5) {
				memberService.update();
			}

			// 6.Main delete()
			else if (select == 6) {
				memberService.delete();
			}

			// 7.End
			else if (select == 7) {
				System.out.println("종료합니다");
				run = false;
			}

			else {
				System.out.println("번호오류");
			}
		}
	}

}
