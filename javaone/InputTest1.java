import java.util.Scanner;
public class InputTest1{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x, y;
		int result;
		String str;
		
		System.out.print("ù��° ���ڸ� �Է��Ͻÿ�: ");
		x = input.nextInt();

		System.out.print("�ι�° ���ڸ� �Է��Ͻÿ�: ");
		y = input.nextInt();

		result = x+y;
		System.out.println(x+"+"+y+"="+result);

		result = x/y;
		System.out.println(x+"/"+y+"="+result);

		result = x%y;
		System.out.println(x+"%"+y+"="+result);
	}
}