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
			System.out.println("----------------------------\n1.�Ա� | 2.��� | 3.�ܾ� | 4.����\n----------------------------");
			System.out.print(">");
			select = scan.nextInt();
			if (select == 1) {
				System.out.print("�Ա�: ");
				deposit = scan.nextInt();
				balance += deposit;
			} else if (select == 2) {
				System.out.print("���: ");
				withdraw = scan.nextInt();
				if (withdraw > balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else {
					balance -= withdraw;
				}
			} else if (select == 3) {

			} else if (select == 4) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			System.out.println("�ܾ��� " + balance + "�Դϴ�.");
		}
	}
}
