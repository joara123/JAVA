package week7;

public class Answer_04 {
	public static void main(String[] args) {
		Func1 sub = (a, b) -> a - b;
		Func1 add = (a, b) -> a + b;
		Func1 mul = (a, b) -> a * b;
		Func1 squ = (a, b) -> {
			int num = 1;
			for(int i = 0 ; i < b ; i++) {
				num *= a;
			}
			return num;
		};
		
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random() * 10);
		
		System.out.println("result>> "+add.calc(num1, num2));
		System.out.println("result>> "+sub.calc(num1, num2));
		System.out.println("result>> "+mul.calc(num1, num2));
		System.out.println("result>> "+squ.calc(num1, num2));
	}
}