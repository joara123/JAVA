package week5;

public class Fruit {
	public String me() {
		return "나는 과일";		
	}
}

class Apple extends Fruit{
	public String me() {
		return "나는 사과";
	}
}
class Grape extends Fruit{
	public String me() {
		return "나는 포도";
	}
}
class Pear extends Fruit{
	public String me() {
		return "나는 배";
	}
}