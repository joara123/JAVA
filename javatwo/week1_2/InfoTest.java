package week1_2;

import java.util.Scanner;

public class InfoTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("아이디를 입력 하세요 >>> ");
		String id1 = in.next();
		System.out.println("첫번째 객체 생성 완료");
		Info info1 = new Info(id1);
		
		System.out.print("아이디를 입력 하세요 >>> ");
		String id2 = in.next();
		System.out.println("첫번째 객체 생성 완료");
		Info info2 = new Info(id2);
		
		info1.disPlay();
		info2.disPlay();
	}
}