package cos_self;

import java.util.Scanner;

public class COS_01_04_Self { //해답참고
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(solution(new int[] {1,2,3,3,1,3,3,2,3,2}, 10));
	}

	static int[] func_a(int[] arr, int arrlen) {
		int[] counter = new int[1001];
		for(int i=0; i<arrlen; i++) {
			counter[arr[i]]++;
		}
		return counter;
	}
	
	static int func_b(int[] arr, int arrlen) {
		int ret = 0;
		for(int i=0; i<arrlen; i++) {
			if(ret < arr[i]) ret = arr[i];
		}
		return ret;
	}
	
	static int func_c(int[] arr, int arrlen) {
		int ret = 1001;
		for(int i=0; i<arrlen; i++) {
			if(arr[i] != 0 && ret > arr[i]) ret = arr[i];
		}
		return ret;
	}
	
	static int solution(int arr[], int arrlen) {
		int[] counter = func_a(arr, arrlen);
		int max_cnt = func_b(counter, 1001);
		int min_cnt = func_c(counter, 1001);
		return max_cnt/min_cnt;
	}
	
}
