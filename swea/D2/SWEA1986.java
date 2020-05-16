package swea.D2;

import java.util.Scanner;

// 1986. 지그재그 숫자
public class SWEA1986 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case=1; test_case<=T; test_case++) {
        	int N = sc.nextInt();
        	
        	int sum = 0;
        	for(int i=1; i<=N; i++) {
        		if(i%2==0) sum += i;
        		else sum -= i;
        		
        		// sum += ( (i%2==0) ? -1 : 1 ) * i;
        	}
        	
        	System.out.println("#"+test_case +" "+ sum);
        }
	}

}
