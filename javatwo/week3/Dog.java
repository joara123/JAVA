package week3;

public class Dog {
	private int age;
	private String color;
	private int food;
	private static int total; // 인스턴스 맴버로 하면 객체가 생성될 때 마다 total 필드가 만들어짐
	
	public Dog(int age, String color, int food) {
		this.age = age;
		this.color = color;
		this.food = food;
		total++;
	}
	public String getColor() {
		return color;
	}
	public int getFood() {
		return food;
	}
	
	public void barking() {
		if(food == 0) {
			System.out.println("시무룩");
		}
		else {
			food--;
			System.out.println("멍멍");
		}
	}
	public boolean hungry() {
		if(food <= 1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean sleeping(int a) {
		if(food > 0) {
			food += a;
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Dog age: "+age+", color: "+color+", food: "+food;
	}
	
	public static int getToatla() {
		return total;
	}
}
