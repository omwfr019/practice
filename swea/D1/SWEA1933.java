package swea.D1;

import java.util.Scanner;

// 1933. 간단한 N의 약수
public class SWEA1933 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if(1<=N&&N<=1000) {
			for(int i=1; i<=N; i++) {
				if(N%i==0) System.out.print(i + " ");
			}
		}
	}

}
