package day06_20220411;

public class Ex02_Array {

	public static void main(String[] args) {

		// �迭: ���� ���� �����͸� ���� �� �ִ� ��ü

		// �迭 ��ü�� ����
		int[] number = null;
		int number1[] = null;
		int[] number3;
		double[] number2 = null;
		String[] strArray = null;

		// �ʱ갪�� ���� �迭 ��ü ����
		int[] intArray = { 1, 7, 9, 4, 5 };
		// intArray �迭�� 2�� �ε����� ����� �� ���
		System.out.println(intArray[2]);
		// intArray �迭�� 2�� �ε����� ����� �� ���
		System.out.println(intArray[4]);

		// intArray[3]�� ����� �����͸�
		// ������ ���� num1�� �����ϰ� num1�� ����� �����͸� ���

		int num1 = 0;
		num1 = intArray[3];
		System.out.println(num1);

		// intArray[2]�� 10�� ����
		System.out.println(intArray[2]);
		intArray[2] = 10;
		System.out.println(intArray[2]);

		// �迭 ũ�� Ȯ��(�迭�� �����Ͱ� �� �� �ִ���)
		System.out.println(intArray.length);

		// �迭�� ũ�⸦ ����
		int[] intArray1 = new int[3];
		// ��ü ���� �� new ��. �����ص� java�� ���ִ� ��찡 ����.
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		// �⺻������ "0"�� ä�� ����.

		double[] doubleArray2 = new double[3];
		System.out.println(doubleArray2[0]);
		System.out.println(doubleArray2[1]);
		System.out.println(doubleArray2[2]);

		// �迭�� ������ �����͸� �ְų� ����� ������ �����.
		// "int[] intArray2 = null;" ������

		// 23, 11 351, 99�� ����� ������ �迭�� �����ϰ� �� �迭�� ����� ���� for���� �̿��ؼ� ���

		int[] intArray3 = { 23, 11, 351, 99 };

		for (int i = 0; i < intArray3.length; i++) {
			System.out.println(intArray3[i]);
		}

		// �ٸ� ���

		int[] intArray4 = new int[4];
		intArray4[0] = 23;
		intArray4[1] = 11;
		intArray4[2] = 351;
		intArray4[3] = 99;

		for (int j = 0; j < 4; j++) {
			System.out.println(intArray4[j]);
		}

//		int[] intArray5 = null;
//		intArray5[0] = 23;
//		System.out.println(intArray5[0]);
		// ũ�⸦ �������� �ʾұ� ������ error

		// ������ ����, ��հ�

		int[] intArray5 = { 23, 11, 351, 99 };
		int sum = 0;

		for (int k = 0; k < intArray3.length; k++) {
			sum += intArray5[k];
			System.out.println(intArray5[k]);
		}
		int avg = sum / intArray5.length;

		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
	}

}
