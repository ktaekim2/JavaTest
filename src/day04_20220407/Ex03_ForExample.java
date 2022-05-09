package day04_20220407;

public class Ex03_ForExample {

	public static void main(String[] args) {

		// 1부터 10까지 합계 구하기

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 출력 결과를 "1+2+3+4+5+6+7+8+9+10=55"가 나오도록 하세요.

		int sum1 = 0;
		for (int i = 1; i <= 10; i++) {
			sum1 += i;
		}
		System.out.print("1+2+3+4+5+6+7+8+9+10=");
		System.out.println(sum1);
//		------------------------------------------------------------
		int sum2 = 0;
		for (int i = 1; i <= 10; i++) {
			sum2 += i;
			if (i < 10) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
		}
		System.out.println(sum2);
//		------------------------------------------------------------
		int sum3 = 0;
		for (int i = 1; i <= 10; i++) {
			sum3 += i;
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.println(sum3);
	}

}
