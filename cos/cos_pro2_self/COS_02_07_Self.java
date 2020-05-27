package cos_self;

public class COS_02_07_Self {

	public static void main(String[] args) {
		System.out.println(solution(527, 'C'));
		System.out.println(solution(1, 'F'));
	}
	
	static int solution(double value, char unit) {
		int result = 0;
		
		if(unit == 'F') {
			result = (int)((value - 32) / 1.8);
		} else if(unit == 'C') {
			result = (int)((value * 1.8) + 32);
		}
		
		return result;
	}
	
}
