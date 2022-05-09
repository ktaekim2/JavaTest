package day03_20220406;

public class Ex07_SwitchCase {

	public static void main(String[] args) {
		// Switch Case
		int num = 0;
		switch(num) {
		case 0:
			System.out.println("num값이 0일때 출력");
			break;
		case 1:
			System.out.println("num값이 1일때 출력");
			break;
		case 2:
			System.out.println("num값이 2일때 출력");
			break;
		default:
			System.out.println("case 조건에 없는 경우 출력");
			break;
		}
		
		String str  = "가나다";
		switch(str) {
		case "가나다":
			System.out.println("가나다입니다.");
			break;
		case "라마바":
			System.out.println("라마바입니다.");
			break;
		default:
			System.out.println("한글이 아닙니다.");
			break;
		}
	}

}
