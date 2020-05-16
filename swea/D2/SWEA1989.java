package swea.D2;

import java.util.Scanner;

// 1989. 초심자의 회문 검사
public class SWEA1989 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        
        for(int test_case=1; test_case<=T; test_case++) {
        	String str = sc.next();
        	char ch[] = str.trim().toCharArray();
        	
        	int re = 1;
        	for(int i=0; i<str.length(); i++)
        		 if(ch[i] != ch[ch.length-i-1]) re = 0;
        	
        	System.out.println("#"+test_case +" "+ re);
        }
	}

}
