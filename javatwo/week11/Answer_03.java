package week11;

import java.util.Calendar;

public class Answer_03 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		//(3)	���� ��¥�� ��, ��, ���� ����ϼ���. (Calendar Ŭ���� �̿�)
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("������ "+year+"�� "+month+"�� "+day+"�� �Դϴ�.");
	}
}
