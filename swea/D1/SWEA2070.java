package swea.D1;

import java.util.Scanner;

// 2070. 큰 놈, 작은 놈, 같은 놈
public class SWEA2070 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char equ = '>';
            
            if(a==b) equ = '=';
            if(a<b) equ = '<';
            
            System.out.println("#"+test_case + " " + equ);
		}
	}

}
