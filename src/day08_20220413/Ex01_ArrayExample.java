package day08_20220413;

import java.util.Scanner;

public class Ex01_ArrayExample {

	public static void main(String[] args) {

		// 배열 크기 정하기

		int[] numbers = new int[5];

		// 다른 방법

		int[] numbers1 = null;
		numbers1 = new int[5];
		System.out.println(numbers1.length);

		// 스캐너로 입력받은 값으로 배열 크기 지정하기

		Scanner scan = new Scanner(System.in);

		int size = 0;
		
		int[] numbers2 = null; // 밖에
		
		size = scan.nextInt();
		numbers2 = new int[size];
		System.out.println(numbers2.length);

	}

}
