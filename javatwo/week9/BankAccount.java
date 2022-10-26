package week9;

public class BankAccount {
	private int balance; //잔액
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amount) { //입급
		balance += amount;
		return amount;
	}
	public int withdraw(int amount) throws NegativeBalanceException { //출금
		if(balance >= amount) {
			balance -= amount;
			return balance;
		}
		else {
			throw new NegativeBalanceException("출금 "+amount+", 잔고가 음수입니다.");
		}
	}
	
	public String toString() {
		return "잔고= "+balance;
	}
}
