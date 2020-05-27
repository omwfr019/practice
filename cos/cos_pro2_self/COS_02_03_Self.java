package cos_self;

public class COS_02_03_Self {
	
	public static void main(String[] args) {
		int N = 4;
		int M = 7;
		System.out.println(solution(N, M));
	}
	
	static int solution(int N, int M) {
		int sum = 0;
		
		for(int i=N; i<=M; i++) {
			if(i%2==0) {
				sum += i * i;
			}
		}
		
		return sum;
	}
	
}
