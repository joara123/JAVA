package week14;

import java.util.*;

public class Answer_04 {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println();
		}
		
		for(Double l : list) {
			System.out.println();
		}
		
		Iterator<Double> iterator = list.iterator();
		while(iterator.hasNext()) {
			Double d = iterator.next();
			System.out.println(d+" ");
		}
	}
}
