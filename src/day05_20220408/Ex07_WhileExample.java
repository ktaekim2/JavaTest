package day05_20220408;

import java.util.Scanner;

public class Ex07_WhileExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		int count = 0;
		boolean run = true;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요: ");
		do {
			num = scan.nextInt();
			if (num == 0) {
				run = false;
			} else {
				count++;
				sum += num;
			}
		} while (run);
		System.out.println("입력한 수는 " + count + "개 입니다.");
		System.out.println("총합은 " + sum + "입니다.");
		System.out.println("평균은 " + sum / count + "입니다.");

		// 정수끼리 나눗셈 하고 double 타입에 결과를 대입(자동형변환)
		double avg1 = sum / count;
		System.out.println("평균은 " + avg1 + "입니다.");

		//
		double avg2 = (double) sum / count;
		System.out.println("평균은 " + avg2 + "입니다.");
	}

}
