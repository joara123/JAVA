package week7;

public class Answer_01 {
	public static void main(String[] args) {
		//�͸� ���� ��ü
		Action ac = new Action() { //�������̽� ��ü ������ �ƴ϶� �������̽��� �����ϴ� �̸����� �͸� Ŭ������ ���� ��ü ����
			public void move() {
				System.out.println("�͸��� move");
			}
		};
		
		//���ٽ����� ���� (�Լ�(���) �������̽�: �߻�޼ҵ� �ϳ� ������ �մ� �������̽�)
		Action ac2 = () -> {System.out.println("���ٽı��� move");};
		
		//�͸� ���� ��ü�� �޼ҵ� ȣ��
		ac.move();
		
		//���ٽ����� �޼ҵ� ȣ��
		ac2.move();
	}
}
