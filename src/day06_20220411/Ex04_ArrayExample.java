package day06_20220411;

import java.util.Scanner;

public class Ex04_ArrayExample {

	public static void main(String[] args) {

		// 크기가 5인 정수형 배열을 선언하고
		// 스캐너로 값을 받은 뒤
		// 입력받은 값 중에서 가장 큰 값을 출력

		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		int max = 0;

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + 1 + "번째 숫자 입력: ");
			intArray[i] = scan.nextInt();

			if (intArray[0] > intArray[1]) {
				if (intArray[0] > intArray[2]) {
					if (intArray[0] > intArray[3]) {
						if (intArray[0] > intArray[4]) {
							max = intArray[0];
						} else {
							max = intArray[4];
						}
					} else {
						if (intArray[3] > intArray[4]) {
							max = intArray[3];
						} else {
							max = intArray[4];
						}
					}
				} else {
					if (intArray[2] > intArray[3]) {
						if (intArray[2] > intArray[4]) {
							max = intArray[2];
						} else {
							max = intArray[4];
						}
					} else {
						if (intArray[3] > intArray[4]) {
							max = intArray[3];
						} else {
							max = intArray[4];
						}
					}
				}
			} else {
				if (intArray[1] > intArray[2]) {
					if (intArray[1] > intArray[3]) {
						if (intArray[1] > intArray[4]) {
							max = intArray[1];
						} else {
							max = intArray[4];
						}
					} else {
						if (intArray[3] > intArray[4]) {
							max = intArray[3];
						} else {
							max = intArray[4];
						}
					}
				} else if (intArray[2] > intArray[3]) {
					if (intArray[2] > intArray[4]) {
						max = intArray[2];
					} else {
						max = intArray[4];
					}
				} else {
					if (intArray[3] > intArray[4]) {
						max = intArray[3];
					} else {
						max = intArray[4];
					}
				}
			}

		}
		System.out.println("가장 큰 수는 " + max + "입니다.");

	}
}
