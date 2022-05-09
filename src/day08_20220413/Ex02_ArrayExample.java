package day08_20220413;

import java.util.Scanner;

public class Ex02_ArrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int select = 0;
		int count = 0;
		int[] studentArray = null;
		int max = 0;
		int sum = 0;

		while (run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����>");
			select = scan.nextInt();

			if (select == 1) {
				System.out.print("�л���>");
				count = scan.nextInt();
				studentArray = new int[count];
			} else if (select == 2) {
				for (int i = 0; i < studentArray.length; i++) {
					System.out.print(i + 1 + "�� ° �л� ����: ");
					studentArray[i] = scan.nextInt();
				}
			} else if (select == 3) {
				for (int i = 0; i < studentArray.length; i++) {
					System.out.println(i + 1 + "�� ° �л� ����: " + studentArray[i]);
				}
			} else if (select == 4) {
				for (int i = 0; i < studentArray.length; i++) {
					for (int j = i + 1; j < studentArray.length; j++) {
						if (studentArray[i] < studentArray[j]) {
							max = studentArray[j];
							studentArray[j] = studentArray[i];
							studentArray[i] = max;
						}
					}
				}
				for (int i = 0; i < studentArray.length; i++) {
					sum += studentArray[i];
				}
				int avg = sum / studentArray.length;
				System.out.println("�ְ�����: " + studentArray[0]);
				System.out.println("�������: " + avg);
				for (int i = 0; i < studentArray.length; i++) {
					System.out.println(studentArray[i]);
				}
			} else {
				run = false;
			}
		}
		System.out.println("����");
	}

}
