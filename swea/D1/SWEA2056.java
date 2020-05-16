package swea.D1;

import java.util.Scanner;

// 2056. 연월일 달력
public class SWEA2056 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			boolean bool = false;
			String date = sc.next();
			if(date.length()!=8) { //8�ڸ� �˻�
				System.out.println("#"+test_case + " -1");
				continue;
			}
			
			int chkDate = Integer.parseInt(date);
			int day = chkDate%100;
			int month = (chkDate/100)%100;
			
			switch(month) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					if(1<=day&&day<=31) bool = true;
					break;
				case 4: case 6: case 9: case 11:
					if(1<=day&&day<=30) bool = true;
					break;
				case 2:
					if(1<=day&&day<=28) bool = true;
					break;
			}
			
			if(bool==false) {
				System.out.println("#"+test_case + " -1");
				continue;
			}

			System.out.println(date.substring(0,4)+"/"+date.substring(4,6)+"/"+date.substring(6,8));
		}
	}
}
