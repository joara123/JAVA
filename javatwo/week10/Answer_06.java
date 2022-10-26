package week10;

import java.util.*;

public class Answer_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String[] str1= {"오이", "강아지", "자바", "생강", "소나기", "우동", "연어" };
		
		while(true) {
			boolean bl = true;
			
			System.out.println("끝말잇기 게임을 시작합니다~~~");

			String s = str1[(int)(Math.random()*str1.length)];
			
			System.out.print(s+"의 "+s.charAt(s.length()-1)+"로 시작하는 단어 >> ");
			String str = in.next();
			
			if(s.charAt(s.length()-1) == str.charAt(0)) {
				while(true) {
					String stR = str;
					System.out.print(str+"의 "+str.charAt(str.length()-1)+"로 시작하는 단어 >> ");
					str = in.next();
					
					if(stR.charAt(stR.length()-1) != str.charAt(0)) {
						System.out.println("틀렸습니다.");
						System.out.print("계속하겠습니까? >> ");
						String a = in.next();
						
						if(a.equals("c") || a.equals("C")) {
							break;
						}
						else {
							System.out.println("게임을 종료합니다.");
							bl = false;
							break;
						}
					}
				}
			}
			else {
				System.out.println("틀렸습니다.");
				System.out.print("계속하겠습니까? >> ");
				String a = in.next();
				
				if(a.equals("c") || a.equals("C")) {
					continue;
				}
				else {
					System.out.println("게임을 종료합니다.");
					break;
				}
			}
			
			if(!bl) {
				break;
			}
		}
	}
}
