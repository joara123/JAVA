package week5;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal2[] pets = {
				new Cat("Nabee"),
				new Dog2(),
				new Cat(),
				new Dog2(),
				new Dog2("Rock")
		};
		
		for(Animal2 ani : pets) {
			System.out.print("\n"+ani+"_"+ani.rection(ani));
			ani.sound();
		}
		System.out.println("\n\nPet들 중 Dog는 "+Dog2.getCountDog()+"마리\n");
	}
}
