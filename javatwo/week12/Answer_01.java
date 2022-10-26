package week12;

class Job extends Thread {
	String str;
	public Job(String str) {
		this.str = str;
	}
	
	public void run() {
		int n = 0;
		while(true) {
			System.out.println(str+":"+n++);
			if(n>50) break;
		}
	}
}

public class Answer_01 {
	public static void main(String[] args) {
		Job t1 = new Job("thread1");
		Job t2 = new Job("thread2");
		
        t1.start();
        t2.start();
	}
}
