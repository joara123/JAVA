package week7;

class Calculator{
	Control cal;
	
	void compute(int a, int b) {
		cal.run(a, b);
	}

	static interface Control{
		void run(int a, int b);
	}
	
	public void setControl(Object obj) {
		if(obj instanceof Add) {
			cal = (Add)obj;
		}
		else {
			cal = (Exp)obj;
		}
	}
}

class Add implements Calculator.Control{
	public void run(int a, int b) {
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
}
class Exp implements Calculator.Control{
	public void run(int a, int b) {
		int num = 1;
		for(int i  = 0 ; i < b ; i++) {
			num *= a;
		}
		System.out.println(a+"**"+b+"="+num);
	}
}

public class Answer_05 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setControl(new Add());
		cal.compute((int) (Math.random() * 10) + 1, (int) (Math.random() * 10) + 1);
		cal.setControl(new Exp());
		cal.compute(5, 3);
	}
}
