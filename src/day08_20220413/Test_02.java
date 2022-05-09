package day08_20220413;

public class Test_02 {

	public static void main(String[] args) {
		int[] num = { 3, 2, 1, 5, 4 };
		int temp = 0;

		System.out.print("정렬 전: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\n");
		System.out.print("정렬 후: ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}
	}

}
