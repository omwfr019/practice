package swea.D1;

import java.util.Scanner;

// 1545. 거꾸로 출력해 보아요
public class SWEA1545 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=n; i>=0; i--)
			System.out.print(i +" ");
	}

}
