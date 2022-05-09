package day02_20220405;

import java.util.Scanner;

public class Ex06_ScannerExample {
	public static void main(String[] args) {

		// 스캐너
		// 스캐너 객체를 선언해야 스캐너 사용 가능
		Scanner scan = new Scanner(System.in);
		// "Scanner"객체의 이름을 scan으로
		// "new"는 새로운 객체를 만든다는 의미
		// "(System.in)"은 생성자

		int num1 = 0;
		System.out.println(num1);

		// 스캐너를 이용하여 num1에 값을 대입
		System.out.print("숫자를 입력해주세요: "); // "print" 메서드는 내용 출력 후 줄바꿈을 안함
		num1 = scan.nextInt(); // Scanner 클래스의 nextInt() 메서드 호출...해서 num1에 담겠다.
		System.out.println(num1);
		// 콘솔창에 숫자를 쓰면 "scan.nextInt()"부분이 그 숫자로 되어 num1에 대입함.

		// 중간에 nextLine()을 한 번 호출해서 refresh
		scan.nextLine();

		String str1 = "";
		System.out.print("이름을 입력해주세요: ");
		str1 = scan.nextLine(); // "next()"는 띄어쓰기(공백) 이후는 버림(끝났다고 판단). 그래서 "nextLine()" 사용
		System.out.println(str1);

	}
}
