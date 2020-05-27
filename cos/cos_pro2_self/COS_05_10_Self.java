package cos_self;

public class COS_05_10_Self {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 5, 1, 9}, 3));
		System.out.println(solution(new int[] {4, 8, 2, 5, 4, 6, 7}, 4));
	}
	
	static int solution(int[] time_table, int n) {
		int result = 0;
		int[] time = new int[n];
		int k = 0;
		
		for(int i=0; i<time_table.length; i++) {
			if(i%n==0) k = 0;
			time[k++] += time_table[i];
		}
		for(int i=0; i<time.length; i++) {
			if(result < time[i]) result = time[i];
		}
		
		return result;
	}

}

