package week6;

public class Person2 {
	private String name;
	private int age;
	private int num;
	
	public Person2() {
		
	}
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return "Person [name="+name+", age="+age+"]";
	}
}

class Student extends Person2 implements IJob, IPin{
	private String enter;
	private double pay;
	
	public Student(String enter, int hour) {
		this.enter = enter;
		this.pay = getPay(hour);
	}
	
	public double getPay(double hour) {
		return hour * 7000;
	}
	public int getPin() {
		return (int)(Math.random()*100);
	}
	
	public String toString() {
		//return "Student [enter="+enter+", pay="+pay+", num="+enter.concat(String.valueOf(getPin()))+"]";
		return "Student [enter="+enter+", pay="+pay+", num="+enter+""+getPin()+"]";
	} // enter(String)+""+getPin()(int) -> 이렇게 문자로 이어서 표현 ㄱㄴ(String)
}

class Staff extends Person2 implements IJob, IPin{
	private double pay;
	private String num;
	
	public Staff(int hour, String num) {
		this.pay = getPay(hour);
		this.num = num.concat(String.valueOf(getPin()));
	}
	
	public double getPay(double hour) {
		return hour * 8000;
	}
	public int getPin() {
		return (int)(Math.random()*100);
	}
	
	public String toString() {
		return "Staff [pay="+pay+", num="+num+"]";
	}
}