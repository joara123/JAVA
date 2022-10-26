package week10;

import java.util.*;

public class Answer_07 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			String[] hexa2bin = {"0000", "0001", "0010", "0011", "0100", "0101", "0110",
					"0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
			
			char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
			
			System.out.print("반복문을 종료하려면 s 또는 S를 입력하세요: ");
			String str = in.next();
			
			if(str.equals("s") || str.equals("S")) {
				break;
			}
			
			for(int i = 0 ; i < str.length() ; i++) {
				boolean bl = true;
				
				for(int j = 0 ; j < arr.length ; j++) {
					if(str.charAt(i) == arr[j]) {
						System.out.print(hexa2bin[j]+" ");
						bl = false;
						break;
					}
				}
				
				if(bl) {
					System.out.print("---- ");
				}
			}
			
			
			System.out.println("16진수를 입력하세요");
		}
		
		System.out.println("프로그램 종료");
	}
}
