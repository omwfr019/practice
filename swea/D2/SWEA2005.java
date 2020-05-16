package swea.D2;

import java.util.Scanner;

// 2005. 파스칼의 삼각형
public class SWEA2005 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case=1; test_case<=T; test_case++) {
        	int N = sc.nextInt();
        	int ary[][] = new int[N][N];
        	
        	for(int i=0; i<N; i++) {
        		if(i==0) { ary[0][0] = 1; continue; }
        		for(int j=0; j<=i; j++) {
        			if(j==0 || j==i) ary[i][j]=1;
        			else ary[i][j] = ary[i-1][j-1] + ary[i-1][j];
        		}
        	}
        	
        	System.out.println("#"+test_case);
        	for(int i=0; i<N; i++) {
        		for(int j=0; j<N; j++) {
        			if(ary[i][j]==0) System.out.print(" ");
        			else System.out.print(ary[i][j]+" ");
        		}
        		System.out.println();
        	}
        }
	}

}
