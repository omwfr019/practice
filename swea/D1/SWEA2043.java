package swea.D1;

import java.util.Scanner;

// 2043. 서랍의 비밀번호
public class SWEA2043 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int P = sc.nextInt();
		int K = sc.nextInt();
		
		//int cnt = 0;
		//for(int i=K; i<=P; i++) { cnt++; }
		//System.out.println(cnt);
		
		System.out.println(P-K+1);
	}

}
