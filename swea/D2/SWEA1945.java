package swea.D2;

import java.util.Scanner;

// 1945. 간단한 소인수분해
public class SWEA1945 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        int[] ary = {2,3,5,7,11};
        int[] re;
        for(int t=1; t<=T; t++) {
            int N = sc.nextInt();
            
            re = new int[] {0,0,0,0,0};
            for(int i=0; i<5; i++) {
            	while(N%ary[i]==0) {
            		re[i] += 1;
            		N /= ary[i];
            	}
            }
            System.out.printf("#%d %d %d %d %d %d\n", t, re[0], re[1], re[2], re[3], re[4]);
        }
	}

}
