package day03_20220406;

import java.util.Scanner;

public class Ex08_SwitchCaseExample {

	public static void main(String[] args) {
		// ����
		Scanner scan = new Scanner(System.in);
		String noum = "";
		System.out.print("���� �ܾ� �Է�: ");
		noum = scan.nextLine();

		switch (noum) {
		case "desk":
			System.out.println("å��");
			break;
		case "chair":
			System.out.println("����");
			break;
		case "monitor":
			System.out.println("�����");
			break;
		case "mouse":
			System.out.println("���콺");
			break;
		default:
			System.out.println("������ ���� �ܾ��Դϴ�.");
		}

	}

}