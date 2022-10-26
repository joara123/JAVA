package week10;

import java.util.*;

public class Answer_08 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("문자열 입력: ");
		String str = in.next();
		
		System.out.print("문자 입력: ");
		char ch = in.next().charAt(0);
		
		int cnt = 0;
		for(int i = 0 ; i < str.length() ; i++) {
			if(str.charAt(i) == ch) {
				cnt++;
			}
		}
		
		System.out.println(str+" 문자열에서 "+ch+" 문자는 "+cnt+" 번 반복됩니다.");
		System.out.println("프로그램 종료");
	}
}
