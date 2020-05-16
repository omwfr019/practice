package swea.D2;

import java.util.Scanner;

// 간단한 압축 풀기
public class SWEA1946 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int k=0;
        
        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            
            for(int l=1; l<=N; l++) {
            	String alp = sc.next();
            	int cnt = sc.nextInt();
            	
            	if(k==0) System.out.print("#"+test_case +" ");
            	for(int i=0; i<cnt; i++) {
            		if(k%10==0) System.out.println();
            		System.out.print(alp);
            		k++;
            	}
            }
            k = 0;
        }
	}

}
