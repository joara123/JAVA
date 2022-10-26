package week5;

public class AnimalTest {
	public static void play(Animal ani) {
		ani.run();
		ani.sound();
	}
	
	public static void main(String[] args) {
		Animal animal = new Baby("신생아");
		play(animal);
		animal = new Dog("강아지");
		play(animal);
		
		//play(new Baby("신생아"));
		//play(new Dog("강아지")); 매개변수 다향성
	}
}
