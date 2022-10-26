package week6;

public class Answer5 {
	public static void main(String[] args) {
		Person2[] per = new Person2[6];
		
		per[0] = new Person2();
		per[1] = new Person2("benny", 20);
		per[2] = new Student("0", 0);
		per[3] = new Student("2015", 3);
		per[4] = new Staff(0, "1");
		per[5] = new Staff(8, "2");
		
		for(Person2 obj : per) {
			System.out.println(obj.toString());
		}
	}
}
