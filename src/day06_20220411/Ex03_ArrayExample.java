package day06_20220411;

import java.util.Scanner;

public class Ex03_ArrayExample {

	public static void main(String[] args) {
		// ũ�Ⱑ 5�� ������ �迭�� �����ϰ�
		// ��ĳ�ʷ� ���� �迭�� �����ؼ� �հ�,��� ���

		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է�: ");
			intArray[i] = scan.nextInt();
			sum += intArray[i];
		}
		int avg = sum / intArray.length;
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
		
	}

}
