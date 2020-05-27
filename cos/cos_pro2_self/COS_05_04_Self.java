package cos_self;

public class COS_05_04_Self {
	
	public static void main(String[] args) {
		int taekwondo = 27;
		int running = 63;
		int[] shooting = {9, 10, 8, 10, 10, 10, 7, 10, 10, 10};
		System.out.println(solution(taekwondo, running, shooting));
	}
	
	static int solution(int taekwondo, int running, int[] shooting) {
		int game1 = game1(taekwondo);
		int game2 = game2(running);
		int game3 = game3(shooting);
		
		return game1+game2+game3;
	}
	
	static int game1 (int taekwondo) {
		int result = 0;
		
		if(taekwondo >= 25) result += 250;
		else result += taekwondo * 8;
		
		return result;
	}
	
	static int game2 (int running) {
		int result = 250;
		
		if(running < 60) {
			result += (running-60)*5;
		} else {
			result -= (running-60)*5;
		}
		
		return result;
	}
	
	static int game3 (int[] shooting) {
		int result = 0;
		int cnt = 0;
		
		for(int i=0; i<shooting.length; i++) {
			if(shooting[i] == 10) cnt++;
			result += shooting[i];
		}
		if(cnt >= 7) result += 100;
		
		return result;
	}

}
