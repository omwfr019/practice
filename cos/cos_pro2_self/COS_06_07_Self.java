package cos_self;

public class COS_06_07_Self {

	public static void main(String[] args) {
		System.out.println(solution(7, new int[]{2, 5}, new int[]{4, 3, 5}));
		System.out.println(solution(7, new int[] {3}, new int[] {5}));
	}
	
	static int solution(int money, int[] chairs, int[] desks) {
		int max = 0;
		
		for(int i=0; i<chairs.length; i++) {
			for(int j=0; j<desks.length; j++) {
				int sum = chairs[i] + desks[j];
				if(sum > max && sum <= money) max = sum;
			}
		}
		
		return max;
	}

}
