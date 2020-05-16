package swea.D2;

import java.util.Scanner;

// 1976. 시각 덧셈
public class SWEA1976 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case=1; test_case<=T; test_case++) {
            int h1 = sc.nextInt(); int m1 = sc.nextInt();
            int h2 = sc.nextInt(); int m2 = sc.nextInt();
            int hour= 0, min= 0;
            
            hour = (h1+h2)%12;
            if(hour==0) hour = 12;
            
            min = m1+m2;
            if(min>=60) {
            	hour++;
            	min -= 60;
            }
            
            System.out.println("#"+test_case +" "+ hour +" "+ min);
        }
	}

}
