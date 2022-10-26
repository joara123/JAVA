package week11;

import java.util.Random;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.Calendar;

public class week11_test1 {
	public static void main(String[] args) {
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		
		Calendar now = Calendar.getInstance(timezone);
		int day = now.get(Calendar.DAY_OF_MONTH)-1;
		
		System.out.println(now);
	}
}
