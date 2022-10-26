package week11;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Random;

class Manage{
	private String[] str;
	private String num;
	
	public void splitString(String[] str, String num) {
		StringTokenizer st = new StringTokenizer(num, "-");
		int countT = st.countTokens();
		
		for(int i  = 0 ; i < str.length ; i++) {
			String token = st.nextToken();
			System.out.print(str[i]+" : "+token);
			if(i == str.length-1 && st.hasMoreTokens()) {
				token = st.nextToken();
				System.out.println(" "+token);
			}
			System.out.println("");
		}
	}
	
	public void startChar() {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		char[] arr = {'A', 'B', 'C', 'D', 'E', 'F' ,'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
				'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		for(int i = 0 ; i < 3 ; i ++) {
			System.out.print(arr[rand.nextInt(arr.length)]+"로 시작하는 단어 >>> ");
			String str = in.next();
		}
	}
	
	public int calChar(String str) {
		StringTokenizer st = new StringTokenizer(str, "+-* ");
		int countT = st.countTokens();		
		
		int sum = 0;
		
		for(int i = 0 ; i < countT ; i ++) {
			String token = st.nextToken();
			
			if(token.equals("34")) {
				sum += Integer.valueOf(token);
			}
			else if(token.equals("56")) {
				sum += Integer.valueOf(token);
			}
			else if(token.equals("12")) {
				sum -= Integer.valueOf(token);
			}
			else if(token.equals("2")) {
				sum *= Integer.valueOf(token);
			}
		}
		
		return sum;
	}
}

public class Answer_07 {
	public static void main(String[] args) {
		Manage manage = new Manage();
		manage.splitString(new String[] { "국가번호", "도시식별번호", "가입자 번호" }, "082-2-777-5566");
		manage.startChar();
		System.out.println("\n34 + 56 - 12 * 2 = " + manage.calChar("34 + 56 - 12 * 2"));
		System.out.println("프로그램 종료");
	}
}
