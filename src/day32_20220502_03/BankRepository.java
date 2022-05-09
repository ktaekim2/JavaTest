package day32_20220502_03;

import java.util.ArrayList;
import java.util.List;

public class BankRepository {

	static List<ClientDTO> clientList = new ArrayList<>();
	static List<BankingDTO> bankingList = new ArrayList<>();

	// accountNumberCheck-계좌번호 확인
	public boolean accountNumberCheck(String accountNumber) {
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				return false;
			}
		}
		return true;
	}

	// accountPassCheck-계좌번호, 비밀번호 확인
	public boolean accountPassCheck(String accountNumber, String clientPass) {
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())
					&& clientPass.equals(clientList.get(i).getClientPass())) {
				return false;
			}
		}
		return true;
	}

	// bankingSave()

	public boolean bankingSave(BankingDTO newBanking) {
		return bankingList.add(newBanking);
	}

	// 1.clientSave()
	public boolean clientSave(ClientDTO newClient) {
		return clientList.add(newClient);
	}

	// 2.balanceCheck()
	public Long balanceResult(String accountNumber) {
		Long balanceResult = null;
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				balanceResult = clientList.get(i).getBalance();
			}
		}
		return balanceResult;
	}

	// 3.deposit
	public boolean deposit(String accountNumber, Long deposit) {
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
				return false;
			}
		}
		return true;
	}

	// 4.withdraw()
	public boolean withdraw(String accountNumber, Long withdraw) {
		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) {
				if (clientList.get(i).getBalance() < withdraw) {
					return true;
				} else {
					clientList.get(i).setBalance(clientList.get(i).getBalance() - withdraw);
					return false;
				}

			}
		}
		return true;
	}
	// 5.details()

	// 1.findAll()
	public List<BankingDTO> findAll(String accountNumber) {
		List<BankingDTO> clientBankingList = new ArrayList<>();
		for (int i = 0; i < bankingList.size(); i++) {
			if (accountNumber.equals(bankingList.get(i).getAccountNumber())) {
				clientBankingList.add(bankingList.get(i));
			}
		}
		return clientBankingList;
	}

	// 2.findDeposit()
	public List<BankingDTO> findDeposit(String accountNumber) {
		List<BankingDTO> clientBankingList = new ArrayList<>();
		for (int i = 0; i < bankingList.size(); i++) {
			if (accountNumber.equals(bankingList.get(i).getAccountNumber()) && bankingList.get(i).getDeposit() != 0) {
				clientBankingList.add(bankingList.get(i));
			}
		}
		return clientBankingList;
	}

	// 3.findWithdraw()
	public List<BankingDTO> findWithdraw(String accountNumber) {
		List<BankingDTO> clientBankingList = new ArrayList<>();
		for (int i = 0; i < bankingList.size(); i++) {
			if (accountNumber.equals(bankingList.get(i).getAccountNumber()) && bankingList.get(i).getWithdraw() != 0) {
				clientBankingList.add(bankingList.get(i));
			}
		}
		return clientBankingList;
	}
}
