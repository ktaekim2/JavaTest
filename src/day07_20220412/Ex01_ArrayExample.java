package day07_20220412;

import java.util.Scanner;

public class Ex01_ArrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		 // "scan"�̶�� ��ü�� �����ؼ� ��ǻ�� �޸� �ڿ��� �� "Scanner"�� �����ϴ°� �ƴϰ� �ʿ��� �� ��� �����.
		 // main �޼��� ������ ���� "scan.close();"�� ���� �� ����.
		
		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		int input = 0;

		while (true) {
			System.out.print("����: ");
			input = scan.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (num[i] == input) {
					System.out.println(input + "�� " + i + "�� �ε����� �ֽ��ϴ�.");
				}

			}
		}
		
	}

}
