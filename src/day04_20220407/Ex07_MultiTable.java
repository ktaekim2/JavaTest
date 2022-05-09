package day04_20220407;

public class Ex07_MultiTable {

	public static void main(String[] args) {

		// ±¸±¸´Ü

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i + "x" + j + "=" + (i * j));
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}

}
