package swea.D1;

import java.util.Scanner;

// 2068. 최대수 구하기
public class SWEA2068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
            int max = 0;
            for(int i=0; i<10; i++) {
            	int n = sc.nextInt();
            	if(max < n) max = n;
            }
            System.out.println("#"+test_case + " " + max);
		}
	}

}
