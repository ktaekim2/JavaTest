package day05_20220408;

public class Ex10_WhileExample {

	public static void main(String[] args) {
		// �ֻ����� ������ 6�� ������ �����ϴ� ���α׷��� while�� �ۼ�
		boolean run = true;
		while (run) {
			int randomNumber = (int) (Math.random() * 6) + 1;
			if (randomNumber == 6) {
				run = false;
				System.out.print(randomNumber + "�� ���ͼ� �����մϴ�.");
			} else {
				System.out.println(randomNumber);
			}
		}

	}

}
