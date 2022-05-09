package day28_20220426_02;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		// 객체를 만들 때 모든 정보를 매개변수로 전달하여 필드값 지정하기
		Board board1 = new Board(1L, "1234", "aaa", "bbb", "ccc");

		// 객체를 만들고 난 후 필드값을 각각 지정하기
		Board board2 = new Board();
		board2.boardNumber = 2L;
		board2.boardPassword = "ddd";
		board2.boardTitle = "eee";
		board2.boardWriter = "fff";
		board2.boardContents = "ggg";

		// 글조회
		board1.findById();
		board2.findById();

		// 글수정
		Scanner scan = new Scanner(System.in);
		System.out.println("글번호: ");
		long boardNumber = scan.nextLong();
		System.out.println("비밀번호: ");
		String boardPassword = scan.next();

		board1.update(boardNumber, boardPassword);

	}
}
