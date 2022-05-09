package day05_20220408;

public class Ex04_While {

	public static void main(String[] args) {
		// i가 10이라는 값을 가질 때 반복문 종료

		boolean run = true;
		int i = 0;
		while (run) {
			System.out.println(i);
			if (i == 10) {
				run = false;
			}
			i++;
		} System.out.println("끝" + i); // 11
	}

}
