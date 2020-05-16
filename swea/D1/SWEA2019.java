package swea.D1;

import java.util.Scanner;

// 2019. 더블더블
public class SWEA2019 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int re = 1;
		for(int i=0; i<=cnt; i++) {
			System.out.print(re +" ");
			re *= 2;
			
			//System.out.print((int)Math.pow(2, i)+" ");
		}
	}

}
