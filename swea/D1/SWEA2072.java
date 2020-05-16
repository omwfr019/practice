package swea;

import java.util.Scanner;

//2072. 홀수만 더하기
public class SWEA2072 {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int sum = 0;
			for (int l=0; l<10; l++) {
				int num = sc.nextInt();
				if(num%2!=0) sum += num;
			}
			System.out.println("#"+test_case + " " + sum);
		}
	}

}
