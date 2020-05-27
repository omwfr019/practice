package cos_self;

public class COS_06_02_Self {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {2, 4, 3, 2, 1}, 10));
		System.out.println(solution(new int[] {2, 4, 3, 2, 1}, 14));
	}

	static int solution(int[] papers, int K) {
		int result = 0;
		
		for(int i=0; i<papers.length; i++) {
			if(K > papers[i]) {
				K -= papers[i];
				result++;
			}
		}
		
		return result;
	}
	
}
