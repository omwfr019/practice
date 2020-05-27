package cos_self;

public class COS_04_05_Self {

	public static void main(String[] args) {
		int[] calorie = {713, 665, 873, 500, 751};
		System.out.println(solution(calorie));
	}

	static int solution(int[] calorie) {
		int result = 0;
		int min = calorie[0];
		
		for(int i=1; i<calorie.length; i++) {
			if(calorie[i] > min) {
				result += calorie[i] - min;
			}
			if(calorie[i] < min) {
				min = calorie[i];
			}
		}
		return result;
	}
	
}
