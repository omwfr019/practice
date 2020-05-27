package cos_self;

public class COS_06_08_Self {

	public static void main(String[] args) {
		System.out.println(solution(120));
		System.out.println(solution(23));
	}
	
	static int solution(int number) {
		int result = 0;
		int copyOfNumber = number;
		String revNum = "";
		boolean isFirst = true;
		
		while(copyOfNumber>0) {
			if(isFirst && copyOfNumber%10==0) {
				isFirst = false;
				copyOfNumber /= 10;
			}
			revNum += copyOfNumber%10;
			copyOfNumber /= 10;
		}
		
		int reverseNum = Integer.valueOf(revNum);
		if(number > reverseNum) result = number-reverseNum;
		else result = reverseNum-number;
		
		return result;
	}

}
