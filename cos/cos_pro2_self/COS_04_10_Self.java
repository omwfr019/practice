package cos_self;

public class COS_04_10_Self {

	public static void main(String[] args) {
		int[] scores = {80,90,55,60,59};
		int cutline = 60;
		System.out.println(solution(scores, cutline));
	}
	
	static int solution(int[] scores, int cutline) {
		int result = 0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i] < cutline) continue;
			result++;
		}
		return result;
	}

}
