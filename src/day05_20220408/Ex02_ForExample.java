package day05_20220408;

import java.util.Scanner;

public class Ex02_ForExample {

	public static void main(String[] args) {

		// � ������ �ϳ� �Է� �޾Ƽ�
		// 1���� �Է¹��� ���������� ���� �߿���
		// 2�� ���, 3�� ����� ������ ������ �� ���� ���

		Scanner scan = new Scanner(System.in);
		int num = 0;
		num = scan.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
