package week9;

abstract class Food{
	private String type;
	
	public Food(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	abstract void cooking();
}

class Fish extends Food{
	private int num;
	
	public Fish(String type, int num) {
		super(type);
		this.num = num;
	}
	public int getNum() {
		return num;
	}

	@Override
	void cooking() {
		System.out.println("fry or bake");
	}
	
	public String toString() {
		return "type >> "+getType()+", ���Է� >> "+num;
	}
}

class Fruit extends Food{
	private String pl;
	
	public Fruit(String type, String pl) {
		super(type);
		this.pl = pl;
	}

	@Override
	void cooking() {
		System.out.println("cut fruit");
	}
	
	public String toString() {
		return "type >> "+getType()+", ���Է� >> "+pl;
	}
}

public class MidExam {
	public static int info(Food[] obj) {
		int num = 0;
		for(Food f : obj) {
			if(f instanceof Fish) {
				num += ((Fish)f).getNum();
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		Food[] f= {new Fish("��¡��", 5), new Fish("����", 2), 
				new Fruit("����", "��û"), new Fruit("���", "����"), 
				new Fish("����", 20)};
				
		System.out.println("--------- �迭 ���� ��� -------------");
		for(Food v : f) {
			System.out.println(v);
		}
				
		System.out.println("\n--------- ������ ��� -------------");
		for(Food v : f) {
			 System.out.print(v.getType() + ">>");
			 v.cooking();
		}
				
		System.out.println("\n������ Fish�� ��� " + info(f) + " ���� �Դϴ�. ");
		System.out.println("");
		}
}
