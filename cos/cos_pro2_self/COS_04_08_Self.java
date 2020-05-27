package cos_self;

public class COS_04_08_Self {	//해답참고

	public static void main(String[] args) {
		System.out.println(solution(3, new int[] {1,2,1,3,1,2,1}));
		System.out.println(solution(2, new int[] {2,1,2,1,2,2,1}));
	}
	
	static int solution(int n, int[] votes) {
		int result = 0;
		int list[] = new int[n];
		int vote = 0;
		
		for(int i=0; i<votes.length; i++) {
			list[votes[i]-1]++;
		}
		for(int i=0; i<n; i++) {
			if(vote <= list[i]) {
				result = i;
				vote = list[i];
			}
		}
		
		if(vote > votes.length/2) return result+1;
		return -1;
	}

}
