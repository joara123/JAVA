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
		return "type >> "+getType()+", 구입량 >> "+num;
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
		return "type >> "+getType()+", 구입량 >> "+pl;
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
		Food[] f= {new Fish("오징어", 5), new Fish("고등어", 2), 
				new Fruit("딸기", "산청"), new Fruit("사과", "보람"), 
				new Fish("새우", 20)};
				
		System.out.println("--------- 배열 원소 출력 -------------");
		for(Food v : f) {
			System.out.println(v);
		}
				
		System.out.println("\n--------- 조리법 출력 -------------");
		for(Food v : f) {
			 System.out.print(v.getType() + ">>");
			 v.cooking();
		}
				
		System.out.println("\n구입한 Fish는 모두 " + info(f) + " 마리 입니다. ");
		System.out.println("");
		}
}
