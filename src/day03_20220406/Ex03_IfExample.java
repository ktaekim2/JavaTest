package day03_20220406;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		// ���� ����ϱ�

		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.print("�����Է�: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�.");
		} else if (score >= 90) {
			System.out.println("A���� �Դϴ�.");
		} else if (score >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if (score >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if (score >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}

		// print �޼��带 �� 3��

		if (score >= 0 && score <= 100) {
			String grade = "";
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println(grade + "���� �Դϴ�.");
		} else {
			System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�.");
		}

		// 
		
		String grade1;
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				grade1 = "A";
			} else if (score >= 80) {
				grade1 = "B";
			} else if (score >= 70) {
				grade1 = "C";
			} else if (score >= 60) {
				grade1 = "D";
			} else {
				grade1 = "F";
			}

		} else {
			System.out.println("�Է¹����� �ʰ��Ͽ����ϴ�.");
			grade1 = "";
		}
		System.out.println(grade1 + "���� �Դϴ�.");

		/*
		 * �����Ϸ��� ��� ����� ���� ����ϱ� ������ grade1 �ʱⰪ��
		 * ���� ������ ������ ����.
		 */
	}
}
