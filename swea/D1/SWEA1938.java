package swea.D1;

import java.util.Scanner;

// 1938. 아주 간단한 계산기
public class SWEA1938 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		if((1<=a&&a<=9) && (1<=b&&b<=9)) {
			System.out.println((a+b) +"\n"+ (a-b) +"\n"+ (a*b) +"\n"+ (a/b));
		}
	}

}
