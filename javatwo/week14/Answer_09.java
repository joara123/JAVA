package week14;

import java.util.*;

class Count{
	
	public static Map<Integer, Integer> count() {
		Map<Integer, Integer> map = new HashMap<>();
		int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0;
		
		for(int i = 0 ; i < 100 ; i++) {
			int num = (int)(Math.random()*6 + 1);
			
			switch(num) {
				case 1:
					n1++;
					break;
				case 2:
					n2++;
					break;
				case 3:
					n3++;
					break;
				case 4:
					n4++;
					break;
				case 5:
					n5++;
					break;
				case 6:
					n6++;
					break;
			}
		}
		map.put(1, n1);
		map.put(2, n2);
		map.put(3, n3);
		map.put(4, n4);
		map.put(5, n5);
		map.put(6, n6);
		
		return map;
	}
	
	public static void write(Map<Integer, Integer> map) {
		Set<Integer> keyset = map.keySet();
		Iterator<Integer> keytor =  keyset.iterator();
		for(int i = 0 ; i < map.size() ; i++) {
			Integer key = keytor.next();
			Integer value = map.get(key);
			System.out.println("주사위 눈 = "+key+", 빈도수 = "+value);
		}
	}
}

public class Answer_09 {
	public static void main(String args[]) {
		Map<Integer, Integer> map;
		map = Count.count();  //빈도수를 계산한 HashMap을 반환받아 저장
		System.out.println("Map에 저장된 빈도수를 출력합니다");
		Count.write(map);  //HashMap에 저장된 원소 출력
	}
}
