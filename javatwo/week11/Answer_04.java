package week11;

import java.util.Random;

public class Answer_04 {
	public static void main(String[] args) {
		//(4)	�ټ� �� �ֻ����� ���� ��, �ֻ����� ���� ���ڸ� ����ϼ���. (Random Ŭ������ nextInt() �̿�)
		
		System.out.println("�ֻ����� ���� ����");
		for(int i = 0 ; i < 5 ; i++) {
			Random rand = new Random();
			
			int num = rand.nextInt(6) + 1;
			System.out.print(num+" ");
		}
	}
}
