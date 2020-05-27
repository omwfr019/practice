package cos_self;

import java.util.Arrays;

public class COS_03_01_Self {

	public static void main(String[] args) {
		int[] scores = {20, 60, 98, 59};
		int n = 3;
		System.out.println(solution(scores, n));
	}
	
	static int solution(int[] scores, int n) {
		int rank = 0;
		int nScore = scores[n];
		
		Arrays.sort(scores);
		
		for(int i=scores.length-1; i>=0; i--) {
			rank++;
			if(scores[i] == nScore) {
				break;
			}
		}
		
		return rank;
	}

}
