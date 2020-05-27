package cos_self;

public class COS_03_07_Self {	//???

	public static void main(String[] args) {
		System.out.println(solution(5, 1, 2));
		System.out.println(solution(10, 5, 4));
	}
	
	static int solution(int numApple, int numCarrot, int k) {
		int result = 0;
		
		for(int i=k; i>0; i--) {
			int cntApple = (numApple/3);
			int cntCarrot = numCarrot;
			
			if(cntApple < cntCarrot) {
				numCarrot--;
			} else {
				numApple--;
			}
		}
		
		result = Math.min(numApple/3, numCarrot);
		return result;
	}

}
