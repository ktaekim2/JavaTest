package day28_20220426_02;

import java.util.Scanner;

public class Board {

	long boardNumber;
	String boardPassword;
	String boardTitle;
	String boardWriter;
	String boardContents;
	int boardHits = 0;

	public Board(long boardNumber, String boardPassword, String boardTitle, String boardWriter, String boardContents,
			int boardHits) {
		this.boardNumber = boardNumber;
		this.boardPassword = boardPassword;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardContents = boardContents;
		this.boardHits = boardHits;
	}

	// 기본생성자
	Board() {

	}

	// 모든 필드를 매개변수로 하는 생성자
	Board(long boardNumber, String boardPassword, String BoardTitle, String BoardWriter, String BoardContents) {
		this.boardNumber = boardNumber;
		this.boardPassword = boardPassword;
		this.boardTitle = BoardTitle;
		this.boardWriter = BoardWriter;
		this.boardContents = BoardContents;

	}

	void findById() {
		this.boardHits += this.boardHits;
		System.out.println(boardNumber);
		System.out.println(boardPassword);
		System.out.println(boardTitle);
		System.out.println(boardWriter);
		System.out.println(boardContents);
		System.out.println(boardHits);
	}

	void update(long boardNumber, String boardPassword) {
		if (this.boardNumber == boardNumber && this.boardPassword.equals(boardPassword)) {
			Scanner scan = new Scanner(System.in);
			System.out.println("변경할 제목: ");
			this.boardTitle = scan.next();
			System.out.println("변경할 내용: ");
			this.boardContents = scan.next();
		} else {
			System.out.println("error");
		}
	}
}
