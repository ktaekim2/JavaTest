package day03_20220406;

import java.util.Scanner;

public class Ex08_SwitchCaseExample {

	public static void main(String[] args) {
		// 사전
		Scanner scan = new Scanner(System.in);
		String noum = "";
		System.out.print("영어 단어 입력: ");
		noum = scan.nextLine();

		switch (noum) {
		case "desk":
			System.out.println("책상");
			break;
		case "chair":
			System.out.println("의자");
			break;
		case "monitor":
			System.out.println("모니터");
			break;
		case "mouse":
			System.out.println("마우스");
			break;
		default:
			System.out.println("사전에 없는 단어입니다.");
		}

	}

}