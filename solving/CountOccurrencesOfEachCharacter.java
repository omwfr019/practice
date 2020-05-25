package solving;

import java.util.HashMap;

public class CountOccurrencesOfEachCharacter {

	public static void main(String[] args) {
		characterCount("Java J2EE Java JSP J2EE");
		characterCount("All Is Well");
		characterCount("Done And Gone");
	}
	
	static void characterCount(String inputString) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char[] strArray = inputString.toCharArray();
		
		for(char c : strArray) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		
		System.out.println(inputString+" : "+charCountMap);
	}
	
	static void characterCount2(String inputString) {
		int count = 0;
		char[] charAry = inputString.toLowerCase().toCharArray();
		
		for(char i='a'; i<'z'; i++) {
			for(char c : charAry) {
				if(c==i) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(i +"="+ count);
				count = 0;
			}
		}
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-count-occurrences-of-each-character-in-string-in-java/