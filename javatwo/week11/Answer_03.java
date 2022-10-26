package week11;

import java.util.Calendar;

public class Answer_03 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		//(3)	오늘 날짜의 년, 월, 일을 출력하세요. (Calendar 클래스 이용)
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘은 "+year+"년 "+month+"월 "+day+"일 입니다.");
	}
}
