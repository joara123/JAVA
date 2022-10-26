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
		
		if(this.height == ((Person)other).height) { //Ÿ���� ���� �ٲٱ�
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
		pr[0] = new Person("ȫ��", 180.0);
		pr[1] = new Person("���", 168.0);
		pr[2] = new Person("�μ�", 175.0);
		pr[3] = new Person("����", 170.0);
		
		System.out.println("=== ���� �� ������ ===");
		for(int i = 0 ; i < pr.length ; i++) {
			System.out.println(pr[i].toString());
		}
		
		System.out.println("=== ���� �� ������ ===");
		Arrays.sort(pr);
		for(int i = 0 ; i < pr.length ; i++) {
			System.out.println(pr[i].toString());
		}
	}
}
