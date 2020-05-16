package swea.D2;

import java.util.Scanner;

// 1984. 중간 평균값 구하기
public class SWEA1984 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case=1; test_case<=T; test_case++) {
        	int num = 0;
        	int max=0, min=0;
        	int sum=0;
        	
        	for(int i=0; i<10; i++) {
        		num = sc.nextInt();
        		if(max<num) max= num;
        		if(min>num) min= num;
        		sum += num;
        	}
        	
        	System.out.println("#"+test_case +" "+ (sum-max-min)/8);
        }
	}

}
