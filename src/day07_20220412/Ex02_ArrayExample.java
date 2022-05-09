package day07_20220412;

import java.util.Scanner;

public class Ex02_ArrayExample {

	public static void main(String[] args) {
		// 편의점
		// 500 100 50 10
		// 680 거슬러 줘야

		Scanner scan = new Scanner(System.in);
		int[] coins = { 500, 100, 50, 10 };

		System.out.print("거스름돈 입력: ");
		int change = scan.nextInt();
		for (int i = 0; i < coins.length; i++) {
			System.out.println(coins[i] + "원 동전: " + change / coins[i] + "개");
			change %= coins[i];
		}

	}

}
