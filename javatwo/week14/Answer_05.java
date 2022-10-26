package week14;

import java.util.*;

public class Answer_05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("candy");
		
		for(int i = 0 ; i < list.size() ; i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
