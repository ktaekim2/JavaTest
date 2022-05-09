package day05_20220408;

public class Ex09_Random {

	public static void main(String[] args) {
		// Random 메서드
		// 1부터 10까지의 정수중에서 하나만 출력
		// int randomNumber = (int) (Math.random() * 끝값) +시작값;
		int randomNumber = (int) (Math.random() * 10) +1;
		System.out.println(randomNumber);
		
		System.out.println(Math.random()); // 0.0<= <1.0 실수
		System.out.println(Math.random() * 10); // 0.0<= <10.0 실수
		System.out.println((int)(Math.random() * 10)); // 0<= <10 정수
		System.out.println((int)(Math.random() * 10) + 1); // 1<= <11 정수
		System.out.println((int)(Math.random() * 100) + 1); // 1<= <101 정수
	}

}
