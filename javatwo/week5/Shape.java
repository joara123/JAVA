package week5;

abstract class Shape {
	private String name; // 도형이름
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract double getArea();
}

class Triangle extends Shape{
	private double x; //밑변의 길이
	private double y; //높이
	
	public Triangle(String name, double x, double y) {
		super(name);
		this.x = x;
		this.y = y;
	}
	
	public double getArea() {
		return x*y*0.5;
	}
}

class Circle extends Shape{
	private double x; //반지름
	private double y; //파이값
	
	public Circle(String name, double x, double y) {
		super(name);
		this.x = x;
		this.y = y;
	}
	
	public double getArea() {
		return x*x*y;
	}
}