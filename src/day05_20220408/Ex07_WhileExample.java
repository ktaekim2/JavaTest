package day05_20220408;

import java.util.Scanner;

public class Ex07_WhileExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int count = 0;
		boolean run = true;
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���: ");
		do {
			num = scan.nextInt();
			if (num == 0) {
				run = false;
			} else {
				count++;
				sum += num;
			}
		} while (run);
		System.out.println("�Է��� ���� " + count + "�� �Դϴ�.");
		System.out.println("������ " + sum + "�Դϴ�.");
		System.out.println("����� " + sum / count + "�Դϴ�.");

		// �������� ������ �ϰ� double Ÿ�Կ� ����� ����(�ڵ�����ȯ)
		double avg1 = sum / count;
		System.out.println("����� " + avg1 + "�Դϴ�.");

		//
		double avg2 = (double) sum / count;
		System.out.println("����� " + avg2 + "�Դϴ�.");
	}

}
