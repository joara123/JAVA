package week3;

import java.util.*;

public class DogTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Dog[] dog = new Dog[5];
		//객체 배열
		
		dog[0] = new Dog(10, "black", 5);
		dog[1] = new Dog(5, "white", 1);
		dog[2] = new Dog(16, "brown", 10);
		dog[3] = new Dog(1, "white and black", 7);
		dog[4] = new Dog(3, "gray", 2);
		
		dog[0].barking();
		dog[1].sleeping(2);
		
		for(Dog obj : dog) {
			System.out.println(obj);
		}
		System.out.println("====================");
		System.out.print("색 입력: ");
		String col = in.next();
		for(Dog obj : dog) {
			if(col.equals(obj.getColor())) {
				System.out.println("가지고 있는 간식 수: "+obj.getFood());
			}
		}
	}
}
