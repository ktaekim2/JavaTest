package day02_20220405;

public class Ex03_CompareOperator {

	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 7;

		boolean result = false; // boolean은 변수 선언 시 관행으로 false를 초기값으로 함.
		result = num1 < num2;
		System.out.println(result);
		result = num1 <= num2;
		System.out.println(result);
		result = num1 > num2;
		System.out.println(result);
		result = num1 >= num2;
		System.out.println(result);
		result = num1 == num2;
		System.out.println(result);
		result = num1 != num2;
		System.out.println(result);
		
		
	}

}
