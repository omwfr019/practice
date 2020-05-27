package cos_self;

public class COS_03_10_Self {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {4,8,3,6,7}));
	}
	
	static int solution(int[] arr) {
		int result = 0;
		
		for(int i=0; i<arr.length; i++) {
			double temp = arr[i] / (double)2;
			for(int j=0; j<arr.length; j++) {
				if(temp == arr[j]) result++;
			}
		}
		
		return result;
	}

}
