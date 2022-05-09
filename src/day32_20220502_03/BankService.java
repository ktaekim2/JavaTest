package day32_20220502_03;

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

	// accountNumberCheck-계좌번호 확인
	boolean accountNumberCheck(String accountNumber) {
		if (bankRepository.accountNumberCheck(accountNumber)) {
			System.out.println("일치하는 계좌가 없습니다.");
			return false;
		} else {
			System.out.println("일치하는 계좌가 존재합니다.");
			return true;
		}
	}

	// accountPassCheck-계좌번호, 비밀번호 확인
	boolean accountPassCheck(String accountNumber, String clientPass) {
		if (bankRepository.accountPassCheck(accountNumber, clientPass)) {
			System.out.println("일치하는 계좌가 없습니다.");
			return false;
		} else {
			System.out.println("일치하는 계좌가 존재합니다.");
			return true;
		}
	}

	// createdTime
	String createdTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm:ss"));
	}

	// bankingSave()
	void bankingSave(Long bankingId, String accountNumber, Long deposit, Long withdraw) {
		BankingDTO newBanking = new BankingDTO(++bankingId, accountNumber, deposit, withdraw, createdTime());
		bankRepository.bankingSave(newBanking);
	}

	// 1.clientSave()
	public void clientSave() {
		System.out.print("고객이름: ");
		String clientName = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		if (!accountNumberCheck(accountNumber)) {
			ClientDTO newClient = new ClientDTO(++clientId, clientName, clientPass, createdTime(), balance,
					accountNumber);
			if (bankRepository.clientSave(newClient)) {
				System.out.println("신규 고객 등록 완료");
			} else {
				System.out.println("신규 고객 등록 실패");
			}
		}

	}

	// 2.balanceCheck()
	public void balanceCheck() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		if (accountNumberCheck(accountNumber)) {
			Long balanceResult = bankRepository.balanceResult(accountNumber);
			System.out.println(accountNumber + " 계좌의 잔액은 " + balanceResult + "원 입니다.");
		}
	}

	// 3.deposit()
	public void deposit() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		if (accountNumberCheck(accountNumber)) {
			System.out.print("입금할 금액: ");
			Long deposit = scan.nextLong();
			Long withdraw = 0L;

			// deposit
			if (bankRepository.deposit(accountNumber, deposit)) {
				System.out.println("입금실패");
				return;
			} else {
				System.out.println("입금완료");
			}

			// bankingSave()
			bankingSave(++bankingId, accountNumber, deposit, withdraw);
		}
	}

	// 4.withdraw()
	public void withdraw() {
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();
		System.out.print("비밀번호: ");
		String clientPass = scan.next();

		if (accountPassCheck(accountNumber, clientPass)) {
			System.out.print("출금할 금액: ");
			Long withdraw = scan.nextLong();
			Long deposit = 0L;

			// withdraw
			if (bankRepository.withdraw(accountNumber, withdraw)) {
				System.out.println("잔액이 부족합니다.");
				return;
			} else {
				System.out.println("출금완료");
			}

			// bankingSave()
			bankingSave(++bankingId, accountNumber, deposit, withdraw);
		}
	}

	// 5.details()
	public void details() {
		boolean run = true;
		int select = 0;
		System.out.print("계좌번호: ");
		String accountNumber = scan.next();

		if (accountNumberCheck(accountNumber)) {
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

}