package swea.D2;

import java.util.Scanner;

// 1966. 숫자를 정렬하자
public class SWEA1966 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] X = new int[N];
			for(int i=0; i<N; i++) {
				X[i] = sc.nextInt();
			}
			for(int i=0; i<N; i++) {
				for(int j=i; j<N; j++) {
					if(X[i]>X[j]) {
						int temp = X[i];
						X[i] = X[j];
						X[j] = temp;
					}
				}
			}
			System.out.print("\n#"+test_case);
			for(int i=0; i<N; i++)
				System.out.print(" " + X[i]);
		}
	}

}
