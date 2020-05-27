package cos_self;

public class COS_01_07_Self {
	
	static int solution(int[] scores, int scoreslen) {
		int result = 0;
		for(int i=0; i<scoreslen; i++) {
			if(650<=scores[i] && scores[i]<800) {
				result++;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {650, 722, 914, 558, 714, 803, 650, 679, 669, 800}, 10));
	}
	
}
