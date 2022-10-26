package week12;

class Thread1 implements Runnable{
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println("lamda1: "+ch);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}

class Thread2 implements Runnable{
	public void run() {
		char[] ch = new char[] {'¡Ù','¡Ü', '¡Þ', '¡ã', '¢·', '¢¼', '¢½', '¢À', '¢Ã', '¢Ç'};
		
		for(int i = 0 ;  i < ch.length ; i++) {
			System.out.println("lamda2: "+ch[i]);
			try {
				Thread.sleep(500);
			}catch(Exception e) {}
		}
	}
}

public class Answer_04 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Thread2());
		
		th1.start();
		th2.start();
	}
}
