package day03_20220406;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num1 = 0;
		
		System.out.print("정수입력: ");
		num1 = scan.nextInt();
		
		System.out.println("입력한 정수: " + num1);
		
		if (num1 >0) {
			System.out.println("양수");
		}
		else if (num1 <0) {
			System.out.println("음수");
		} else {
			System.out.println("'0' 입니다.");
		}
	}

}

