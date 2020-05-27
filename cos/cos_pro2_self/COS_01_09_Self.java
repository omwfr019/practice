package cos_self;

public class COS_01_09_Self {

	static String solution(String characters) {
		char[] charStr = characters.toCharArray();
		StringBuilder result = new StringBuilder();
		result.append(charStr[0]);
		for(int i=1; i<charStr.length; i++) {
			if(charStr[i] != charStr[i-1]) {
				result.append(charStr[i]);
			}
		}
		return result.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new String("senteeeeeenccccceeee")));
	}
	
}
