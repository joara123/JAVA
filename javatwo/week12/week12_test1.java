package week12;

public class week12_test1 {
	public static void main(String[] args) {
		Thread movie_thread = new Thread() {
			@Override
			public void run() {
				int i=0;
				while(true){
					System.out.println(i++ + ") �������� ����մϴ�.");
					if(Thread.interrupted())
						break;
				}
				System.out.println("�ڿ� ����");
				System.out.println("���� ����");
			}
		};
		movie_thread.start();
		try {
			Thread.sleep(1000);  
		} catch (InterruptedException e) {
		}
		movie_thread.interrupt();    // interrupt() �޼ҵ带 ȣ���Ͽ� movie_thread ������ ��� ����
		System.out.println("���� ������ ����");

	}
}
