package week1_2;

public class ch6_class {
	int w;
	int h;
	
	public ch6_class(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	int area() {
		return w * h;
	}
	int perimeter() {
		return 2*w + 2*h;
	}
	
	public static void main(String[] args) {
		ch6_class rectangle = new ch6_class(5, 6);
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
	}
}
