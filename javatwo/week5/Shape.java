package week5;

abstract class Shape {
	private String name; // �����̸�
	
	public Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	abstract double getArea();
}

class Triangle extends Shape{
	private double x; //�غ��� ����
	private double y; //����
	
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
	private double x; //������
	private double y; //���̰�
	
	public Circle(String name, double x, double y) {
		super(name);
		this.x = x;
		this.y = y;
	}
	
	public double getArea() {
		return x*x*y;
	}
}