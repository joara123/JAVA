package week4;

public class Person_Em {
	private String name; // �̸�
	private String number; // ���
	
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
	private int salary; // ����

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
		return "�̸�: "+getName()+", ���: "+getNumber()+", �޿�: "+getSalary()+", ����: "+computeSalary();
	}
}

class HourEmployee extends Person_Em{
	private int money; // �ð��� �ӱ�
	private int hour; // ����  �ð�
	
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
		return "�̸�: "+getName()+", ���: "+getNumber()+", �ð����ӱ�: "+getMoney()+
				"���ѽð�: "+getHour()+", �ݾ�: "+computeSalary();
	}
}