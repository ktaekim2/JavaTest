package day31_20220429_03;

import java.util.Scanner;

public class PostMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		PostService postService = new PostService();

		while (run) {
			System.out.println("1.글작성|2.글목록|3.글조회|4.글수정|5.글검색|6.글삭제|7.종료");
			System.out.print("번호입력: ");
			select = scan.nextInt();

			// 1.Main postSave()
			if (select == 1) {
				postService.postSave();
			}

			// 2.Main postFindAll()
			else if (select == 2) {
				postService.postFindAll();
			}

			// 3.Main postFindById()
			else if (select == 3) {
				postService.postFindById();
			}

			// 4.Main postUpdate()
			else if (select == 4) {
				postService.postUpdate();
			}

			// 5.Main postSearch()
			else if (select == 5) {
				postService.postSearch();
			}

			// 6.Main postDelete()
			else if (select == 6) {
				postService.postDelete();
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
