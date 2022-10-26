package week1_2;

public class Info {
	String id;
	int pass;
	
	public Info(String id) {
		this.id = id;
		this.pass = (int)(Math.random()*10000);
	}
	
	void disPlay() {
		System.out.println("아이디: "+ id);
		System.out.println("비번: "+ pass);
	}
}