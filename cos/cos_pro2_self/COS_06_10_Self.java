package cos_self;

public class COS_06_10_Self {

	public static void main(String[] args) {
		System.out.println(solution(600, new int[] {653, 670, 533, 540, 660}));
	}
	
	static int solution(int weight, int[] boxes) {
		int result = 0;
		
		for(int i=0; i<boxes.length; i++) {
			if(!(weight*0.9 <= boxes[i] && boxes[i] <= weight*1.1)) result++; 
		}
		
		return result;
	}
	
}
