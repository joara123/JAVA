package week7;

class Hair implements Operation{
	private String type;
	public Hair(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type+"를 자르다");
	}
	public void wash() {
		System.out.println(type+"를 감다");
	}
	public void tint(String color) {
		System.out.println(type+"를 "+color+" 색으로 염색하다");
	}
}

class Fruit implements Operation{
	private String type;
	public Fruit(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type+"를 자르다");
	}
	public void wash() {
		System.out.println(type+"를 감다");
	}
	public void pack(int cnt) {
		System.out.println(type+"를 "+cnt+" 개 포장하다");
	}
}

public class Answer_03 {
	public static void run(Operation obj) {
		obj.cut();
		obj.wash();
		
		if(obj instanceof Hair) {
			((Hair)obj).tint("red");
		}
		else{
			((Fruit)obj).pack(19);
		}
	}
	
	public static void main(String[] args) {
		Operation oper = null;
		oper = new Hair("긴 머리");
		run(oper);
		oper = new Fruit("사과");
		run(oper);
	}
}
