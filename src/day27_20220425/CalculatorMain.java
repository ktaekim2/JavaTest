package day27_20220425;

public class CalculatorMain {

	public static void main(String[] args) {
		// add1 �޼��� ȣ��
		Calculator calculator = new Calculator();
		// ������ �ִ� �޼��带 ȣ���� �� ȣ�� ��� ó���� ���� �ڵ� �ʿ�
		int result = calculator.add1();
		System.out.println(result);
		
		// add2 �޼��� ȣ��
		result = calculator.add2(121, 79);
		System.out.println(result);
		
		int num1 = 10;
		int num2 = 20;
		result = calculator.add2(num1, num2);
		System.out.println(result);
		
		// add3 �޼��� ȣ��
		calculator.add3();

		// add4 �޼��� ȣ��
		calculator.add4(10, 21);
		
		// add5 �޼��� ȣ��
		String strResult = calculator.add5();
		System.out.println(strResult);
		
		// add6 �޼��� ȣ��
		strResult = calculator.add6("�̰Թ���", 55);
		System.out.println(strResult);
		
		// add7 �޼��� ȣ��
		boolean boolResult = calculator.add7(5, 6);
		System.out.println(boolResult);
	}

}
