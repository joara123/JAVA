package week4;

public class PersonTest {
	public static void main(String[] args) {
		Customer cus = new Customer("hallym", "강원도", 23,34);
		Person per = new Person("parent", "춘천시");
		System.out.println(cus);
		System.out.println(per);
	}
}
