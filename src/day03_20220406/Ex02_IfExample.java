package day03_20220406;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		// ¦Ȧ �Ǻ��ϱ�
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("�����Է�: ");
		num = scan.nextInt();

		if (num < 0) {
			System.out.println("'0'���� ū ���� �Է��ϼ���.");
		} else if (num % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		
		// && ������ ���ǽĿ� �����غ���

		if (num % 2 == 0 && num > 0) {
			System.out.println("¦��");
		} else if (num % 2 == 1 && num > 0) {
			System.out.println("Ȧ��");
		} else {
			System.out.println("'0'���� ū ���� �Է��ϼ���.");
		}

		// ��ø if

		if (num > 0) {
			// 0���� ū ���ڸ� ������ Ȧ, ¦ ��
			if (num % 2 == 0) {
				System.out.println("¦��");
			} else if (num % 2 == 1) {
				System.out.println("Ȧ��");
			}
		} else {
			System.out.println("'0'���� ū ���� �Է��ϼ���.");
		}

	}
}
