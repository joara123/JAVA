package week3;

public class Dog {
	private int age;
	private String color;
	private int food;
	private static int total; // �ν��Ͻ� �ɹ��� �ϸ� ��ü�� ������ �� ���� total �ʵ尡 �������
	
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
			System.out.println("�ù���");
		}
		else {
			food--;
			System.out.println("�۸�");
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
