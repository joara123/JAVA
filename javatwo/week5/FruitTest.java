package week5;

public class FruitTest {
	public static void main(String[] args) {
		Fruit[] fary = new Fruit[4];
		fary[0] = new Fruit();
		fary[1] = new Apple();
		fary[2] = new Grape();
		fary[3] = new Pear();
		
		for(Fruit obj : fary) {
			System.out.println(obj.me());
		}
	}
}
