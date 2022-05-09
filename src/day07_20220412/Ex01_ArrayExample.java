package day07_20220412;

import java.util.Scanner;

public class Ex01_ArrayExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		 // "scan"이라는 객체를 선언해서 컴퓨터 메모리 자원을 씀 "Scanner"는 저장하는게 아니고 필요할 때 잠시 사용함.
		 // main 메서드 끝나기 전에 "scan.close();"로 끝낼 수 있음.
		
		int num[] = { 5, 2, 1, 3, 4, 7, 6, 9, 10, 8 };
		int input = 0;

		while (true) {
			System.out.print("숫자: ");
			input = scan.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (num[i] == input) {
					System.out.println(input + "는 " + i + "번 인덱스에 있습니다.");
				}

			}
		}
		
	}

}
