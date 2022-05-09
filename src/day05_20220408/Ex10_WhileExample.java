package day05_20220408;

public class Ex10_WhileExample {

	public static void main(String[] args) {
		// 주사위를 던져서 6이 나오면 종료하는 프로그램을 while로 작성
		boolean run = true;
		while (run) {
			int randomNumber = (int) (Math.random() * 6) + 1;
			if (randomNumber == 6) {
				run = false;
				System.out.print(randomNumber + "이 나와서 종료합니다.");
			} else {
				System.out.println(randomNumber);
			}
		}

	}

}
