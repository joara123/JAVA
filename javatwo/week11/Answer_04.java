package week11;

import java.util.Random;

public class Answer_04 {
	public static void main(String[] args) {
		//(4)	다섯 번 주사위를 굴린 후, 주사위의 면의 숫자를 출력하세요. (Random 클래스의 nextInt() 이용)
		
		System.out.println("주사위의 면의 숫자");
		for(int i = 0 ; i < 5 ; i++) {
			Random rand = new Random();
			
			int num = rand.nextInt(6) + 1;
			System.out.print(num+" ");
		}
	}
}
