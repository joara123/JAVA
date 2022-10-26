package week10;

import java.util.*;

public class Answer_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열 입력: ");
			String str = in.next();
			
			if(str.equals("finish")) {
				break;
			}
			StringBuffer sb = new StringBuffer(str);
			System.out.print("sercet => (reverse) ");
			System.out.println(sb.reverse());
		}
		
		System.out.println("프로그램 종료");
	}
}
