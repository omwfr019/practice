package cos_self;

public class COS_05_07_Self {

	public static void main(String[] args) {
		int[] stuffs = {5, 3, 4, 2, 3, 2};
		System.out.println(solution(stuffs));
	}
	
	static int solution(int[] stuffs) {
		int result = 0;
		int a = 0, b = 0;
		
		for(int i=0; i<stuffs.length; i++) {
			if(stuffs[i] <= 3) {
				a += stuffs[i];
			} else {
				b += stuffs[i];
			}
		}
		
		result = Math.max(a, b);
		return result;
	}

}
