package day33_20220503_02;

public class LottoMain {

	public static void main(String[] args) {
		boolean run = true;
		int[] lottoArray = new int[6];
		while (run) {
			int lotto = (int) (Math.random() * 45) + 1;
			if (lottoArray[5] != 0) {
				break;
			} else {
				for (int i = 0; i < lottoArray.length; i++) {
					if (lottoArray[i] == lotto) {
						continue;
					} else if (lottoArray[i] == 0) {
						lottoArray[i] = lotto;
					}
				}
			}
		}
		for (int i : lottoArray) {
			System.out.print(i + " ");
		}

	}

}
