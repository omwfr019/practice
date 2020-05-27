package cos_self;

public class COS_01_06_Self {
	
	static int solution(int number) {
		int result = 0;
		
		for(int i=1; i<=number; i++) {
			int num = i;
			while(num > 0) {
				int rem = num%10;
				if( (rem==3) || (rem==6) || (rem==9) ) {
					result++;
				}
				num /= 10;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(40));
	}

}
