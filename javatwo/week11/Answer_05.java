package week11;

import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Scanner;

public class Answer_05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���: ");
		String str = in.nextLine();
		
		StringTokenizer st = new StringTokenizer(str, " ");
		int countT = st.countTokens();

		String[] arr = new String[countT];
		System.out.println("\n���� �� ���: ");
		for(int i = 0 ; i < countT ; i++) {
			String to = st.nextToken();
			System.out.print(to+"	");
			arr[i] = to;
		}
		
		System.out.println("\n���� �� ���: ");
		Arrays.sort(arr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+"	");
		}
	}
}
