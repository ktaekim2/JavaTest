package day03_20220406;

import java.util.Scanner;

public class Ex01_IfExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num1 = 0;
		
		System.out.print("�����Է�: ");
		num1 = scan.nextInt();
		
		System.out.println("�Է��� ����: " + num1);
		
		if (num1 >0) {
			System.out.println("���");
		}
		else if (num1 <0) {
			System.out.println("����");
		} else {
			System.out.println("'0' �Դϴ�.");
		}
	}

}

