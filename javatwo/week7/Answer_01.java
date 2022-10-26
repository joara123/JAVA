package week7;

public class Answer_01 {
	public static void main(String[] args) {
		//익명 구현 객체
		Action ac = new Action() { //인터페이스 객체 생성이 아니라 인터페이스를 구현하는 이름없는 익명 클래스에 대해 객체 생성
			public void move() {
				System.out.println("익명구현 move");
			}
		};
		
		//람다식으로 구현 (함수(펑션) 인터페이스: 추상메소드 하나 가지고 잇는 인터페이스)
		Action ac2 = () -> {System.out.println("람다식구현 move");};
		
		//익명 구현 객체로 메소드 호출
		ac.move();
		
		//람다식으로 메소드 호출
		ac2.move();
	}
}
