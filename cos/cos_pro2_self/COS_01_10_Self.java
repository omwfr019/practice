package cos_self;

public class COS_01_10_Self {
	
	static int solution(int[] data, int datalen) {
		int result = 0;
		int sum = 0;
		double average = 0.0;
		
		for(int i=0; i<datalen; i++) {
			sum += data[i];
		}
		average = sum/(double)datalen;
		
		for(int i=0; i<datalen; i++) {
			if(average > data[i]) result++;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,2,3,4,5,6,7,8,9,10}, 10));
		System.out.println(solution(new int[] {1,1,1,1,1,1,1,1,1,10}, 10));
	}
}
