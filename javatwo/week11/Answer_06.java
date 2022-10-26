package week11;

import java.util.Arrays;

class Person implements Comparable{
	private String name;
	private double height;

	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	@Override
	public int compareTo(Object other) {
		Person p = null;
		
		if(other instanceof Person)
			p = (Person)other;
		
		if(this.height == ((Person)other).height) { //타입을 먼저 바꾸기
			return 0;
		}
		else if(this.height > ((Person)other).height) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class Answer_06 {
	public static void main(String[] args) {
		Person[] pr = new Person[4];
		pr[0] = new Person("홍릉", 180.0);
		pr[1] = new Person("용원", 168.0);
		pr[2] = new Person("인성", 175.0);
		pr[3] = new Person("성우", 170.0);
		
		System.out.println("=== 정렬 전 데이터 ===");
		for(int i = 0 ; i < pr.length ; i++) {
			System.out.println(pr[i].toString());
		}
		
		System.out.println("=== 정렬 후 데이터 ===");
		Arrays.sort(pr);
		for(int i = 0 ; i < pr.length ; i++) {
			System.out.println(pr[i].toString());
		}
	}
}
