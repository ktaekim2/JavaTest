package day05_20220408;

public class Ex05_WhileExample {

	public static void main(String[] args) {
		// while���� �̿��Ͽ� 1�γ� 10������ �հ� ���
		// �� ���� 1+2+3+...+10 = 55 ���

		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);

		int j = 1;
		int sum1 = 0;

		while (j <= 10) {
			System.out.print(j);
			if (j != 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
			sum1 += j;
			j++;
		}
		System.out.println(sum1);
	}

}
