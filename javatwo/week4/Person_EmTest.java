package week4;

import java.util.*;

public class Person_EmTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Person_Em person = null;
		
		while (true) {
			System.out.print("1: Salaried ��ü ����, 2: Hour ��ü ���� 3. ���� --> ");
			int menu = in.nextInt();
			if(menu == 3) { break; }

			switch (menu) {
			case 1:
				System.out.println("�̸�, ���, �޿��� �Է��ϼ���");
				person = new SalariedEmployee(in.next(), in.next(), in.nextInt());
				break;
			case 2:
				System.out.println("�̸�, ���, �ð����ӱ�, �ð��� �Է��ϼ���");
				person= new HourEmployee(in.next(), in.next(), in.nextInt(), in.nextInt());
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�");
			}
			System.out.println(person);
		}
		in.close();
		System.out.println("���α׷��� �����մϴ�");

	}
}
