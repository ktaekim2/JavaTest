package day05_20220408;

public class Ex03_While {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("for 내부");
			System.out.println(i);
		}

		// while문을 이용하여 1부터 3까지 출력하기

		int j = 1;
		while (j <= 3) {
			System.out.println(j);
			j++;
		}
		System.out.println("while문 종료 후 " + j);
		// 직접 손으로 써서 머리를 컴파일러로 써보기

		// do while은 반복조건을 만족하지 않아도 반복 코드 블록을 한 번은 실행함.
		int k = 4;
		do {
			System.out.println("do while 내부");
			System.out.println(k);
			k++;
		} while (k <= 3);

	}

}
