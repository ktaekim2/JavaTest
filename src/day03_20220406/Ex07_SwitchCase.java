package day03_20220406;

public class Ex07_SwitchCase {

	public static void main(String[] args) {
		// Switch Case
		int num = 0;
		switch(num) {
		case 0:
			System.out.println("num���� 0�϶� ���");
			break;
		case 1:
			System.out.println("num���� 1�϶� ���");
			break;
		case 2:
			System.out.println("num���� 2�϶� ���");
			break;
		default:
			System.out.println("case ���ǿ� ���� ��� ���");
			break;
		}
		
		String str  = "������";
		switch(str) {
		case "������":
			System.out.println("�������Դϴ�.");
			break;
		case "�󸶹�":
			System.out.println("�󸶹��Դϴ�.");
			break;
		default:
			System.out.println("�ѱ��� �ƴմϴ�.");
			break;
		}
	}

}