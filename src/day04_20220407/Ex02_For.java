package day04_20220407;

public class Ex02_For {

	public static void main(String[] args) {

		int i = 0;
		for (i = 0; i <= 3; i++) {
			System.out.println(i);
		}
		System.out.println("반복문 종료 후 i: " + i); // 4
		// 반복문 안에서 "i = 4"에서 조건식에 "false"되면서 빠져나왔으므로.

		// 반복횟수를 정할 때
		for (i = 1; i <= 3; i++) {
			System.out.println("안녕하세요");
		}
		
	}

}
