package cos_self;

import java.util.Arrays;

public class COS_06_03_Self {

	public static void main(String[] args) {
		int[] people = {97, 102, 93, 100, 107};
		System.out.println(Arrays.toString(solution(people)));
	}
	
	static int[] solution(int[] people) {
		int result[] = new int[4];
		
		for(int i=0; i<people.length; i++) {
			if(people[i] < 95) {
				result[0]++;
			} else if(95 <= people[i] && people[i] < 100) {
				result[1]++;
			} else if(100 <= people[i] && people[i] < 105) {
				result[2]++;
			} else {
				result[3]++;
			}
		}
		
		return result;
	}

}
