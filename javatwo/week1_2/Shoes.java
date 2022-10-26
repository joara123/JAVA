package week1_2;

public class Shoes{
	private int size;
	private int cnt;
	private String type;
	
	public Shoes(int size, int cnt, String type) {
		this.size = size;
		this.cnt = cnt;
		this.type = type;
	}
	
	public String toString() {//toString()�� ��ӹ޾� ������ �� �޼ҵ�.. �� �̷� ������� ��Ģ�̿�!
		return "Shoes[size="+size+", cnt="+cnt+", type="+type+"]";
	}
	void sell(int num) {
		cnt -= num;
	}
	int getCnt() {
		return cnt;
	}
	void add(int num) {
		cnt += num;
	}
}
