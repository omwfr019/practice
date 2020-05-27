package cos_self;

public class COS_03_06_Self {	//해답참고

	public static void main(String[] args) {
		System.out.println(solution(11));
		System.out.println(solution(16));
	}
	
	static String solution(int tileLength) {
		String result = "";
		
		if(tileLength%6==1 || tileLength%6==2 || tileLength%6==4)
			return "-1";
		
		while(tileLength>0) {
			if(tileLength >= 3) {
				result += "RRR";
				tileLength -= 3;
			}
			if(tileLength >= 2) {
				result += "GG";
				tileLength -= 2;
			}
			if(tileLength >= 1) {
				result += "B";
				tileLength -= 1;
			}
		}
		
		return result;
	}

}
