package week1_2;

public class Info {
	String id;
	int pass;
	
	public Info(String id) {
		this.id = id;
		this.pass = (int)(Math.random()*10000);
	}
	
	void disPlay() {
		System.out.println("���̵�: "+ id);
		System.out.println("���: "+ pass);
	}
}