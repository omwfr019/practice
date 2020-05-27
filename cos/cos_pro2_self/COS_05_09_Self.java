package cos_self;

import java.util.Arrays;

public class COS_05_09_Self {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(new int[] {90, 87, 87, 23, 35, 28, 12, 46})));
		System.out.println(Arrays.toString(solution(new int[] {10, 20, 20, 30})));
	}
	
	static int[] solution(int[] score) {
		int[] rank = new int[score.length];
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j]) rank[i]++;
			}
			rank[i]++;
		}
		
		return rank;
	}

}
