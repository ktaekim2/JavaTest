package day05_20220408;

public class Ex08_TypeConversion {

	public static void main(String[] args) {
		double num1 = 1.234;
		int num2 = 10;
		num2 = (int) num1; // int�� ��������ȯ
		System.out.println(num2); // 1
		
		double num3 = 2.334;
		int num4 = 5;
		num3 = num4; // double�� �ڵ�����ȯ
		System.out.println(num3);
	}

}
