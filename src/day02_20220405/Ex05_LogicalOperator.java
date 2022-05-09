package day02_20220405;

public class Ex05_LogicalOperator {

	public static void main(String[] args) {

		boolean bool1 = true;
		boolean bool2 = false;
		boolean result = false;
		result = bool1 && bool2;
		System.out.println(result);
		System.out.println(true && true);
		System.out.println(false && true); // and연산은 둘 중 하나에 false가 있으면 무조건 false이므로 뒤는 볼 것도 없다. dead code
		System.out.println(true && false);
		System.out.println(false && false);
		
		result = (7>=5) && (5<3);
		System.out.println(result);
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		System.out.println(!bool1);
		bool1 = !bool1; // bool1의 값을 반전시켜 bool1에 대입
		System.out.println(bool1);
	}

}
