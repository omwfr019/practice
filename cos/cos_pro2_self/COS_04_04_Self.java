package cos_self;

public class COS_04_04_Self {

	public static void main(String[] args) {
		int classes[] = {80, 45, 33, 20};
		System.out.println(solution(classes, 30));
	}
	
	static int solution(int[] classes, int m) {
		int result = 0;
		
		for(int i=0; i<classes.length; i++) {
			result += classes[i]/m;
			if(result%m != 0) result++;
		}
		
		return result;
	}

}
