package day06_20220411;

import java.util.Scanner;

public class Ex03_ArrayExample {

	public static void main(String[] args) {
		// 크기가 5인 정수형 배열을 선언하고
		// 스캐너로 값을 배열에 저장해서 합계,평균 계산

		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력: ");
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		int avg = sum / intArray.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
	}

}
