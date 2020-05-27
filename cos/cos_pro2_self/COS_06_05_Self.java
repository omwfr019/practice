package cos_self;

public class COS_06_05_Self {

	public static void main(String[] args) {
		System.out.println(solution(8, 2, 4));
		System.out.println(solution(6, 2, 2));
	}

	static int solution(int money, int price, int n) {
		int result = 0;
		int temp = 0;
		
		result += money/price;
		temp = result;
		
		while(temp >= n) {
			result++;
			temp -= n;
			temp++;
		}
		
		return result;
	}
	
}
