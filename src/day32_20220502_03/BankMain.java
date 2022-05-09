package day32_20220502_03;

import java.util.Scanner;

import day32_20220502_01.PostService;

public class BankMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		BankService bankService = new BankService();

		while (run) {
			System.out.println("1.신규고객등록|2.잔액조회|3.입금|4.출금|5.거래내역확인|6.종료");
			System.out.print("번호입력: ");
			select = scan.nextInt();

			// 1.clientSave()
			if (select == 1) {
				bankService.clientSave();
			}

			// 2.balanceCheck()
			else if (select == 2) {
				bankService.balanceCheck();
			}

			// 3.deposit()
			else if (select == 3) {
				bankService.deposit();
			}

			// 4.withdraw()
			else if (select == 4) {
				bankService.withdraw();
			}

			// 5.details()
			else if (select == 5) {
				bankService.details();
			}

			// 6.End
			else if (select == 6) {
				System.out.println("종료합니다");
				run = false;
			}

			else {
				System.out.println("번호오류");
			}
		}
	}

}
