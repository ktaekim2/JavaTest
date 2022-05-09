package day32_20220502_02;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class BankService {

	Scanner scan = new Scanner(System.in);
	static Long clientId = 0L;
	static Long bankingId = 0L;
	Long balance = 0L;

	BankRepository bankRepository = new BankRepository();

	// 1.clientSave()
	public void clientSave() {
		System.out.print("고객이름: ");
		String clientName = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		// 계좌번호 확인
		boolean checkResult = bankRepository.accountNumberCheck(accountNumber);
		if (checkResult) {
			System.out.println("사용 가능한 계좌번호");
		} else {
			System.out.println("중복계좌");
			return;
		}

		LocalDateTime dateTime = LocalDateTime.now();
		String clientCreatedDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		ClientDTO newClient = new ClientDTO(++clientId, clientName, clientPass, clientCreatedDate, balance,
				accountNumber);

		boolean saveResult = bankRepository.clientSave(newClient);
		if (saveResult) {
			System.out.println("신규 고객 등록 완료");
		} else {
			System.out.println("신규 고객 등록 실패");
		}
	}

	// 2.balanceCheck()
	public void balanceCheck() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();

		// 계좌번호, 비밀번호 확인
		boolean checkResult = bankRepository.accountPassCheck(accountNumber, clientPass);
		if (checkResult) {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
			return;
		} else {
			System.out.println("계좌 일치");
		}

		Long balanceResult = bankRepository.balanceResult(accountNumber, clientPass);
		System.out.println("잔액: " + balanceResult);

	}

	// 3.deposit()
	public void deposit() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		// 계좌번호 확인
		boolean checkResult = bankRepository.accountNumberCheck(accountNumber);
		if (checkResult) {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
			return;
		} else {
			System.out.println("계좌 일치");
		}

		System.out.print("입금할 금액: ");
		Long deposit = scan.nextLong();
		Long withdraw = 0L;

		// deposit
		boolean depositResult = bankRepository.deposit(accountNumber, deposit);

		if (depositResult) {
			System.out.println("입금실패");
			return;
		} else {
			System.out.println("입금완료");
		}

		// bankingSave()
		LocalDateTime dateTime = LocalDateTime.now();
		String bankingDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		BankingDTO newBanking = new BankingDTO(++bankingId, accountNumber, deposit, withdraw, bankingDate);
		bankRepository.bankingSave(newBanking);
	}

	// 4.withdraw()
	public void withdraw() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();

		// 계좌번호, 비밀번호 확인
		boolean checkResult = bankRepository.accountPassCheck(accountNumber, clientPass);
		if (checkResult) {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
			return;
		} else {
			System.out.println("계좌 일치");
		}

		System.out.print("출금할 금액: ");
		Long withdraw = scan.nextLong();
		Long deposit = 0L;

		// withdraw
		boolean withdrawResult = bankRepository.withdraw(accountNumber, withdraw);

		if (withdrawResult) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			System.out.println("출금완료");
		}

		// bankingSave()
		LocalDateTime dateTime = LocalDateTime.now();
		String bankingDate = dateTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
		BankingDTO newBanking = new BankingDTO(++bankingId, accountNumber, deposit, withdraw, bankingDate);
		bankRepository.bankingSave(newBanking);

	}

	// 5.details()
	public void details() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		// 계좌번호 확인
		boolean checkResult = bankRepository.accountNumberCheck(accountNumber);
		if (checkResult) {
			System.out.println("해당 계좌와 일치하는 계좌가 없습니다.");
			return;
		} else {
			System.out.println("계좌 일치");
		}
		boolean run = true;
		int select = 0;
		while (run) {
			System.out.println("1.모든 거래내역 확인|2.입금내역 확인|3.출금내역 확인|4.종료");
			System.out.print("번호입력: ");
			select = scan.nextInt();

			// 1.findAll()
			if (select == 1) {
				List<BankingDTO> bankingList = bankRepository.findAll(accountNumber);
				if (bankingList.size() > 0) {
					for (BankingDTO b : bankingList) {
						System.out.println(b);
					}
				} else {
					System.out.println("검색결과가 없습니다.");
				}
			}

			// 2.findDeposit()
			else if (select == 2) {
				List<BankingDTO> bankingList = bankRepository.findDeposit(accountNumber);
				if (bankingList.size() > 0) {
					for (BankingDTO b : bankingList) {
						System.out.println(b);
					}
				} else {
					System.out.println("검색결과가 없습니다.");
				}
			}

			// 3.findWithdraw()
			else if (select == 3) {
				List<BankingDTO> bankingList = bankRepository.findWithdraw(accountNumber);
				if (bankingList.size() > 0) {
					for (BankingDTO b : bankingList) {
						System.out.println(b);
					}
				} else {
					System.out.println("검색결과가 없습니다.");
				}
			}

			// 4.End
			else if (select == 4) {
				System.out.println("종료합니다");
				run = false;
			}
		}
	}
}