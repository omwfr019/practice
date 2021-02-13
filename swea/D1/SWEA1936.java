package swea.D1;

import java.util.Scanner;

// 1936. 1대 1 가위바위보
public class SWEA1936 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		getRPSWinner_1(a, b);
		getRPSWinner_2(a, b);
	}
	
	static void getRPSWinner_1(int a, int b) {	// approach 1
		char result = 'A';
		switch(a) {
			case 1:
				if(b==2) result= 'B'; break;
			case 2:
				if(b==3) result= 'B'; break;
			case 3:
				if(b==1) result= 'B'; break;
		}
		System.out.println(result);
	}
	
	static void getRPSWinner_2(int a, int b) {	// approach 2.0
		char result = 'A';
		
        	if (a-b == -1 || a-b == 2) {
        	    result = 'B';
        	}
        	
        	System.out.println(result);
	}
	
	static void getRPSWinner_2(int a, int b) {	// approach 2.1
        	if (a-b == -1 || a-b == 2) {
        	    System.out.println("B");
        	} else {
		    System.out.println("A");
		}
	}
}
