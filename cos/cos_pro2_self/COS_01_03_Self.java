package cos_self;

import java.util.Scanner;

public class COS_01_03_Self {
	
	static int solution(int startmonth, int startday, int endmonth, int endday) {
		int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int result = 0;
		
		for(int i=startmonth; i<endmonth; i++) {
			result += dayOfMonth[i-1];
		}
		result += endday;
		result -= startday;
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start_month = sc.nextInt();
		int start_day = sc.nextInt();
		int end_month = sc.nextInt();
		int end_day = sc.nextInt();
		int result = solution(start_month, start_day, end_month, end_day);
		System.out.println(end_month+"월 "+end_day+"일은 "+start_month+"월 "+start_day+"일로부터 "+result+"일만큼 지난 날입니다.");
	}
	
}
