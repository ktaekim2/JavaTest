package day03_20220406;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		// ���� �ٸ� 3���� ������ �Է� �޾Ƽ� ���� ū �� ���

		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.print("ù��° ���� �Է�: ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� �Է�: ");
		num2 = scan.nextInt();
		System.out.print("����° ���� �Է�: ");
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("���� ū ���� " + num1 + "�Դϴ�.");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("���� ū ���� " + num2 + "�Դϴ�.");
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println("���� ū ���� " + num3 + "�Դϴ�.");
		}

		if (num1 > num2 && num1 > num3) {
			System.out.println("���� ū ���� " + num1 + "�Դϴ�.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("���� ū ���� " + num2 + "�Դϴ�.");
		} else {
			System.out.println("���� ū ���� " + num3 + "�Դϴ�.");
		}

		// �������� ���
		
		int max = 0; // �ִ밪�� ��� ����
		if (num1 > num2) {
			if (num1 > num3) {
				max = num1;
			} else {
				max = num3;
			}
		} else {
			if (num2 > num3) {
				max = num2;
			} else {
				max = num2;
			}
		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
	}

}
