package cos_self;

public class COS_02_06_Self {

	public static void main(String[] args) {
		int[] floors = {1, 2, 5, 4, 2};
		System.out.println(solution(floors));
	}
	
	static int solution(int[] floors) {
		int distance = 0;
		
		for(int i=1; i<floors.length; i++) {
			//distance += Math.abs(floors[i]-floors[i-1]);
			if(floors[i]>floors[i-1]) {
				distance += (floors[i]-floors[i-1]);
			} else {
				distance += (floors[i-1]-floors[i]);
			}
		}
		
		return distance;
	}
	
}
