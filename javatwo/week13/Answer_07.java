package week13;

class MyArray<T>{
	private T[] data;
	
	public MyArray(T[] data) {
		this.data = data;
	}
	
//	public T firstE() {
//		
//	}
//	public T lastE() {
//		
//	}
	public void display() {
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i]+" ");
		}
	}
}

public class Answer_07 {
	public static void main(String[] args) {
		MyArray<Integer> digit = new MyArray<>(new Integer[] { 5, 3, 9, 5, 2, 78, 45, 91 });
		MyArray<Double> real = new MyArray<>(new Double[] { 2.3, 1.2, 67.3, 45.2, 4.2, 66.4 });
		MyArray<Character> ch = new MyArray<>(new Character[] { 'd', 'r', 'q', 'y', 'p', 'b', 's' });

		System.out.println("- Integer 배열 원소 출력 -");
		digit.display();
		System.out.println();
		System.out.println("\n- Double 배열 원소 출력 -");
		real.display();
		System.out.println();
		System.out.println("\n- Character 배열 원소 출력 -");
		ch.display();
		System.out.println();
		
		//System.out.println("----- Integer 배열 첫번째와 마지막 원소: "+digit.firstE()+"/"+digit.lastE());
		//System.out.println("----- Double 배열 첫번째와 마지막 원소: "+real.firstE()+"/"+real.lastE());
		//System.out.println("----- Character 배열 첫번째와 마지막 원소: "+ch.firstE()+"/"+ch.lastE());
	}
}
