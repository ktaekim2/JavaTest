package day06_20220411;

public class Ex02_Array {

	public static void main(String[] args) {

		// 배열: 여러 개의 데이터를 담을 수 있는 객체

		// 배열 객체만 선언
		int[] number = null;
		int number1[] = null;
		int[] number3;
		double[] number2 = null;
		String[] strArray = null;

		// 초깃값을 갖는 배열 객체 선언
		int[] intArray = { 1, 7, 9, 4, 5 };
		// intArray 배열의 2번 인덱스에 저장된 값 출력
		System.out.println(intArray[2]);
		// intArray 배열의 2번 인덱스에 저장된 값 출력
		System.out.println(intArray[4]);

		// intArray[3]에 저장된 데이터를
		// 정수형 변수 num1에 저장하고 num1에 저장된 데이터를 출력

		int num1 = 0;
		num1 = intArray[3];
		System.out.println(num1);

		// intArray[2]에 10을 저장
		System.out.println(intArray[2]);
		intArray[2] = 10;
		System.out.println(intArray[2]);

		// 배열 크기 확인(배열에 데이터가 몇 개 있느냐)
		System.out.println(intArray.length);

		// 배열의 크기를 선언
		int[] intArray1 = new int[3];
		// 객체 만들 때 new 씀. 생략해도 java가 해주는 경우가 있음.
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		// 기본값으로 "0"을 채워 넣음.

		double[] doubleArray2 = new double[3];
		System.out.println(doubleArray2[0]);
		System.out.println(doubleArray2[1]);
		System.out.println(doubleArray2[2]);

		// 배열을 쓰려면 데이터를 넣거나 사이즈를 지정해 줘야함.
		// "int[] intArray2 = null;" 에러남

		// 23, 11 351, 99가 저장된 정수형 배열을 선언하고 이 배열에 저장된 값을 for문을 이용해서 출력

		int[] intArray3 = { 23, 11, 351, 99 };

		for (int i = 0; i < intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}

		// 다른 방법

		int[] intArray4 = new int[4];
		intArray4[0] = 23;
		intArray4[1] = 11;
		intArray4[2] = 351;
		intArray4[3] = 99;

		for (int j = 0; j < 4; j++) {
			System.out.println(intArray4[j]);
		}

//		int[] intArray5 = null;
//		intArray5[0] = 23;
//		System.out.println(intArray5[0]);
		// 크기를 지정하지 않았기 때문에 error

		// 데이터 총합, 평균값

		int[] intArray5 = { 23, 11, 351, 99 };
		int sum = 0;

		for (int k = 0; k < intArray3.length; k++) {
			sum += intArray5[k];
			System.out.println(intArray5[k]);
		}
		int avg = sum / intArray5.length;

		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}

}
