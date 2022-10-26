package week7;

class Hair implements Operation{
	private String type;
	public Hair(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type+"�� �ڸ���");
	}
	public void wash() {
		System.out.println(type+"�� ����");
	}
	public void tint(String color) {
		System.out.println(type+"�� "+color+" ������ �����ϴ�");
	}
}

class Fruit implements Operation{
	private String type;
	public Fruit(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type+"�� �ڸ���");
	}
	public void wash() {
		System.out.println(type+"�� ����");
	}
	public void pack(int cnt) {
		System.out.println(type+"�� "+cnt+" �� �����ϴ�");
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
		oper = new Hair("�� �Ӹ�");
		run(oper);
		oper = new Fruit("���");
		run(oper);
	}
}
