package week6;

public class Rectangle implements IGraphics{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double perimeter() {
		return length*2 + width*2;
	}
	public void draw() {
		System.out.println("도형 Rectangle을 그립니다.");
	}
	
	public String toString() {
		return "Rectangle [length="+length+", width="+width+"]";
	}
}

class Circle implements IGraphics{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double perimeter() {
		return radius*2*3.14;
	}
	public void draw() {
		System.out.println("도형 Circle을 그립니다");
	}
	
	public String toString() {
		return "Rectangle [length="+radius+"]";
	}
}