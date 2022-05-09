package day06_20220411;

import java.util.Scanner;

public class Ex04_ArrayExample_answer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		int max = 0;

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력: ");
			numbers[i] = scan.nextInt();
		}

		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println(max);
	}

}
