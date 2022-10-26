package week6;

public class Answer4 {
	public static Person getMaximum(Person[] arr) {
		Person per = new Person("", 0);
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				if(arr[i].compareTo(arr[j]) == 1) {
					per = arr[i];
				}
			}
		}
		return per;
	}
	
	public static void main(String[] args) {
		Person[] per = new Person[3];
		
		per[0] = new Person("Benny", 180.0);
		per[1] = new Person("Daniel", 178.0);
		per[2] = new Person("joon", 188.0);
		
		System.out.println("------Person List------");
		for(int i = 0 ; i < per.length ; i++) {
			System.out.println(per[i]);
		}
		System.out.println("가장 키 큰: "+getMaximum(per));
		
		//System.out.println(per[0].compareTo(per[1]));
		
	}
}
