package cos_self;

import java.util.Arrays;

public class COS_04_01_Self {

	public static void main(String[] args) {
		String[] schedule = {"O", "X", "X", "O", "O", "O", "X", "O", "X", "X"};
		System.out.println(Arrays.toString(solution(schedule)));
	}
	
	static int[] solution(String[] schedule) {
		int[] temp = new int[schedule.length];
		int cnt = 0;
		
		for(int i=0; i<schedule.length; i++) {
			if(schedule[i].equals("X")) {
				temp[cnt++] = i+1;
			}
		}
		
		int[] result = new int[cnt];
		for(int i=0; i<cnt; i++) {
			result[i] = temp[i];
		}
		
		return result;
	}

}
