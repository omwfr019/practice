package cos_self;

import java.util.Arrays;

public class COS_01_01_Self { //해답참고

	public static void main(String[] args) {
		String[] shirt_size = {"XS", "S", "M", "L", "XL", "XXL"};
		int ret[] = solution(shirt_size);
		
		System.out.println("solution 함수의 반환값은 "+Arrays.toString(ret)+" 입니다.");
	}
	
	static int[] solution(String[] shirtSize) {
		int answer[] = new int[shirtSize.length];
		
		for(int i=0; i<shirtSize.length; i++) {
        	if(shirtSize[i].equals("XS")) answer[0]++;
        	else if((shirtSize[i]).equals("S")) answer[1]++;
        	else if((shirtSize[i]).equals("M")) answer[2]++;
        	else if((shirtSize[i]).equals("L")) answer[3]++;
        	else if((shirtSize[i]).equals("XL")) answer[4]++;
        	else if((shirtSize[i]).equals("XXL")) answer[5]++;
        }
		
		return answer;
	}

}
