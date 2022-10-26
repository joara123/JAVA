package week10;

import java.util.*;

public class Answer_04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = "자바 프로그램은 재미 없습니다. 어렵습니다";
		
		System.out.print("문자 입력>> ");
		char ch = in.next().charAt(0);
		
		//indexOf 있고 없고 찾기? 처음으로 나오는 놈 반환
		System.out.println("-----indexOf() 메소드 사용-----");
		int index = str.indexOf(ch);
		if(index == -1) {//일치하는 값 없으면 -1 반환
			System.out.println(ch+"는 해당 문자열에 없습니다.");
		}
		else {
			System.out.println(ch+" 인덱스는 "+index+" 입니다.");
		}
		
		//charAt()
		System.out.println("-----charAt() 메소드 사용-----");
		boolean bl = true;
		for(int i = 0 ; i < str.length() ; i++) {
			if(ch == str.charAt(i)) { 
				System.out.println(ch+" 인덱스는 "+i+" 입니다.");
				bl = false;
				break;
			}
		}
		if(bl) {
			System.out.println(ch+"는 해당 문자열에 없습니다.");
		}
		
		System.out.println("프로그램 종료");
	}
}
