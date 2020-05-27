package cos_self;

public class COS_02_08_Self {

	public static void main(String[] args) {
		System.out.println(solution(29022531));
	}
	
	static int solution(int number) {
		int result = 0;
		
		while(number>0){
			boolean isPrime = true;
			int temp = number % 10;
			
			if(temp!=0 && temp!=1) {
				for(int i=2; i<temp; i++) {
					if(temp%i==0) {
						isPrime = false;
					}
				}
				if(isPrime) result++;
			}
			System.out.println(temp+" "+result);
			number /= 10;
		}
		
		return result;
	}
	
}
