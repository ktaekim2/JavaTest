package day06_20220411;

import java.util.Scanner;

public class Ex04_ArrayExample {

	public static void main(String[] args) {

		// ũ�Ⱑ 5�� ������ �迭�� �����ϰ�
		// ��ĳ�ʷ� ���� ���� ��
		// �Է¹��� �� �߿��� ���� ū ���� ���

		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5];
		int sum = 0;
		int max = 0;

		for (int i = 0; i < intArray.length; i++) {
			System.out.print(i + 1 + "��° ���� �Է�: ");
			intArray[i] = scan.nextInt();

			if (intArray[0] > intArray[1]) {
				if (intArray[0] > intArray[2]) {
					if (intArray[0] > intArray[3]) {
						if (intArray[0] > intArray[4]) {
							max = intArray[0];
						} else {
							max = intArray[4];
						}
					} else {
						if (intArray[3] > intArray[4]) {
							max = intArray[3];
						} else {
							max = intArray[4];
						}
					}
				} else {
					if (intArray[2] > intArray[3]) {
						if (intArray[2] > intArray[4]) {
							max = intArray[2];
						} else {
							max = intArray[4];
						}
					} else {
						if (intArray[3] > intArray[4]) {
							max = intArray[3];
						} else {
							max = intArray[4];
						}
					}
				}
			} else {
				if (intArray[1] > intArray[2]) {
					if (intArray[1] > intArray[3]) {
						if (intArray[1] > intArray[4]) {
							max = intArray[1];
						} else {
							max = intArray[4];
						}
					} else {
						if (intArray[3] > intArray[4]) {
							max = intArray[3];
						} else {
							max = intArray[4];
						}
					}
				} else if (intArray[2] > intArray[3]) {
					if (intArray[2] > intArray[4]) {
						max = intArray[2];
					} else {
						max = intArray[4];
					}
				} else {
					if (intArray[3] > intArray[4]) {
						max = intArray[3];
					} else {
						max = intArray[4];
					}
				}
			}

		}
		System.out.println("���� ū ���� " + max + "�Դϴ�.");

	}
}
