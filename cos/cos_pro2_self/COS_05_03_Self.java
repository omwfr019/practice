package cos_self;

public class COS_05_03_Self {

	public static void main(String[] args) {
		int speed = 100;
		int[] cars = {110, 98, 125, 148, 120, 112, 89};
		System.out.println(solution(speed, cars));
	}
	
	static int solution(int speed, int[] cars) {
		int result = 0;
		
		for(int i=0; i<cars.length; i++) {
			if(cars[i] < speed) continue;
			
			if(cars[i] >= speed+(speed*3/10)) {
				result += 7;
			} else if(cars[i] >= speed+(speed*2/10)) {
				result += 5;
			} else if(cars[i] >= speed+(speed*1/10)) {
				result += 3;
			}
		}
		
		return result;
	}

}
