package week4;

class Account{
	String number; //계좌번호
	String name; //예금주 이름
	int money; //잔액
	
	public Account(String number, String name, int money) {
		this.number = number;
		this.name = name;
		this.money = money;
	}
	
	public int in(int num) {
		return money + num;
	}
	public int out(int num) {
		return money - num;
	}
}

class CheckingAccount extends Account{
	private String card; //직불카드 번호
	
	public CheckingAccount(String number, String name, int money, String card) {
		super(number, name, money);
		this.card = card;
	}
	
	public int pay(int num) {
		return money - num;
	}
}

public class week4_test2 {
	public static void main(String[] args) {
		
	}
}
