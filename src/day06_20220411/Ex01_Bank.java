package day06_20220411;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01_Bank {
	public static void main(String[] args) {

		// ATM

		Scanner scan = new Scanner(System.in);
		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
		int select = 0;

		while (true) {
			System.out.println(
					"------------------------------\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n------------------------------");
			System.out.print("선택> ");
			select = scan.nextInt();
			if (select == 1) {
				System.out.print("예금액> ");
				deposit = scan.nextInt();
				balance += deposit;
			} else if (select == 2) {
				System.out.print("출금액> ");
				withdraw = scan.nextInt();
				if (balance < withdraw) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= withdraw;
				}
			} else if (select == 3) {
			} else if (select == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("번호를 잘못 입력하셨습니다.");
			}
			String messageBalance = "현재 잔액은 " + balance + "입니다.";
//			String messageBalance = "현재 잔액은 " + balance + deposit + "입니다."; balance 변수 변하지 않음. 단순 계산만
			System.out.println(messageBalance);
		}

	}

}
