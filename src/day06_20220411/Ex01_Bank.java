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
					"------------------------------\n1.���� | 2.��� | 3.�ܰ� | 4.����\n------------------------------");
			System.out.print("����> ");
			select = scan.nextInt();
			if (select == 1) {
				System.out.print("���ݾ�> ");
				deposit = scan.nextInt();
				balance += deposit;
			} else if (select == 2) {
				System.out.print("��ݾ�> ");
				withdraw = scan.nextInt();
				if (balance < withdraw) {
					System.out.println("�ܰ� �����մϴ�.");
				} else {
					balance -= withdraw;
				}
			} else if (select == 3) {
			} else if (select == 4) {
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			}
			String messageBalance = "���� �ܾ��� " + balance + "�Դϴ�.";
//			String messageBalance = "���� �ܾ��� " + balance + deposit + "�Դϴ�."; balance ���� ������ ����. �ܼ� ��길
			System.out.println(messageBalance);
		}

	}

}
