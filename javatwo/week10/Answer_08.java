package week10;

import java.util.*;

public class Answer_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�: ");
		String str = in.next();
		
		System.out.print("���� �Է�: ");
		char ch = in.next().charAt(0);
		
		int cnt = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == ch) {
				cnt++;
			}
		}
		
		System.out.println(str+" ���ڿ����� "+ch+" ���ڴ� "+cnt+" �� �ݺ��˴ϴ�.");
		System.out.println("���α׷� ����");
	}
}
