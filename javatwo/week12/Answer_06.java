package week12;

class CharThread extends Thread{
	char[] ch;
	int num;
	
	public CharThread(char[] ch, int num) {
		this.ch = ch;
		this.num = num;
	}
	
	public void run() {
		for(int i = 0 ; i < num ; i++) {
			int num = (int)(Math.random() *ch.length);
			System.out.print(ch[num]);
		}
	}
}

class NumThread extends Thread{
	int num;
	public NumThread(int num) {
		this.num = num;
	}
	
	public void run() {
		for(int i = 0 ; i < num ; i++) {
			System.out.print(i+1);
		}
	}
}

public class Answer_06 {
	public static void main(String[] args) {
		int num = (int)(Math.random() *21 +1);
		Thread cht = new CharThread(new char[] {'б▐', 'бр'} ,num);
		Thread nut = new NumThread(num);
		cht.start();
		nut.start();
	}
}
