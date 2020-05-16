package swea.D2;

import java.util.Scanner;

// 1970 쉬운 거스름돈
public class SWEA1970 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int won[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int re[] = new int[8];
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int money = sc.nextInt();
			
			System.out.println("#"+test_case);
			for(int i=0; i<8; i++) {
				re[i] = money / won[i];
				money %= won[i];
				System.out.print(re[i] +" ");
			}
		}
	}

}
