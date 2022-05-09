package day05_20220408;

import java.util.Scanner;

public class Ex11_WhileExample {

	public static void main(String[] args) {
		// 1부터 100까지의 숫자를 입력해서 up&down

		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num = 0;
		int count = 0;
		int randomN = (int) (Math.random() * 100) + 1;
		while (run) {
			System.out.print("1부터 100까지의 숫자를 입력하세요: ");
			num = scan.nextInt();
			if (num < randomN) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (num > randomN) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				run = false;
			}
			count++;
		}
		System.out.println("맞췄습니다.\n시도 횟수는 " + count + "회 입니다.");
	}

}
