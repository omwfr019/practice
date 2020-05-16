package swea.D2;

import java.util.Scanner;

// 1285. 아름이의 돌 던지기
public class SWEA1285 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); //test case
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int person = sc.nextInt();
			int distance[] = new int[person];
			
			int result = 100000;
			int cnt = 0;
			for(int i=0; i<person; i++) {
				distance[i] = sc.nextInt();
				if(result>Math.abs(distance[i])) {
					result = Math.abs(distance[i]);
					cnt=1;
				} else if(result==Math.abs(distance[i])) {
					cnt++;
				}
			}
			System.out.printf("#%d %d %d", test_case, result, cnt);
		}
	}

}
