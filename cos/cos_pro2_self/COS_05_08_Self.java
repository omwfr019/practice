package cos_self;

public class COS_05_08_Self {

	public static void main(String[] args) {
		System.out.println(solution(35));
	}
	
	static int solution(int usage) {
		int result = 0;
		
		if(usage >= 31) {
			result += 20 * 430;
			result += 10 * 570;
			result += (usage-30) * 840;
		} else if(usage >= 21) {
			result += 20 * 430;
			result += (usage-20) * 570;
		} else {
			result = usage * 430;
		}
		
		return result;
	}

}
