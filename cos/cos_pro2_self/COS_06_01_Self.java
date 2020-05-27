package cos_self;

public class COS_06_01_Self {

	public static void main(String[] args) {
		int[] temparature = {3, 2, 1, 5, 4, 3, 3, 2};
		int A = 1;
		int B = 6;
		System.out.println(solution(temparature, A, B));
	}
	
	static int solution(int[] temparature, int A, int B) {
		int result = 0;
		for(int i=A; i<B; i++) {
			if(temparature[i]>temparature[A] && temparature[i]>temparature[B])
				result ++;
		}
		return result;
	}

}
