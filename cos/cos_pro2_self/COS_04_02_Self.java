package cos_self;

public class COS_04_02_Self {

	public static void main(String[] args) {
		int[][] scores1 = {{30,40,100}, {97,88,95}};
		System.out.println(solution(scores1));
		
		int[][] scores2 = {{90,88,70}, {85,90,90}, {100,100,70}, {30,90,80}, {40,10,20}, {83,88,80}};
		System.out.println(solution(scores2));
	}
	
	static int solution(int[][] scores) {
		int result = 0;
		int pass = 0;
		boolean pass2 = false;
		
		for(int i=0; i<scores.length; i++) {
			pass = 0;
			pass2= false ;
			
			if(scores[i][0] >= 80) {
				pass++;
			}
			if(scores[i][1] >= 88) {
				pass++;
			}
			if(scores[i][2] >= 70) {
				pass++;
			}
			
			if(scores[i][0]>=40 && scores[i][1]>=44 && scores[i][2]>=35) {
				pass2 = true;
			}
			
			if(pass>=1 && pass2) result++;
		}
		
		return result;
	}

}
