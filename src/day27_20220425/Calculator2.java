package day27_20220425;

import java.util.Scanner;

public class Calculator2 {

//    1. sum �޼��� 
//        1. �Ű�����: ������ ���� 2��
//        2. ����Ÿ��: ���� 
//        3. ���೻��: ���� ��� ��� 

	void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}

//    2. subtraction �޼��� 
//        1. �Ű�����: ������ ���� 2�� 
//        2. ����Ÿ��: ����
//        3. ���೻��: ���� ��� ���

	void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}

//    3. multiplication �޼��� 
//        1. �Ű�����: ������ ���� 2��
//        2. ����Ÿ��: ����
//        3. ���೻��: ������ ���� ��� ���� 

	int mul(int num1, int num2) {
		return num1 * num2;
	}

//    4. division �޼��� 
//        1. �Ű�����: ����
//        2. ����Ÿ��: ����
//        3. ���೻��: ��ĳ�ʷ� ���� 2�� �Է� �ް� ������ ��� ���� 

	int div() {
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ����: ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ����: ");
		int num2 = scan.nextInt();
		return num1 / num2;
	}

}
