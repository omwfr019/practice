package swea.D2;

import java.util.Scanner;

// 1983. 조교의 성적 매기기
public class SWEA1983 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        String[] grade = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
        
        for(int test_case=1; test_case<=T; test_case++) {
        	int N = sc.nextInt();
        	int K = sc.nextInt();
        	
        	double sum[] = new double[N];
        	for(int i=0; i<N; i++)
        		sum[i] = sc.nextInt()*0.35 + sc.nextInt()*0.45 + sc.nextInt()*0.2;
        	
        	int re = 0;
        	for(int i=0; i<N; i++) 
        		if(sum[i]<=sum[K-1]) ++re;
        	
        	if(re%(N/10)==0) re = re/(N/10) - 1;
        	else re = re/(N/10);
        	
        	System.out.println("#"+test_case +" "+ grade[re]);
        }
	}

}
