package week1_2;

import java.util.Scanner;

public class CellPhoneTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("�� ��ȣ >> ");
		String number = in.next();
		CellPhone cellphone = new CellPhone(number);
		
		System.out.println(cellphone.toString());
		System.out.println();
		
		cellphone.powerToggle();
		System.out.println("���� ��ư Ŭ��");
		System.out.println(cellphone.toString());
		
		cellphone.powerToggle();
		System.out.println("���� ��ư Ŭ��");
		System.out.println(cellphone.toString());
	}
}