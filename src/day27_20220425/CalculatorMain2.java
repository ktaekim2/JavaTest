package day27_20220425;

import java.util.Scanner;

public class CalculatorMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator2 cal2 = new Calculator2();

//      1. 프로그램을 실행하면 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료 선택창이 출력됨 (while 문 활용)
//      2. 각 메서드 정의에 맞게 호출하여 결과를 출력한다. 
//      1. 덧셈 메서드 sum 호출  
//      2. 뺄셈 메서드 subtraction 호출 
//      3. 곱셈 메서드 multiplication 호출 
//      4. 나눗셈 메서드 division 호출

		boolean run = true;
		int select = 0, num1 = 0, num2 = 0;

		while (run) {
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.종료");
			System.out.print("원하는 번호 입력: ");
			select = scan.nextInt();

			if (select == 1) {
				System.out.print("첫번째 숫자: ");
				num1 = scan.nextInt();
				System.out.print("두번째 숫자: ");
				num2 = scan.nextInt();
				System.out.print("결과: ");
				cal2.sum(num1, num2);
			} else if (select == 2) {
				System.out.print("첫번째 숫자: ");
				num1 = scan.nextInt();
				System.out.print("두번째 숫자: ");
				num2 = scan.nextInt();
				System.out.print("결과: ");
				cal2.sub(num1, num2);
			} else if (select == 3) {
				System.out.print("첫번째 숫자: ");
				num1 = scan.nextInt();
				System.out.print("두번째 숫자: ");
				num2 = scan.nextInt();
				System.out.println("결과: " + cal2.mul(num1, num2));
			} else if (select == 4) {
				System.out.println("결과: " + cal2.div());
			} else if (select == 5) {
				System.out.println("종료");
				run = false;
			} else {
				System.out.println("번호입력 오류");
			}
		}
	}

}
