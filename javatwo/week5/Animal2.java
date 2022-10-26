package week5;

abstract class Animal2 {
	private String tak;
	private static int num = 0;
	public Animal2() {
		tak = "Anonymous";
	}
	public Animal2(String tak) {
		this.tak = tak;
	}
	
	abstract void sound();
	public String rection(Animal2 ani) {
		if(ani instanceof Dog2) {
			num++;
			return "部府棵府绊";
		}
		else
			return "部府郴府绊";
	}
	
	public static int getNum() {
		return num;
	}
	public String getTak() {
		return tak;
	}
}

class Cat extends Animal2{
	public Cat() {
		
	}
	public Cat(String tak) {
		super(tak);
	}
	
	@Override
	public void sound() {
		System.out.print(" 具~克");
	}
	
	public String toString() {
		return getTak();
	}
}
class Dog2 extends Animal2{
	public Dog2() {
		
	}
	public Dog2(String tak) {
		super(tak);
	}
	
	@Override
	public void sound() {
		System.out.print(" 港港");
	}
	
	public String toString() {
		return getTak();
	}
	
	public static int getCountDog() {
		return getNum();
	}
}
