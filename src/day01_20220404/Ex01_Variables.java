package day01_20220404;

public class Ex01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// var num = 10;
		// const num1 = 20;
		// let num2 = 30;
		// num3 = 10;
		// Ÿ�� ������ = ������;
		// Ÿ��: �������� ����
		/*
		 * ����: ����(int, long), �Ǽ�(float, double)
		 * ����: �ѱ���(char), ����(String)
		 * ��: ��(true), ����(false) (boolean)
		 */
		
		// ������(int) ���� num�� �����Ͽ� num�� 10�� ����.
		// Ÿ�� �����̸� = ������;
		
		int num = 10;
		// ������ ��� �� ���
		System.out.println(num);
		System.out.println("num");
		// num�� 100�� �����ϱ�
		num = 100; // �ϳ��� �ڵ�� �ȿ��� �Ȱ��� �̸��� ������ �� ���� �ȵ�
		int num2 = 200; // num2�� �������� �ʰ� ���� �����Ϸ� �ؼ� ����
		System.out.println(num);
		System.out.println(num2);
		
		// long Ÿ�� ����
		long long1 = 100L;
		System.out.println(long1);
		
		// float(4byte) f, double(8byte)
		
		// char, String
		char char1 = 'a'; // ������ �ѱ���, �̱�����
		System.out.println(char1);
		String str1 = "�ȳ��ϼ���. ����� �ƹ��ų� �� ����";
		System.out.println(str1);
		
		//boolean
		boolean bool1 = true;
		boolean bool2 = false;
		
		// int, long, float, double, boolean, char: �⺻�� Ÿ��
		// String: ������ Ÿ��
	}

}
