package cos_self;

public class COS_05_06_Self {

	public static void main(String[] args) {
		System.out.println(solution(70, 60));
	}
	
	static int solution(int korean, int english) {
		for(int i=0; i<=100; i++) {
			if((korean+english+i)/3 >= 70) {
				return i;
			}
		}
		return -1;
	}

}
