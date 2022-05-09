package day02_20220405;

public class Ex02_Operator {

	public static void main(String[] args) {

		// 산술연산자

		int num1 = 7;
		int num2 = 3;

		System.out.println("num1 + num2 = " + (num1 + num2)); // 10
		System.out.println("num1 + num2 = " + num1 + num2); // 73(괄호가 없어서 "+"을 연산자가 아닌 연결자로 인식)
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

		String str1 = "안녕하세요. ";
		String str2 = "반갑습니다. ";
		String str3 = str1 + str2;
		System.out.println(str3);
		str3 = str1 + "^^" + str2;
		System.out.println(str3);

		// String 클래스에서 제공하는 length() 메서드 호출

		System.out.println(str1.length()); // 7(공백 포함)
		System.out.println(str2.length()); // 7
		System.out.println(str3.length()); // 16
		
		
	}

}
