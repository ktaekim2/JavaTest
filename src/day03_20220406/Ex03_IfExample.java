package day03_20220406;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		// 학점 계산하기

		Scanner scan = new Scanner(System.in);
		int score = 0;
		System.out.print("점수입력: ");
		score = scan.nextInt();

		if (score > 100 || score < 0) {
			System.out.println("입력범위를 초과하였습니다.");
		} else if (score >= 90) {
			System.out.println("A학점 입니다.");
		} else if (score >= 80) {
			System.out.println("B학점 입니다.");
		} else if (score >= 70) {
			System.out.println("C학점 입니다.");
		} else if (score >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}

		// print 메서드를 딱 3개

		if (score >= 0 && score <= 100) {
			String grade = "";
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println(grade + "학점 입니당.");
		} else {
			System.out.println("입력범위를 초과하였습니당.");
		}

		// 
		
		String grade1;
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				grade1 = "A";
			} else if (score >= 80) {
				grade1 = "B";
			} else if (score >= 70) {
				grade1 = "C";
			} else if (score >= 60) {
				grade1 = "D";
			} else {
				grade1 = "F";
			}

		} else {
			System.out.println("입력범위를 초과하였습니당.");
			grade1 = "";
		}
		System.out.println(grade1 + "학점 입니당.");

		/*
		 * 컴파일러는 모든 경우의 수를 계산하기 때문에 grade1 초기값을
		 * 주지 않으면 오류가 난다.
		 */
	}
}
