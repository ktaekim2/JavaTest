package day05_20220408;

import java.util.Scanner;

public class Ex01_ForExample {

	public static void main(String[] args) {

		// 4x + 5y = 60을 만족하는 x, y? (x, y는 1 ~ 10의 정수)

		Scanner scan = new Scanner(System.in);
		int x, y = 0;

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				if ((4 * x) + (5 * y) == 60) {
					System.out.println(x + "," + y);
				}
			}
		}
	}

}
