package cos_self;

public class COS_05_05_Self {

	public static void main(String[] args) {
		int a = 4;
		int b = 6;
		System.out.println(solution(a, b));
	}
	
	static int solution(int a, int b) {
		for(int i=1; i<=a*b; i++) {
			if(i%a==0 && i%b==0) return i;
		}
		
		return 0;
	}

}
