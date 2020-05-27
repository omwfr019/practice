package cos_self;

public class COS_03_02_Self {	//해답참고

	public static void main(String[] args) {
		int[] currentGrade = {70, 100, 70, 80, 50, 95};
		int[] lastGrade = {35, 65, 80, 50, 20, 60};
		System.out.println(solution(currentGrade, lastGrade));
	}
	
	static int solution(int[] currentGrade, int[] lastGrade) {
		int cnt = 0;
		int maxScore = 0;
		int rank[] = new int[currentGrade.length];
		
		for(int i=0; i<currentGrade.length; i++) {	//등수(0부터)
			for(int j=0; j<currentGrade.length; j++) {
				if(currentGrade[i] < currentGrade[j]) rank[i]++;
			}
		}
		
		for(int i=0; i<currentGrade.length; i++) {
			if(maxScore < (currentGrade[i] - lastGrade[i])) {
				maxScore = (currentGrade[i] - lastGrade[i]);
			}
		}
		
		for(int i=0; i<currentGrade.length; i++) {
			if(currentGrade[i] >= 80 && (rank[i]+1) < currentGrade.length/10) cnt++;
			else if(currentGrade[i] >= 80 && (rank[i]+1) == 1 ) cnt++;
			else if((currentGrade[i] - lastGrade[i])==maxScore && (currentGrade[i] - lastGrade[i])>0) cnt++;
		}
		
		return cnt;
	}

}
