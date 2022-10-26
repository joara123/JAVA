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
	
	public String toString() {//toString()은 상속받아 재정의 된 메소드.. 걍 이래 적어야혀 규칙이여!
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
