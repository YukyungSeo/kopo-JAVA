package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataMain {

	public static void main(String[] args) {

		// toString() @Ovrride
//		int[] a = new int[5];
//		a.toString();
//		"".toString();

		// 출력 : 오늘은 2022년 3월 23일(수)입니다

		// Date class
//		Date d = new Date();
//		System.out.println(d);
//		
//		int year = d.getYear() + 1900;
//		int month = d.getMonth() + 1;
//		int date = d.getDate();
//		int day = d.getDay(); // 0 ~ 6
//		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
//		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다");

		// Calendar class
//		Calendar c = Calendar.getInstance();
//		System.out.println(c);
//
//		int year = c.get(Calendar.YEAR);
//		int month = c.get(Calendar.MONTH) + 1;
//		int date = c.get(Calendar.DAY_OF_MONTH);
//
//		String[] week = { "", "일", "월", "화", "수", "목", "금", "토" };
//		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
//
//		System.out.println("오늘은 " + year + "년 " + month + "월 " + date + "일(" + week[day] + ")입니다");
//		
//		
//		// 2020년 2월 20일 요일???
//		c.set(2020, 2-1, 20);
//		day = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println("2020/02/20 " + week[day] + "요일");
//
//		int lastday = c.getActualMaximum(Calendar.DATE);
//		System.out.println(lastday);
//		
//		Date d = c.getTime();
//		System.out.println(d);
		
		
		// SimpleDateFormat class
//		String pattern = "yyyy-MM-dd hh:mm:ss(E)";
		String pattern = "yyyy년도 MM월 dd일 hh시 mm분 ss초 (E요일)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
	}
}
