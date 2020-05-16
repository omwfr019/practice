package swea.D2;

import java.util.Scanner;

public class SWEA1948 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] date = {31,28,31,30,31,30,31,31,30,31,30,31};
        int m1, d1, m2, d2 = 0;
        
        for(int test_case=1; test_case<=T; test_case++) {
        	int re = 0;
            m1 = sc.nextInt(); d1 = sc.nextInt();
            m2 = sc.nextInt(); d2 = sc.nextInt();

            for(int i=m1; i<m2; i++) {
            	for(int j=d1; j<=date[i-1]; j++) {
            		re++;
            		d1 = 1;
            	}
            }
            re += d2;
            
            System.out.println("\n#"+test_case +" "+ re);
        }
	}

}
