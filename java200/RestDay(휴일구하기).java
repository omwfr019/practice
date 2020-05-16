package java200;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/* 휴일(토, 일) 구하기 */
public class RestDay {
	public static boolean isRest(Calendar tod) {
		boolean isRest = false;
		if (tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY ||
				tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY) {
			isRest = true;
		}
		return isRest;
	}
	
	// Calendar를 문자열로
	public static String toYMD(Calendar dd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(dd.getTime());
	}
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // 오늘 정보를 저장한 Calendar 생성
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 이번 달의 마지막 날 (Actual: 실제 달의 마지막 날)
		for(int i=1; i<=lastDay; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);	//1일부터 마지막 날까지
			if(isRest(cal)) {	// 휴일(토,일) 확인
				System.out.println(toYMD(cal)+" is Rest Day.");
			}
		}
	}
}
