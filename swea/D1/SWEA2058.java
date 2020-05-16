package swea.D1;

import java.util.Scanner;

// 2058. 자릿수 더하기
public class SWEA2058 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int length = (int)(Math.log10(num)+1);

		int sum = 0;
		for(int i=0; i<length; i++) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
	}

}
