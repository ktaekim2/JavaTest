package day02_20220405;

import java.util.Scanner;

public class Ex07_Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.print("정수입력: ");
		num1 = scan.nextInt();
		System.out.print("정수입력: ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("입력받은 두 정수의 합은 '" + result + "' 입니다.");
		
	}

}
