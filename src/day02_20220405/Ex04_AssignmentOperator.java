package day02_20220405;

public class Ex04_AssignmentOperator {

	public static void main(String[] args) {

		// 대입연산자

		int num1 = 7;
		int num2 = 3;

		System.out.println(num1 + ", " + num2); // 7, 3
		
		num1 += num2;
		System.out.println(num1 + ", " + num2); // 10, 3
		
		num1 -= num2;
		System.out.println(num1 + ", " + num2); // 7, 3
		
		num1 *= num2;
		System.out.println(num1 + ", " + num2); // 21, 3
		
		num1 /= num2;
		System.out.println(num1 + ", " + num2); // 7, 3
		
		num1 %= num2;
		System.out.println(num1 + ", " + num2); // 1, 3
		
		
	}

}
