package week4;

abstract class Shape{
	abstract double area();
	abstract void write();
}

class Circle extends Shape{
	static final double PI = 3.14;
	double r;
	
	public Circle(double r) {
		this.r = r;
	}
	@Override
	double area() {
		return r*r*PI;
	}
	@Override
	void write() {
		System.out.println("Circle [radius=" + r);
		System.out.printf("\tarea = %.2f ]\n", area());
	}
}

class Rectangle extends Shape{
	private double d1, d2;
	
	public Rectangle(double d1, double d2) {
		this.d1 = d1;
		this.d2 = d2;
	}
	@Override
	double area() {
		return  d1 *d2;
	}
	@Override
	void write() {
		System.out.println("Rectangle [ga = "+d1+"\tse= "+d2);
		System.out.printf("\tarea = %.2f]\n", area());
	}
}

public class wee4_test {
	public static void main(String[] args) {
		Circle c = new Circle(5.0);
		Rectangle r = new Rectangle(3.0, 4.0);
		
		c.write();
		r.write();
	}
}
