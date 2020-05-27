package cos_self;

public class COS_01_08_Self {

	static boolean solution(String sentence) {
		boolean result = true;
		StringBuilder revSentence = new StringBuilder(sentence).reverse();
		int i = 0;
		int j = sentence.length()-1;
		
		while(i<sentence.length()) {
			if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '.') {
				i++;
				continue;
			}
			if(sentence.charAt(j) == ' ' || sentence.charAt(j) == '.') {
				j--;
				continue;
			}
			if(sentence.charAt(i) != sentence.charAt(j)) {
				result = false;
				break;
			}
			i++; j--;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(new String("never odd or even.")));
		System.out.println(solution(new String("palindrome")));
	}
	
}
