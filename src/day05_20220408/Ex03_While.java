package day05_20220408;

public class Ex03_While {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("for ����");
			System.out.println(i);
		}

		// while���� �̿��Ͽ� 1���� 3���� ����ϱ�

		int j = 1;
		while (j <= 3) {
			System.out.println(j);
			j++;
		}
		System.out.println("while�� ���� �� " + j);
		// ���� ������ �Ἥ �Ӹ��� �����Ϸ��� �Ẹ��

		// do while�� �ݺ������� �������� �ʾƵ� �ݺ� �ڵ� ����� �� ���� ������.
		int k = 4;
		do {
			System.out.println("do while ����");
			System.out.println(k);
			k++;
		} while (k <= 3);

	}

}
