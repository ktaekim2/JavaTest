package day05_20220408;

import java.util.Scanner;

public class Ex06_WhileExample {
	// 상수 선언
	// 상수는 클래스에서 선언한다.
	static final String ANSWER = "종료"; // 관습상 대문자

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 '종료'를 입력하세요.");
		String inputString = "";
//		final String answer = "종료"; // final: 변수값 변경 불가
		boolean run = true;
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
			if (inputString.equals(ANSWER)) {
				run = false;
			}
		} while (run);
	}

}
