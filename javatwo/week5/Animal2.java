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
			return "�����ø���";
		}
		else
			return "����������";
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
		System.out.print(" ��~��");
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
		System.out.print(" �۸�");
	}
	
	public String toString() {
		return getTak();
	}
	
	public static int getCountDog() {
		return getNum();
	}
}
