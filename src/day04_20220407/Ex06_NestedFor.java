package day04_20220407;

public class Ex06_NestedFor {

	public static void main(String[] args) {
		// ��ø for��

		System.out.println("�ٱ� for�� ���� ��");
		for (int i = 1; i <= 2; i++) {
			System.out.println("�ȱ� for�� ���� ��");
			for (int j = 1; j <= 3; j++) {
				System.out.println("i: " + i + "\t j: " + j);
			} // j ��
			System.out.println("���� for�� ��");
		} // i ��
		System.out.println("�ٱ� for�� ��");

	}

}
