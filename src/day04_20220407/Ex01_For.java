package day04_20220407;

public class Ex01_For {

	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		
//		int num = 1;
//		System.out.println(num);
//		num = 2;
//		System.out.println(num);
//		num = 3;
//		System.out.println(num);
//		num = 4;
//		System.out.println(num);
//		num = 5;
//		System.out.println(num);

		System.out.println("for문 시작 전");
		for (int i = 1; i <= 3; i++) {
			System.out.println(i); // 1 2 3
		}
		for (int i = 1; i < 3; i++) {
			System.out.println(i); // 1 2, "i=3"되었을 때 범위를 벗어나서 반복문 종료.
		}
		for (int i = 1; i == 3; i++) {
			System.out.println(i); // 출력 없음, 초기값이 "1"인데, "i == 3"이 조건식이라, 출력이 없음.
		}
		for (int i = 1; i >= 3; i++) {
			System.out.println(i); // 출력 없음, 초기값이 "i = 1"인데, 조건식이 "i >= 3"이라 범위에 해당 안해 반복문 종료.
		}
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		for (int i = 1; i <= 10; i+=2) {
			System.out.println(i);
		}
		
		
		System.out.println("for문 시작 후");

	}

}
