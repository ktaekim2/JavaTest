package day02_20220405;

public class Ex05_LogicalOperator {

	public static void main(String[] args) {

		boolean bool1 = true;
		boolean bool2 = false;
		boolean result = false;
		result = bool1 && bool2;
		System.out.println(result);
		System.out.println(true && true);
		System.out.println(false && true); // and������ �� �� �ϳ��� false�� ������ ������ false�̹Ƿ� �ڴ� �� �͵� ����. dead code
		System.out.println(true && false);
		System.out.println(false && false);
		
		result = (7>=5) && (5<3);
		System.out.println(result);
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println(!bool1);
		bool1 = !bool1; // bool1�� ���� �������� bool1�� ����
		System.out.println(bool1);
	}

}
