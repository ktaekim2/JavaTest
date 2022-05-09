package day01_20220404;

public class Ex01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var num = 10;
		// const num1 = 20;
		// let num2 = 30;
		// num3 = 10;
		// 타입 변수명 = 변수값;
		// 타입: 변수값의 종류
		/*
		 * 숫자: 정수(int, long), 실수(float, double)
		 * 문자: 한글자(char), 문장(String)
		 * 논리: 참(true), 거짓(false) (boolean)
		 */
		
		// 정수형(int) 변수 num을 선언하여 num에 10을 저장.
		// 타입 변수이름 = 변수값;
		
		int num = 10;
		// 변수에 담긴 값 출력
		System.out.println(num);
		System.out.println("num");
		// num에 100을 대입하기
		num = 100; // 하나의 코드블럭 안에서 똑같은 이름의 변수를 또 선언 안됨
		int num2 = 200; // num2를 선언하지 않고 값을 대입하려 해서 오류
		System.out.println(num);
		System.out.println(num2);
		
		// long 타입 변수
		long long1 = 100L;
		System.out.println(long1);
		
		// float(4byte) f, double(8byte)
		
		// char, String
		char char1 = 'a'; // 오로지 한글자, 싱글쿼터
		System.out.println(char1);
		String str1 = "안녕하세요. 여기는 아무거나 다 들어가요";
		System.out.println(str1);
		
		//boolean
		boolean bool1 = true;
		boolean bool2 = false;
		
		// int, long, float, double, boolean, char: 기본형 타입
		// String: 참조형 타입
	}

}
