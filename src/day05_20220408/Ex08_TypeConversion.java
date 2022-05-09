package day05_20220408;

public class Ex08_TypeConversion {

	public static void main(String[] args) {
		double num1 = 1.234;
		int num2 = 10;
		num2 = (int) num1; // int로 강제형변환
		System.out.println(num2); // 1
		
		double num3 = 2.334;
		int num4 = 5;
		num3 = num4; // double로 자동형변환
		System.out.println(num3);
	}

}
