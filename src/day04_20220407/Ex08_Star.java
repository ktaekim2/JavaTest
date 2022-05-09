package day04_20220407;

public class Ex08_Star {

	public static void main(String[] args) {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5; j++) {
//				if (i >= j) {
//					System.out.print("*");
//				}
//			}
//			System.out.print("\n");
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
