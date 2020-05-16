package swea.D1;

import java.util.Scanner;

// 2071. 평균값 구하기
public class SWEA2071 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
            double sum = 0;
			for (int n=0; n<10; n++) {
                sum += sc.nextInt();
            }
            System.out.println("#"+test_case + " " + Math.round(sum/10));
		}
	}
}
