package day05_20220408;

import java.util.Scanner;

public class Ex11_WhileExample {

	public static void main(String[] args) {
		// 1���� 100������ ���ڸ� �Է��ؼ� up&down

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		int count = 0;
		int randomN = (int) (Math.random() * 100) + 1;
		while (run) {
			System.out.print("1���� 100������ ���ڸ� �Է��ϼ���: ");
			num = scan.nextInt();
			if (num < randomN) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (num > randomN) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			} else {
				run = false;
			}
			count++;
		}
		System.out.println("������ϴ�.\n�õ� Ƚ���� " + count + "ȸ �Դϴ�.");
	}

}
