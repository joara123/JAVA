package week8_mid;

class Shoes{
	private int size;
	private int cnt;
	private String type;
	
	public Shoes(int size, int cnt, String type) {
		this.size = size;
		this.cnt = cnt;
		this.type = type;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public int sell(int num) {
		return cnt - num;
	}
	public int add(int num) {
		return cnt + num;
	}
	
	public String toString() {
		return "Shoes [size="+size+", cnt="+cnt+", type="+type+"]";
	}
}

public class test1 {
	public static void main(String[] args) {
		Shoes sh = new Shoes(255, 3, "����");
		System.out.println(sh.toString());
		System.out.println("���� �� ���� �Ⱦҽ��ϴ�");
		sh.sell(1);
		System.out.println("���� ������ ������ "+sh.getCnt()+" �Դϴ�");
		System.out.println("���� 2���� �߰��մϴ�");
		sh.add(2);
		System.out.println("���� ������ ������ "+sh.getCnt()+" �Դϴ�");
	}
}
