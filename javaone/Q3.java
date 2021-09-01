import java.util.Scanner;
public class Q3{
	public static void main(String[] args){
		Scanner key=new Scanner(System.in);
		int age, year;

		System.out.print("태어난 연도를 입력하세요 >>> ");
		year=key.nextInt();

		age=2019-year+1;
		System.out.println("나이:"+age);
	}
}