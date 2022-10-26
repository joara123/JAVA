package week4;

public class Person_Em {
	private String name; // 이름
	private String number; // 사번
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public Person_Em() {
		
	}
	public Person_Em(String name, String number) {
		this.name = name;
		this.number = number;
	}
}

class SalariedEmployee extends Person_Em{
	private int salary; // 월급

	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public SalariedEmployee(String name, String number, int salary) {
		super(name, number);
		this.salary = salary;
	}
	
	public int computeSalary() {
		return salary * 12;
	}
	
	public String toString() {
		return "이름: "+getName()+", 사번: "+getNumber()+", 급여: "+getSalary()+", 연봉: "+computeSalary();
	}
}

class HourEmployee extends Person_Em{
	private int money; // 시간당 임금
	private int hour; // 일한  시간
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public HourEmployee(String name, String number, int money, int hour) {
		super(name, number);
		this.money = money;
		this.hour = hour;
	}
	
	public int computeSalary() {
		return money * hour;
	}
	
	public String toString() {
		return "이름: "+getName()+", 사번: "+getNumber()+", 시간당임금: "+getMoney()+
				"일한시간: "+getHour()+", 금액: "+computeSalary();
	}
}