package day04_20220407;

public class Ex05_ForExample {

	public static void main(String[] args) {
		// 1���� 100������ ���� �߿��� 3�� ����� ���

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		for (int i = 3; i <= 100; i += 3) {
			System.out.println(i);
		}
	}

}
