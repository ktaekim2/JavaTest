package day05_20220408;

import java.util.Scanner;

public class Ex06_WhileExample {
	// ��� ����
	// ����� Ŭ�������� �����Ѵ�.
	static final String ANSWER = "����"; // ������ �빮��

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("�޼����� �Է��ϼ���.");
		System.out.println("���α׷��� �����Ϸ��� '����'�� �Է��ϼ���.");
		String inputString = "";
//		final String answer = "����"; // final: ������ ���� �Ұ�
		boolean run = true;
		do {
			System.out.println(">");
			inputString = scan.nextLine();
			System.out.println(inputString);
			if (inputString.equals(ANSWER)) {
				run = false;
			}
		} while (run);
	}

}
