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
		System.out.println(getType() + " : " + "±â¾î´Ù´Õ´Ï´Ù");
	}
	public void sound() {
		System.out.println(getType() + " : " + "¿Ë¾ËÀÌ¸¦ ÇÕ´Ï´Ù");
	}
	
}

class Dog extends Animal{
	
	public Dog(String type) {
		super(type);
	}
	
	public void run() {
		System.out.println(getType() + " : " + "³× ¹ß·Î ´Ù´Õ´Ï´Ù.");
	}
	public void sound() {
		System.out.println(getType() + " : " + "¸Û¸Û ¼Ò¸®¸¦ ³À´Ï´Ù");
	}
}