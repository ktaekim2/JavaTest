package day03_20220406;

import java.util.Scanner;

public class Ex04_IfExample {

	public static void main(String[] args) {
		// 3 또는 5 또는 3과5의 배수인지 아닌지를 출력
		// 음수의 경우 출력

		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("정수입력: ");
		num = scan.nextInt();

		if (num < 0) {
			System.out.println("0보다 큰 수를 입력하세요.");
		} else {
			if (num % 15 == 0) {
				System.out.println("'3'과 '5'의 배수");
			} else if (num % 3 == 0) {
				System.out.println("'3'의 배수");
			} else if (num % 5 == 0) {
				System.out.println("'5'의 배수");
			} else {
				System.out.println("'3'과 '5'의 배수가 아닙니다.");
			}
		}
		
		
	}

}
