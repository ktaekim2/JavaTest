package day03_20220406;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		// �հ�, ���հ� ����ϱ�

		Scanner scan = new Scanner(System.in);
		int level = 0;
		int score = 0;
		System.out.print("�г��Է�: ");
		level = scan.nextInt();
		System.out.print("�����Է�: ");
		score = scan.nextInt();

		if (level < 4) {
			if (score >= 60) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		} else {
			if (score >= 70) {
				System.out.println("�հ�");
			} else {
				System.out.println("���հ�");
			}
		}

		// &&�Ἥ

		if (level < 4 && score >= 60) {
			System.out.println("�հ�");
		} else if (level == 4 && score >= 70) {
			System.out.println("�հ�");
		} else {
			System.out.println("���հ�");

		}
		
		// score�� ���������� ���
		
		if (score >= 60) {
			if (level != 4) {
				System.out.println("�հ�");
			} else if (score >= 70) {
				System.out.println("�հ�");
			}
		} else {
			System.out.println("���հ�");
		}
	}

}
