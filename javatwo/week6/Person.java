package week6;

public class Person implements IComparable{
	private String name;
	private double height;
	
	public double getHeight() {
		return height;
	}
	
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
	}
	
	public String toString() {
		return "Person [name="+name+", height="+height+"]";
	}
	
	public int compareTo(Object other) {
		Person p = null;
		
		/*if(other instanceof Person) { //instanceof를 언제 쓰는 줄 알아야함
			if(this.height < ((Person)other).height)
				return -1;
		}*/ //원랜 아래 if가 아니라 이 if처럼 써야함
		
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