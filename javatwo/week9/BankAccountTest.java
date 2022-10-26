package week9;

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(0);
		
		System.out.println("저축 "+ba.deposit(100)+", "+ba.toString());
		System.out.println("저축 "+ba.deposit(500)+", "+ba.toString());
		try {
			System.out.println("출금 "+ba.withdraw(800)+", "+ba.toString());
		} catch (NegativeBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(ba.toString());
	}
}
