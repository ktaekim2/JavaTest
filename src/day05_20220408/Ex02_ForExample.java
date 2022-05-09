package day05_20220408;

import java.util.Scanner;

public class Ex02_ForExample {

	public static void main(String[] args) {

		// 어떤 정수를 하나 입력 받아서
		// 1부터 입력받은 정수까지의 정수 중에서
		// 2의 배수, 3의 배수를 제외한 정수의 총 합을 출력

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
