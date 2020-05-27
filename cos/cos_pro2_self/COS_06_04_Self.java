package cos_self;

public class COS_06_04_Self {

	public static void main(String[] args) {
		System.out.println(solution(new String[][] {{"blue","2"}, {"red","5"}, {"black","3"}}));
		System.out.println(solution(new String[][] {{"blue","2"}, {"blue","5"}, {"black","3"}}));
	}
	
	static int solution(String[][] cards) {
		int result = 0;
		int cnt = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=i+1; j<3; j++) {
				if(cards[i][0].equals(cards[j][0])) cnt++;
			}
		}
		
		result = Integer.valueOf(cards[0][1]) + Integer.valueOf(cards[1][1]) + Integer.valueOf(cards[2][1]);
		if(cnt==2) result *= 3;
		else if(cnt==1) result *= 2;
		
		return result;
	}

}
