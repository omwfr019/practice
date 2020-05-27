package cos_self;

public class COS_03_09_Self {

	public static void main(String[] args) {
		int day = 17;
		int[] numbers = {3285, 1724, 4438, 2988, 3131, 2998};
		System.out.println(solution(day, numbers));
	}
	
	static int solution(int day, int[] numbers) {
		int result = 0;
		
		for(int i=0; i<numbers.length; i++) {
			int temp = numbers[i] % 10;
			if(day%2==0 && temp%2==0) result++;
			else if(day%2!=0 && temp%2!=0) result++;
		}
		
		return result;
	}

}
