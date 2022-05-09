package day02_20220405;

public class Ex08_If {

	public static void main(String[] args) {
		boolean con = false;
		if (con) {
			System.out.println("조건이 true");
		} else {
			System.out.println("조건이 false");
		}
		
		boolean bool1 = true;
		boolean bool2 = true;
		if (bool1 && bool2) {
			System.out.println("bool1, bool2 모두 true");
		} else {
			System.out.println("bool1, bool2 중 하나는 false");
		}
	}

}
