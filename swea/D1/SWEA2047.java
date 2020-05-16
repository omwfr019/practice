package swea.D1;

import java.util.Scanner;

// 2047. 신문 헤드라인
public class SWEA2047 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if('a'<=ch&&ch<='z') {
				System.out.print((char)(ch-32));
				continue;
			}
			System.out.print(ch);
		}
		
		/* 메소드 사용
		 * 	String str = sc.next();
			System.out.println(str.toUpperCase());
		 */
	}

}
