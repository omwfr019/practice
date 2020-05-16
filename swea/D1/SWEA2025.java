package swea.D1;

import java.util.Scanner;

// 2025. N줄덧셈
public class SWEA2025 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=1; i<=num; i++) sum += i;
		System.out.println(sum);
	}

}
