package day02_20220405;

import java.util.Scanner;

public class Ex06_ScannerExample {
	public static void main(String[] args) {

		// ��ĳ��
		// ��ĳ�� ��ü�� �����ؾ� ��ĳ�� ��� ����
		Scanner scan = new Scanner(System.in);
		// "Scanner"��ü�� �̸��� scan����
		// "new"�� ���ο� ��ü�� ����ٴ� �ǹ�
		// "(System.in)"�� ������

		int num1 = 0;
		System.out.println(num1);

		// ��ĳ�ʸ� �̿��Ͽ� num1�� ���� ����
		System.out.print("���ڸ� �Է����ּ���: "); // "print" �޼���� ���� ��� �� �ٹٲ��� ����
		num1 = scan.nextInt(); // Scanner Ŭ������ nextInt() �޼��� ȣ��...�ؼ� num1�� ��ڴ�.
		System.out.println(num1);
		// �ܼ�â�� ���ڸ� ���� "scan.nextInt()"�κ��� �� ���ڷ� �Ǿ� num1�� ������.

		// �߰��� nextLine()�� �� �� ȣ���ؼ� refresh
		scan.nextLine();

		String str1 = "";
		System.out.print("�̸��� �Է����ּ���: ");
		str1 = scan.nextLine(); // "next()"�� ����(����) ���Ĵ� ����(�����ٰ� �Ǵ�). �׷��� "nextLine()" ���
		System.out.println(str1);

	}
}
