package solving;

// Reverse The String With Preserving The Position Of Spaces.
// ex) "I Am Not String" -> "g ni rtS toNmAI"
public class ReverseWithPreservingSpaces {

	public static void main(String[] args) {
		//reverseString("I Am Not String"); //g ni rtS toNmAI
        //reverseString("JAVA JSP ANDROID"); //DIOR DNA PSJAVAJ
        //reverseString("1 22 333 4444 55555"); //5 55 554 4443 33221
	}
	
	static void reverseString1(String inputString) {
		char[] inputStringArray = inputString.toCharArray();
		char[] resultArray = new char[inputStringArray.length];
		
		for(int i=0; i<inputStringArray.length; i++) {
			if(inputStringArray[i] == ' ') {
				resultArray[i] = ' ';
			}
		}
		
		int j = resultArray.length-1;
		for(int i=0; i<inputStringArray.length; i++) {
			if(inputStringArray[i] != ' ') {
				if(resultArray[j] == ' ') {
					j--;
				}
				resultArray[j] = inputStringArray[i];
				j--;
			}
		}
		
		System.out.println(inputString+" ---> "+String.valueOf(resultArray));
	}
	
	static void reverseString2(String inputString) {
		StringBuilder sb = new StringBuilder(inputString);
		String reverseString = new StringBuilder(inputString.replace(" ", "")).reverse().toString();
		
		int c = 0;
		for(int i=0; i<inputString.length(); i++) {
			if(sb.charAt(i) != ' ') {
				sb.setCharAt(i, reverseString.charAt(c));
				c++;
			}
		}
		System.out.println(sb);
	}
	
	static void reverseString3(String inputString) {
		char[] chars = inputString.toCharArray();
		int p = chars.length - 1;
		int i = 0;
		
		while(i < p) {
			if(chars[i] == ' ') i++;
			if(chars[p] == ' ') p--;
			
			char tmp = chars[i]; //swap(i, p)
			chars[i] = chars[p];
			chars[p] = tmp;
			i++;
			p--;
		}
		
		System.out.println(String.valueOf(chars));
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-reverse-the-string-with-preserving-the-position-of-spaces/