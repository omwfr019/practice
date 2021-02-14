package swea.D1;

import java.util.Scanner;

// 1938. 아주 간단한 계산기
public class SWEA1938 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
	}

}
