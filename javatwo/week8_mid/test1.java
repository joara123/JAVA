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
		Shoes sh = new Shoes(255, 3, "샌들");
		System.out.println(sh.toString());
		System.out.println("샌들 한 개를 팔았습니다");
		sh.sell(1);
		System.out.println("현재 샌들의 개수는 "+sh.getCnt()+" 입니다");
		System.out.println("샌들 2개를 추가합니다");
		sh.add(2);
		System.out.println("현재 샌들의 개수는 "+sh.getCnt()+" 입니다");
	}
}
