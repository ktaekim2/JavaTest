package day02_20220405;

import java.util.Scanner;

public class Ex07_Calculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.print("�����Է�: ");
		num1 = scan.nextInt();
		System.out.print("�����Է�: ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("�Է¹��� �� ������ ���� '" + result + "' �Դϴ�.");
		
	}

}
