package cos_self;

public class COS_06_09_Self {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {1, 2, 1, 3, 2, 1}));
	}
	
	static int solution(int[] socks) {
		int result = 0;
		int list[] = new int[10];
		
		for(int i=0; i<socks.length; i++) {
			list[socks[i]-1]++;
		}
		
		for(int i=0; i<list.length; i++) {
			if(list[i]>=2) result += list[i]/2;
		}
		
		return result;
	}

}
