package day08_20220413;

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int deposit = 0;
		int withdraw = 0;
		int balance = 0;
		int select = 0;

		while (true) {
			System.out.println("----------------------------\n1.입금 | 2.출금 | 3.잔액 | 4.종료\n----------------------------");
			System.out.print(">");
			select = scan.nextInt();
			if (select == 1) {
				System.out.print("입금: ");
				deposit = scan.nextInt();
				balance += deposit;
			} else if (select == 2) {
				System.out.print("출금: ");
				withdraw = scan.nextInt();
				if (withdraw > balance) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= withdraw;
				}
			} else if (select == 3) {

			} else if (select == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
			System.out.println("잔액은 " + balance + "입니다.");
		}
	}
}
