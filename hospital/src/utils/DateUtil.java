package utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static ArrayList<String> next7Days() {
		ArrayList<String> days = new ArrayList<String>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		for (int i=0; i<7; i++) {
			cal.add(Calendar.DATE, 1);
			days.add(dateFormat.format(cal.getTime()) + "<br/>(" + getDayOfWeekday(cal) +")");
		}
		return days;
	}
	
	public static String getDayOfWeekday(Calendar cal) {
		String[] weekDays = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK)-1;
		if(dayOfWeek<0) {
			dayOfWeek=0;
		}
		return weekDays[dayOfWeek];
	}
}
