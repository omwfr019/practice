package cos_self;

import java.util.Arrays;

public class COS_01_05_Self {

	static int[] solution(int[] arr, int arrlen) {
		int temp = -1;
		for(int i=0; i<arrlen/2; i++) {
			temp = arr[i];
			arr[i] = arr[arrlen-i-1];
			arr[arrlen-i-1] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5,7,8}, 7)));
	}
	
}
