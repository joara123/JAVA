package week1_2;

import java.util.Scanner;

public class InfoTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���̵� �Է� �ϼ��� >>> ");
		String id1 = in.next();
		System.out.println("ù��° ��ü ���� �Ϸ�");
		Info info1 = new Info(id1);
		
		System.out.print("���̵� �Է� �ϼ��� >>> ");
		String id2 = in.next();
		System.out.println("ù��° ��ü ���� �Ϸ�");
		Info info2 = new Info(id2);
		
		info1.disPlay();
		info2.disPlay();
	}
}