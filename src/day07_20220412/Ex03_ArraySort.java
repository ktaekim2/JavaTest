package day07_20220412;

import java.util.Arrays;

public class Ex03_ArraySort {

	public static void main(String[] args) {

		// 정렬 전: 32154
		// 정렬 후: 12345

		int[] numbers = { 3, 2, 1, 5, 4 };
		int temp = 0;

		System.out.print("정렬전: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
		System.out.println("\n");

		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;
				}
			}
		}
		System.out.print("정렬후: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	}

}
