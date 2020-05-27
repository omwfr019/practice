package cos_self;

import java.util.Arrays;

public class COS_03_03_Self {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{35, 28, 98, 34, 20, 50, 85, 74, 71, 7}));
		System.out.println(solution(new int[]{1,1,1,1,1}));
	}
	
	static int solution(int[] scores) {
		int score = 0;
		
		Arrays.sort(scores);
		int sum = 0;
		for(int i=1; i<scores.length-1; i++) {
			sum += scores[i];
		}
		score = sum/(scores.length-2);
		
		return score;
	}
	
}
