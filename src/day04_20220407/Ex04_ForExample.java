package day04_20220407;

import java.util.Scanner;

public class Ex04_ForExample {

	public static void main(String[] args) {
		// 시작값, 끝값 입력받아서 그 사이 수들 합

		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num1 = 0;
		int num2 = 0;
		System.out.print("시작값: ");
		num1 = scan.nextInt();
		System.out.print("끝값: ");
		num2 = scan.nextInt();

		for (int i = num1; i <= num2; i++) {
			sum += i;
			System.out.print(i);
			if (i < num2) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.println(sum);
		System.out.println(num1 + "부터 " + num2 + "까지의 합은 " + sum + "입니다.");

	}

}
