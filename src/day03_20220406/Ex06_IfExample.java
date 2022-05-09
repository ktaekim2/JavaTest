package day03_20220406;

import java.util.Scanner;

public class Ex06_IfExample {

	public static void main(String[] args) {
		// 서로 다른 3개의 정수를 입력 받아서 가장 큰 수 출력

		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.print("첫번째 정수 입력: ");
		num1 = scan.nextInt();
		System.out.print("두번째 정수 입력: ");
		num2 = scan.nextInt();
		System.out.print("세번째 정수 입력: ");
		num3 = scan.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수는 " + num1 + "입니다.");
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수는 " + num2 + "입니다.");
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println("가장 큰 수는 " + num3 + "입니다.");
		}

		if (num1 > num2 && num1 > num3) {
			System.out.println("가장 큰 수는 " + num1 + "입니다.");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("가장 큰 수는 " + num2 + "입니다.");
		} else {
			System.out.println("가장 큰 수는 " + num3 + "입니다.");
		}

		// 전역변수 사용
		
		int max = 0; // 최대값을 담는 변수
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
		System.out.println("가장 큰 수는 " + max + "입니다.");
	}

}
