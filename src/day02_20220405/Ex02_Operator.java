package day02_20220405;

public class Ex02_Operator {

	public static void main(String[] args) {

		// ���������

		int num1 = 7;
		int num2 = 3;

		System.out.println("num1 + num2 = " + (num1 + num2)); // 10
		System.out.println("num1 + num2 = " + num1 + num2); // 73(��ȣ�� ��� "+"�� �����ڰ� �ƴ� �����ڷ� �ν�)
		System.out.println("num1 - num2 = " + (num1 - num2)); // 4
		System.out.println("num1 * num2 = " + (num1 * num2)); // 21
		System.out.println("num1 / num2 = " + (num1 / num2)); // 2
		System.out.println("num1 % num2 = " + (num1 % num2)); // 1

		int result = 0;
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);

		String str1 = "�ȳ��ϼ���. ";
		String str2 = "�ݰ����ϴ�. ";
		String str3 = str1 + str2;
		System.out.println(str3);
		str3 = str1 + "^^" + str2;
		System.out.println(str3);

		// String Ŭ�������� �����ϴ� length() �޼��� ȣ��

		System.out.println(str1.length()); // 7(���� ����)
		System.out.println(str2.length()); // 7
		System.out.println(str3.length()); // 16
		
		
	}

}
