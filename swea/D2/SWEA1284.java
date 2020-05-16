package swea.D2;

import java.util.Scanner;

// 1284. 수도 요금 경쟁
public class SWEA1284 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //test case
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int P = sc.nextInt(); //1L당 요금 (A사)
			int Q = sc.nextInt(); //R리터 이하 요금 (B사)
			int R = sc.nextInt();
			int S = sc.nextInt(); //1L당 요금 (B사)
			int W = sc.nextInt(); //한 달간 사용하는 수도 양(L)
			
			int a = W * P;
			int b;
				if(W<R) b = Q;
				else b = S*(W-R)+Q;
				
			if(a<b) System.out.println("#"+test_case +" "+ a);
			else System.out.println("#"+test_case +" "+ b);
		}
	}

}
