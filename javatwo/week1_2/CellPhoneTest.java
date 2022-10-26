package week1_2;

import java.util.Scanner;

public class CellPhoneTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("폰 번호 >> ");
		String number = in.next();
		CellPhone cellphone = new CellPhone(number);
		
		System.out.println(cellphone.toString());
		System.out.println();
		
		cellphone.powerToggle();
		System.out.println("전원 버튼 클릭");
		System.out.println(cellphone.toString());
		
		cellphone.powerToggle();
		System.out.println("전원 버튼 클릭");
		System.out.println(cellphone.toString());
	}
}