package swea.D1;

import java.util.Scanner;

// 2029. 몫과 나머지 출력하기
public class SWEA2029 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.printf("#%d %d %d\n", test_case, a/b, a%b);
		}
	}

}
