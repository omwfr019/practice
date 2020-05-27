package cos_self;

public class COS_03_08_Self {

	public static void main(String[] args) {	//해답참고
		int[][] programs = {{1,6}, {3,5}, {2,8}};
		System.out.println(solution(programs));
	}

	static int solution(int[][] programs) {
		int result = 0;
		int[] time = new int[25];
		
		for(int i=1; i<programs.length; i++) {
			for(int j=programs[i][0]; j<programs[i][1]; j++) {
				time[j]++;
			}
		}
		
		for(int i=0; i<time.length; i++) {
			if(time[i] >= 2) result++;
		}
		
		return result;
	}
	
}
