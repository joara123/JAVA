package week5;

abstract class Animal {
	private String type;
	public Animal(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	
	abstract void run();
	abstract void sound();
}

class Baby extends Animal{

	public Baby(String type) {
		super(type);
	}
	
	public void run() {
		System.out.println(getType() + " : " + "���ٴմϴ�");
	}
	public void sound() {
		System.out.println(getType() + " : " + "�˾��̸� �մϴ�");
	}
	
}

class Dog extends Animal{
	
	public Dog(String type) {
		super(type);
	}
	
	public void run() {
		System.out.println(getType() + " : " + "�� �߷� �ٴմϴ�.");
	}
	public void sound() {
		System.out.println(getType() + " : " + "�۸� �Ҹ��� ���ϴ�");
	}
}