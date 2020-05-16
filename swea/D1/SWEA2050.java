package swea.D1;

import java.util.Scanner;

// 2050. 알파벳을 숫자로 변환
public class SWEA2050 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if('a'<=ch&&ch<='z') System.out.print(ch-96 + " ");
			else if('A'<=ch&&ch<='Z') System.out.print(ch-64 + " ");
		}
	}

}
