package week14;

import java.util.*;

public class Answer_07 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println("두자리 난수 10개를 출력합니다.");
		
		while(set.size() != 10) {
			int num = (int)(Math.random()*90 + 10);
			set.add(num);
		}
		
		for(Integer a : set) {
			System.out.print(a+" ");
		}
	}
}
