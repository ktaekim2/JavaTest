package day03_20220406;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		// 3 �Ǵ� 5 �Ǵ� 3��5�� ������� �ƴ����� ���
		// ������ ��� ���

		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("�����Է�: ");
		num = scan.nextInt();

		if (num < 0) {
			System.out.println("0���� ū ���� �Է��ϼ���.");
		} else {
			if (num % 15 == 0) {
				System.out.println("'3'�� '5'�� ���");
			} else if (num % 3 == 0) {
				System.out.println("'3'�� ���");
			} else if (num % 5 == 0) {
				System.out.println("'5'�� ���");
			} else {
				System.out.println("'3'�� '5'�� ����� �ƴմϴ�.");
			}
		}
		
		
	}

}
