package day03_20220406;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		// 짝홀 판별하기
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.print("정수입력: ");
		num = scan.nextInt();

		if (num < 0) {
			System.out.println("'0'보다 큰 수를 입력하세요.");
		} else if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		
		// && 연산을 조건식에 적용해보기

		if (num % 2 == 0 && num > 0) {
			System.out.println("짝수");
		} else if (num % 2 == 1 && num > 0) {
			System.out.println("홀수");
		} else {
			System.out.println("'0'보다 큰 수를 입력하세요.");
		}

		// 중첩 if

		if (num > 0) {
			// 0보다 큰 숫자를 가지고 홀, 짝 판
			if (num % 2 == 0) {
				System.out.println("짝수");
			} else if (num % 2 == 1) {
				System.out.println("홀수");
			}
		} else {
			System.out.println("'0'보다 큰 수를 입력하세요.");
		}

	}
}
