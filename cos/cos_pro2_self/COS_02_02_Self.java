package cos_self;

public class COS_02_02_Self {
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
		System.out.println(solution(arr));
	}
	
	static String solution(int[] arr) {
		int cntThree = 0;
		int cntFive = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3==0) cntThree++;
			if(arr[i]%5==0) cntFive++;
		}
		
		if(cntThree > cntFive) {
			return "three";
		} else if (cntThree < cntFive) {
			return "five";
		} else
			return "same";
	}
	
}
