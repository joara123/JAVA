package week4;

public class Person {
	private String name;
	private String address;
	private String number;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Person() {
		this("null", "null", "null"); //안써도 ㄱㅊ
	}
	public Person(String name, String address) {
		this(name, address, "null");
	}
	public Person(String name, String address, String number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+", 주소: "+address;
	}
}

class Customer extends Person{
	private int perNumber;
	private int mileage;
	
	public int getPerNumber() {
		return perNumber;
	}
	public void setPerNumber(int perNumber) {
		this.perNumber = perNumber;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public Customer(String name, String address, int perNumber, int mileage) {
		super(name, address);
		this.perNumber = perNumber;
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		return str+", 번호: "+perNumber+", 마일리지: "+mileage;
	}
}
