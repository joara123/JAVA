package week10;

import java.util.*;

public class Answer_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = "�ڹ� ���α׷��� ��� �����ϴ�. ��ƽ��ϴ�";
		
		System.out.print("���� �Է�>> ");
		char ch = in.next().charAt(0);
		
		//indexOf �ְ� ���� ã��? ó������ ������ �� ��ȯ
		System.out.println("-----indexOf() �޼ҵ� ���-----");
		int index = str.indexOf(ch);
		if(index == -1) {//��ġ�ϴ� �� ������ -1 ��ȯ
			System.out.println(ch+"�� �ش� ���ڿ��� �����ϴ�.");
		}
		else {
			System.out.println(ch+" �ε����� "+index+" �Դϴ�.");
		}
		
		//charAt()
		System.out.println("-----charAt() �޼ҵ� ���-----");
		boolean bl = true;
		for(int i = 0 ; i < str.length() ; i++) {
			if(ch == str.charAt(i)) { 
				System.out.println(ch+" �ε����� "+i+" �Դϴ�.");
				bl = false;
				break;
			}
		}
		if(bl) {
			System.out.println(ch+"�� �ش� ���ڿ��� �����ϴ�.");
		}
		
		System.out.println("���α׷� ����");
	}
}
