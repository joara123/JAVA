package week12;

public class Answer_05 {
	public static void main(String[] args) {
		Thread th1 = new Thread(() -> {
			for(char ch = 'a'; ch <= 'z' ; ch++) {
				System.out.println("labda1: "+ch);
				try {
					Thread.sleep(500);
				}catch(Exception e) {}
			}
		});
		
		Thread th2 = new Thread(() -> {
			char[] ch = new char[] {'¡Ù','¡Ü', '¡Þ', '¡ã', '¢·', '¢¼', '¢½', '¢À', '¢Ã', '¢Ç'};
			
			for(int i = 0 ;  i < ch.length ; i++) {
				System.out.println("lamda2: "+ch[i]);
				try {
					Thread.sleep(500);
				}catch(Exception e) {}
			}
		});
		
		th1.start();
		th2.start();
	}
}
