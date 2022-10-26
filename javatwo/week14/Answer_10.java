package week14;

import java.util.*;

class Person{
	private String name; //이름
	private String num;  //전화번호
	
	public Person(String name, String num){
		this.name=name;
		this.num=num;
	}
	public String toString(){
		return  " [이름 : " + name + ",  전화번호 : " + num +"]" ;
	}
}


public class Answer_10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<String, Person> map = new HashMap<>();
		
		map.put("0001", new Person("Kim", "010-0000-0000"));
		map.put("0002", new Person("Park", "010-1111-1111"));
		map.put("0003", new Person("Lee", "010-2222-2222"));
		map.put("0004", new Person("Hwang", "010-3333-3333"));
		map.put("0005", new Person("Son", "010-4444-4444"));
		
		System.out.print("id 입력: ");
		String sid = in.next();
		
		if(map.containsKey(sid)) {
			System.out.println(map.get(sid));
		}
		else {
			System.out.println("없음");
		}
		
		for(Map.Entry<String, Person> m : map.entrySet()) {
			String key = m.getKey();
			Person value = m.getValue();
			System.out.println("key: "+key+", value: "+value);
		}
	}
}
