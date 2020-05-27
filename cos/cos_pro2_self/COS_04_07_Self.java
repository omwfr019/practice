package cos_self;

import java.util.Arrays;

public class COS_04_07_Self {

	public static void main(String[] args) {
		int[] midScores = {20, 50, 40};
		int[] finalScores = {10, 50, 70};
		System.out.println(Arrays.toString(solution(midScores, finalScores)));
	}
	
	static int[] solution(int[] midScores, int[] finalScores) {
		int[] result = new int[2];
		result[0] = finalScores[0]-midScores[0];
		result[1] = finalScores[0]-midScores[0];
		
		for(int i=0; i<midScores.length; i++) {
			int temp = finalScores[i]-midScores[i];
			if(result[0] < temp) {
				result[0] = temp;
			}
			if(result[1] > temp) {
				result[1] = temp;
			}
		}
		
		return result;
	}

}
