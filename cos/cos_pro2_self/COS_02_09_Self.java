package cos_self;

public class COS_02_09_Self {

	public static void main(String[] args) {
		int[] votes = {2, 5, 3, 4, 1, 5, 1, 5, 5, 3};
		int N = 5;
		int K = 2;
		System.out.println(solution(votes, N, K));
	}
	
	static int solution(int[] votes, int N, int K) {
		int[] result = new int[N];
		int cnt = 0;
		
		for(int i=0; i<votes.length; i++) {
			result[votes[i]-1]++;
		}
		
		for(int i=0; i<N; i++) {
			if(K == result[i]) cnt++;
		}
		
		return cnt;
	}
	
}
