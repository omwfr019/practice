package java200;

/* 사용자 정의 만년 달력 만들기 */
public class JCalendar {
	public int[] LEAPY = {31,29,31,30,31,30,31,31,30,31,30,31};
	public int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean isLeapYear(int year) {
		boolean isS = false;
		if( (year%4==0)&&(year%100!=0)||(year%400==0) ) {
			isS = true;
		}
		return isS;
	}
	
	public int total(int year) {	// total 오버로딩
		int tot = 0;
		for(int i=1; i<year; i++) {
			if(isLeapYear(i)) {
				tot += 366;
			} else {
				tot += 365;
			}
		}
		return tot;	// 1~year년까지의 총 일수
	}
	public int total(int year, int month) {	// total 오버로딩
		int tot = total(year);
		for(int i=1; i<month; i++) {
			if(isLeapYear(year)) {
				tot += LEAPY[i-1];
			} else {
				tot += PLAIN[i-1];
			}
		}
		return tot;	// 1~year년 + 1~month월까지의 총 일수
	}
	public int total(int year, int month, int date) {	// total 오버로딩
		int tot = total(year, month);
		return tot+date;	// 1~year년 + 1~month월 + 1~date일까지의 총 일수
	}
	
	public int lastDay(int year, int month) {
		int tot = 0;
		if(isLeapYear(year)) {
			tot = LEAPY[month-1];
		} else {
			tot = PLAIN[month-1];
		}
		return tot;
	}
	
	public void showCal(int year, int month) {
		String s1 = String.format("\t\t%d년\t%d월", year, month);
		String t1 = String.format("일\t월\t화\t수\t목\t금\t토");
		System.out.println(s1);
		System.out.println(t1);
		int dateOfMonth = (1+total(year, month, 1)-1)%7;	// 1년 1월 1일 월요일(1)에서 경과일 total(year, month, 1)-1을 더하여 요일을 구함. 1년 1월 1일을 빼기 위해 -1
		for(int i=0; i<dateOfMonth; i++) {	// 시작 요일 전을 공백으로 채움 (요일=공백 수)
			System.out.print("\t");
		}
		for(int i=1; i<lastDay(year, month); i++) {
			System.out.printf("%d\t", i);
			if((i+dateOfMonth)%7==0) {	// 토요일이라면 한 줄 아래로 이동 (토요일 = 공백수 또는 요일과 날짜의 합)
				System.out.println();
			}
		}
		System.out.println("\n-----------------------------------------------------");
	}
	
	public void showCal(int year) {	// 해당 연도의 1월~12월을 모두 출력
		String s1 = String.format("<\t\t\t%d년>", year);
		System.out.println(s1);
		for(int i=1; i<13; i++) {
			showCal(year, i);
		}
	}
	
	public static void main(String[] args) {
		JCalendar cal = new JCalendar();
		cal.showCal(2020);
	}
}
