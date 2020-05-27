package cos_self;

public class COS_05_02_Self {

	public static void main(String[] args) {
		int[] time = {1, 1, 0, 0, 1, 0, 1, 0, 0, 0};
		System.out.println(solution(time));
	}
	
	static int solution(int[] time_table) {
		int result = 0;
		int start = 0, end = 0;
		
		for(int i=0; i<time_table.length; i++) {
			if(time_table[i]==1) {
				start = i;
				break;
			}
		}
		for(int i=time_table.length-1; i>=0; i--) {
			if(time_table[i]==1) {
				end = i;
				break;
			}
		}
		
		for(int i=start; i<end; i++) {
			if(time_table[i] == 0) {
				result++;
			}
		}
		return result;
	}

}
