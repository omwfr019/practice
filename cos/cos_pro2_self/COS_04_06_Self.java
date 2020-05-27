package cos_self;

public class COS_04_06_Self {

	public static void main(String[] args) {
		System.out.println(solution(2323));
	}
	
	static int solution(int point) {
		int result = 0;
		
		if(point >= 1000) {
			result = point-(point%100);
		}
		
		return result;
	}
	
}
