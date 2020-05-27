package cos_self;

public class COS_02_10_Self {
	
	public static void main(String[] args) {
		int[] purchase = {150000, 210000, 399990, 990000, 1000000};
		System.out.println(solution(purchase));
	}
	
	static int solution(int[] purchase) {
		int result = 0;
		
		for(int i=0; i<purchase.length; i++) {
			if(200000<=purchase[i] && purchase[i]<400000) {
				result += 10000;
			} else if(400000<=purchase[i] && purchase[i]<600000) {
				result += 20000;
			} else if(600000<=purchase[i] && purchase[i]<1000000) {
				result += 30000;
			} else if(1000000<=purchase[i]) {
				result += 50000;
			}
		}
		
		return result;
	}
	
}
