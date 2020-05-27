package cos_self;

public class COS_02_01_Self {

	public static void main(String[] args) {
		int[] leftGloves = {2,1,2,2,4,5};
		int[] rightGloves = {1,2,2,4,4,7,5,5,1};
		System.out.println(solution(leftGloves, rightGloves));
	}
	
	static int solution(int[] leftGloves, int[] rightGloves) {
		int result = 0;
		for(int i=0; i<leftGloves.length; i++) {
			for(int j=0; j<rightGloves.length; j++) {
				if(leftGloves[i]==rightGloves[j]) {
					leftGloves[i] = rightGloves[i] = -1;
					result++;
					break;
				}
			}
		}
		return result;
	}

}
