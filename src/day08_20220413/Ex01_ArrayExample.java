package day08_20220413;

import java.util.Scanner;

public class Ex01_ArrayExample {

	public static void main(String[] args) {

		// �迭 ũ�� ���ϱ�

		int[] numbers = new int[5];

		// �ٸ� ���

		int[] numbers1 = null;
		numbers1 = new int[5];
		System.out.println(numbers1.length);

		// ��ĳ�ʷ� �Է¹��� ������ �迭 ũ�� �����ϱ�

		Scanner scan = new Scanner(System.in);

		int size = 0;
		
		int[] numbers2 = null; // �ۿ�
		
		size = scan.nextInt();
		numbers2 = new int[size];
		System.out.println(numbers2.length);

	}

}
