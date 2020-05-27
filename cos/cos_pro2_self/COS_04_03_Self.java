package cos_self;

import java.util.Arrays;

public class COS_04_03_Self {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(4, "cacdbdedccbb")));
	}
	
	static int[] solution(int n, String bundle) {
		char a[] = new char[n];
		char b[] = new char[n];
		int scoreA = 0;
		int scoreB = 0;
		
		int cnt = 0;
		for(int i=0; i<n; i++) {
			a[i] = bundle.charAt(cnt++);
			b[i] = bundle.charAt(cnt++);
		}
		
		scoreA = calScore(a);
		scoreB = calScore(b);
		
		if(scoreA>scoreB) return new int[] {1, scoreA};
		else if(scoreA==scoreB) return new int[] {0, scoreA};
		else return new int[] {2, scoreB};
	}
	
	static int calScore(char[] ary) {
		int score = 0;
		for(int i=0; i<ary.length; i++) {
			if(ary[i]=='a') score += 1;
			else if(ary[i]=='b') score += 2;
			else if(ary[i]=='c') score += 3;
			else if(ary[i]=='d') score += 4;
			else if(ary[i]=='e') score += 5;
		}
		return score;
	}

}
