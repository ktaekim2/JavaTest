package day02_20220405;

public class Ex01_Variables2 {

	public static void main(String[] args) {

		int int1 = 55;
		System.out.println("int값: " + int1); // println method 안에서 "+"는 연결의 역할
		int1 = 35;
		System.out.println(int1);
		int int2 = 10;	// yellow line: 선언 해놓고 왜 안써?

		long long1 = 1234L;
		System.out.println(long1);
		long1 = 999999;
		System.out.println(long1);

		float float1 = 0.123f;
		System.out.println(float1);
		float1 = 0.343f;
		System.out.println(float1);

		double double1 = 0.3934;
		System.out.println(double1);
		double1 = 0.49458;
		System.out.println(double1);

		String str1 = "졸림";
		System.out.println(str1);
		str1 = "잠깸";
		System.out.println(str1);

	}

}
