package day03_20220406;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		// 합격, 불합격 출력하기

		Scanner scan = new Scanner(System.in);
		int level = 0;
		int score = 0;
		System.out.print("학년입력: ");
		level = scan.nextInt();
		System.out.print("점수입력: ");
		score = scan.nextInt();

		if (level < 4) {
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			if (score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}

		// &&써서

		if (level < 4 && score >= 60) {
			System.out.println("합격");
		} else if (level == 4 && score >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");

		}
		
		// score를 구분점으로 사용
		
		if (score >= 60) {
			if (level != 4) {
				System.out.println("합격");
			} else if (score >= 70) {
				System.out.println("합격");
			}
		} else {
			System.out.println("불합격");
		}
	}

}
