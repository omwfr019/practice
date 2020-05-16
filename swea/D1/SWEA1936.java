package swea.D1;

import java.util.Scanner;

// 1936. 1대 1 가위바위보
public class SWEA1936 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		char result = 'A';
		switch(a) {
			case 1:
				if(b==2) result= 'B'; break;
			case 2:
				if(b==3) result= 'B'; break;
			case 3:
				if(b==1) result= 'B'; break;
		}
		System.out.println(result);
	}

}
