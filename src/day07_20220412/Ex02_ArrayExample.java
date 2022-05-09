package day07_20220412;

import java.util.Scanner;

public class Ex02_ArrayExample {

	public static void main(String[] args) {
		// ������
		// 500 100 50 10
		// 680 �Ž��� ���

		Scanner scan = new Scanner(System.in);
		int[] coins = { 500, 100, 50, 10 };

		System.out.print("�Ž����� �Է�: ");
		int change = scan.nextInt();
		for (int i = 0; i < coins.length; i++) {
			System.out.println(coins[i] + "�� ����: " + change / coins[i] + "��");
			change %= coins[i];
		}

	}

}
