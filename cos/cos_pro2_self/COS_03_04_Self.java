package cos_self;

public class COS_03_04_Self {

	public static void main(String[] args) {
		String[] words = {"CODE", "COED", "CDEO"};
		String word = "CODE";
		System.out.println(solution(words, word));
	}
	
	static int solution(String[] words, String word) {
		int result = 0;
		
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<word.length(); j++) {
				if(word.charAt(j) != words[i].charAt(j)) {
					result++;
				}
			}
		}
		
		return result;
	}

}
