package day07_20220412;

import java.util.Arrays;

public class Ex03_ArraySort {

	public static void main(String[] args) {

		// ���� ��: 32154
		// ���� ��: 12345

		int[] numbers = { 3, 2, 1, 5, 4 };
		int temp = 0;

		System.out.print("������: ");
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
		System.out.print("������: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
		}
	}

}
