package week9;

public class BankAccount {
	private int balance; //�ܾ�
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int deposit(int amount) { //�Ա�
		balance += amount;
		return amount;
	}
	public int withdraw(int amount) throws NegativeBalanceException { //���
		if(balance >= amount) {
			balance -= amount;
			return balance;
		}
		else {
			throw new NegativeBalanceException("��� "+amount+", �ܰ� �����Դϴ�.");
		}
	}
	
	public String toString() {
		return "�ܰ�= "+balance;
	}
}
