package day05_20220408;

public class Ex04_While {

	public static void main(String[] args) {
		// i�� 10�̶�� ���� ���� �� �ݺ��� ����

		boolean run = true;
		int i = 0;
		while (run) {
			System.out.println(i);
			if (i == 10) {
				run = false;
			}
			i++;
		} System.out.println("��" + i); // 11
	}

}
