package day27_20220425;

public class Calculator {
	/*
	 * 1.
	 * ����Ÿ��: int
	 * �޼����̸�: add1
	 * �Ű�����: ����
	 */
	
	int add1() {
		int num1 = 10;
		int num2 = 20;
		return num1 + num2;
	}
	
	/*
	 * 2.
	 * ����Ÿ��: int
	 * �ż����̸�: add2
	 * �Ű�����: intŸ�� 2��
	 */
	
	int add2(int num1, int num2) {
//		int sum = 0;
//		sum = num1 + num2;
//		return sum;
		
		return num1 + num2;
	}
	
	/*
	 * 3.
	 * ����Ÿ��: ����
	 * �޼����̸�: add3
	 * �Ű�����: ����
	 */
	
	void add3() {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1 + num2);
	}
	
	/*
	 * 4.
	 * ����Ÿ��: ����
	 * �޼����̸�: add4
	 * �Ű�����: int Ÿ�� 2��
	 */
	
	void add4(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/*
	 * 5.
	 * ����Ÿ��: String
	 * �޼����̸�: add5
	 * �Ű�����: ����
	 */
	
	String add5() {
		return "���η���?";
	}
	
	/*
	 * 6.
	 * ����Ÿ��: String
	 * �޼����̸�: add6
	 * �Ű�����: String 1��, int 1��
	 * ���೻��: String���� �ڿ� !!�� �߰��ؼ� ����.
	 * 			int ���� �ܼ� ��¸�.
	 */
	
	String add6(String str, int num1) {
		String result = str + "!!";
		System.out.println(num1);
		return result;
	}
	
	/*
	 * 7.
	 * ����Ÿ��: boolean
	 * �޼����̸�: add7
	 * �Ű�����: int Ÿ�� 2��
	 * ���೻��: �Ű����� 2���� ���� 10���� ũ�� true����
	 * 			10���� ������ false ����
	 */

	boolean add7(int num1, int num2) {
		int sum = num1 + num2;
		if(sum > 10) {
			return true;
		}
		else {
			return false;
		}
	}
}