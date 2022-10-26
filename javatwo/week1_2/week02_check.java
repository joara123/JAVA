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

//2. 날짜를 나타내는 클래스 Date를 만들어보자. Date는 연도, 월, 일 등의 속성을 가지며,
//날짜를 “2012.7.12”과 같이 출력하는 메소드 print1(), 
//날짜를 “July 12, 2012”와 같이 출력하는 print2() 등의 메소드를 가진다. 
//Date 클래스를 작성하고 객체를 생성하여서 테스트하라. 

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

//3.	Circle 객체의 필드 값을 초기화 한 후 넓이를 계산하여 출력하는 프로그램을 완성하시오. 
//단, 크기가 5인 객체 배열을 생성하여 처리하고, 입력 받은 값을 생성자 매개변수로 전달하여 필드를 초기화 할수 있도록 하시오.  

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
		System.out.println("면적: "+myRect.area());*/
		/*
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println("넓이: "+rectangle.area());
		System.out.println("둘레: "+rectangle.perimeter());	*/
	}
}