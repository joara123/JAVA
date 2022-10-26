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
		
		/*if(other instanceof Person) { //instanceof�� ���� ���� �� �˾ƾ���
			if(this.height < ((Person)other).height)
				return -1;
		}*/ //���� �Ʒ� if�� �ƴ϶� �� ifó�� �����
		
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