package day04_20220407;

public class Ex01_For {

	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		
//		int num = 1;
//		System.out.println(num);
//		num = 2;
//		System.out.println(num);
//		num = 3;
//		System.out.println(num);
//		num = 4;
//		System.out.println(num);
//		num = 5;
//		System.out.println(num);

		System.out.println("for�� ���� ��");
		for (int i = 1; i <= 3; i++) {
			System.out.println(i); // 1 2 3
		}
		for (int i = 1; i < 3; i++) {
			System.out.println(i); // 1 2, "i=3"�Ǿ��� �� ������ ����� �ݺ��� ����.
		}
		for (int i = 1; i == 3; i++) {
			System.out.println(i); // ��� ����, �ʱⰪ�� "1"�ε�, "i == 3"�� ���ǽ��̶�, ����� ����.
		}
		for (int i = 1; i >= 3; i++) {
			System.out.println(i); // ��� ����, �ʱⰪ�� "i = 1"�ε�, ���ǽ��� "i >= 3"�̶� ������ �ش� ���� �ݺ��� ����.
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		
		System.out.println("for�� ���� ��");

	}

}
