package swea.D2;

import java.util.Scanner;

// 1204. [S/W 문제해결 기본] 1일차 - 최빈수 구하기
public class SWEA1204 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			if(test_case==sc.nextInt()) {
				int score[] = new int[1000];
				int max=0, cnt=0, re=0;
				
				for(int i=0; i<score.length; i++)
					score[i] = sc.nextInt();
					
				for(int i=0; i<score.length; i++) {
					cnt = 0;
					for(int j=0; j<score.length; j++) {
						if(score[i]==score[j]) cnt++;
						//System.out.println("i="+i+", max="+max+", cnt="+cnt+", score[i]="+score[i]+", score[j]="+score[j]);
					}
					if(max < cnt) {
						max = cnt;
						re = score[i];
					}
				}
				
				System.out.println("#"+test_case +" "+ re);
			}
		}
	}

}
