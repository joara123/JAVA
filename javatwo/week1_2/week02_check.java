package week1_2;

import java.util.Scanner;

class NumberBox{
	public int ivalue;
	public float fvalue;
	
	public NumberBox(int ivalue, float fvalue) {
		this.ivalue = ivalue;
		this.fvalue = fvalue;
	}
}

class Rectangle
{
	int width, height;
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	int area() {
		return width*height;
	}
	int perimeter() {
		return width*2 + height*2;
	}
}

//2. ��¥�� ��Ÿ���� Ŭ���� Date�� ������. Date�� ����, ��, �� ���� �Ӽ��� ������,
//��¥�� ��2012.7.12���� ���� ����ϴ� �޼ҵ� print1(), 
//��¥�� ��July 12, 2012���� ���� ����ϴ� print2() ���� �޼ҵ带 ������. 
//Date Ŭ������ �ۼ��ϰ� ��ü�� �����Ͽ��� �׽�Ʈ�϶�. 

class Date{
	int year;
	int month;
	int day;
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	String print1() {
		return year+"."+month+"."+day;
	}
	String print2() {
		if(month == 1) {
			return "January"+" "+day+", "+year;
		}
		else if(month == 2) {
			return "February"+" "+day+", "+year;
		}
		else if(month == 3) {
			return "March"+" "+day+", "+year;
		}
		else if(month == 4) {
			return "April"+" "+day+", "+year;
		}
		else if(month == 5) {
			return "May"+" "+day+", "+year;
		}
		else if(month == 6) {
			return "June"+" "+day+", "+year;
		}
		else if(month == 7) {
			return "July"+" "+day+", "+year;
		}
		else if(month == 8) {
			return "August"+" "+day+", "+year;
		}
		else if(month == 9) {
			return "September"+" "+day+", "+year;
		}
		else if(month == 10) {
			return "September"+" "+day+", "+year;
		}
		else if(month == 11) {
			return "November"+" "+day+", "+year;
		}
		else if(month == 12) {
			return "December"+" "+day+", "+year;
		}
		else {
			return "It's a month that doesn't exist.";
		}
	}
}

//3.	Circle ��ü�� �ʵ� ���� �ʱ�ȭ �� �� ���̸� ����Ͽ� ����ϴ� ���α׷��� �ϼ��Ͻÿ�. 
//��, ũ�Ⱑ 5�� ��ü �迭�� �����Ͽ� ó���ϰ�, �Է� ���� ���� ������ �Ű������� �����Ͽ� �ʵ带 �ʱ�ȭ �Ҽ� �ֵ��� �Ͻÿ�.  

class Circle{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
		System.out.printf("radius = %.2f\n", radius);
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class week02_check {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Circle[] circle = new Circle[5];
		for(int i = 0 ; i < 5 ; i++) {
			circle[i] = new Circle(in.nextDouble());
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf(i+"] Area: %.2f\n",circle[i].getArea());
		}
		
		/*
		Date date = new Date(2012, 7, 12);
		
		System.out.println(date.print1());
		System.out.println(date.print2());*/
		/*
		NumberBox numberbox = new NumberBox(10, (float)1.2645);
		System.out.println(numberbox.ivalue+" "+numberbox.fvalue);*/
		/*
		Rectangle myRect = new Rectangle();
		myRect.width = 10;
		myRect.height = 20;
		System.out.println("����: "+myRect.area());*/
		/*
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("����: "+rectangle.area());
		System.out.println("�ѷ�: "+rectangle.perimeter());	*/
	}
}