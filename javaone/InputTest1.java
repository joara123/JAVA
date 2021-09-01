import java.util.Scanner;
public class InputTest1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x, y;
		int result;
		String str;
		
		System.out.print("첫번째 숫자를 입력하시오: ");
		x = input.nextInt();

		System.out.print("두번째 숫자를 입력하시오: ");
		y = input.nextInt();

		result = x+y;
		System.out.println(x+"+"+y+"="+result);

		result = x/y;
		System.out.println(x+"/"+y+"="+result);

		result = x%y;
		System.out.println(x+"%"+y+"="+result);
	}
}