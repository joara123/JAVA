package week9;

import java.util.*;

class NotUseidException extends Exception{
	public NotUseidException(String message) {
		super(message);
	}
}

public class Answer_05 {
	public static void checkID(String id) throws NotUseidException{
		if (id.length() >= 8 && 65 <= id.charAt(0) && id.charAt(0) <= 122) {
			System.out.println(id+"�� ����� �� �ִ� ���̵� �Դϴ�.");
		}
		else {
			throw new NotUseidException(id+"�� ����� �� ���� ���̵� �Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String id = "";
		
		System.out.println("���̵� �Է��ϼ���");
		id = in.next();
		
		try {
			checkID(id);
		} catch (NotUseidException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
}
