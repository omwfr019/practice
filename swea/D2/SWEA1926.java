package swea.D2;

import java.util.Scanner;

// 1926. 간단한 369게임
public class SWEA1926 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=1; i<=N; i++) {
        	String str = Integer.toString(i);
        	
        	int cnt = 0;
        	for(int j=0; j<str.length(); j++) {
        		if( str.substring(j, j+1).equals("3") ||
        				str.substring(j, j+1).equals("6") ||
        				str.substring(j, j+1).equals("9") )
        			++cnt;
        	}
        	
        	if(cnt>0) {
        		for(int k=0; k<cnt; k++) System.out.print("-");
        	}
        	else System.out.print(i);
        	System.out.print(" ");
        }
	}

}
