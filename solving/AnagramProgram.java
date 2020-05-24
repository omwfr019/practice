package solving;

import java.util.Arrays;
import java.util.HashMap;

public class AnagramProgram {
	// Anagram : 두 개의 문자열이 동일한 문자 집합을 포함하지만 순서가 다른 경우.

	public static void main(String[] args) {
		//isAnagram("Mother In Law", "Hitler Woman");
		//isAnagram("keEp", "peeK");
		//isAnagram("SiLeNt CAT", "LisTen AcT");
		//isAnagram("Debit Card", "Bad Credit");
		//isAnagram("School MASTER", "The ClassROOM");
		//isAnagram("DORMITORY", "Dirty Room");
		//isAnagram("Toss", "Shot");
		//isAnagram("joy", "enjoy");
		
	}
	
	static void isAnagram1(String s1, String s2) {
		//Removing all white spaces from s1 and s2
		String copyOfs1 = s1.replaceAll("\\s", "");
		String copyOfs2 = s2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			// Changing the case of characters of both copyOfs1 and copyOfs2 converting them to char array
			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
			char[] s2Array = copyOfs2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			status = Arrays.equals(s1Array, s2Array);
		}
		
		if(status) System.out.println(s1+" and "+s2+" are anagrams");
		else System.out.println(s1+" and "+s2+" are not anagrams");
	}

	static void isAnagram2(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		
		if(copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			char[] s1ToArray = copyOfs1.toCharArray();
			
			//s1ToArray의 각 문자가 copyOfs2에 있는지 확인
			for(char c : s1ToArray) {
				int index = copyOfs2.indexOf(c);
				if(index != -1) {
					//만약 문자가 copyOfs2에 있으면, copyOfs2에서 해당 문자 제거
					copyOfs2 = copyOfs2.substring(0, index) + copyOfs2.substring(index+1, copyOfs2.length());
				} else {
					//만약 문자가 copyOfs2에 없으면, status에 false 저장
					status = false;
					break;
				}
			}
		}
		
		if(status) System.out.println(s1+" and "+s2+" are anagrams");
		else System.out.println(s1+" and "+s2+" are not anagrams");
	}

	static void isAnagram3(String s1, String s2) {
		String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();
		String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();
		boolean status = true;
		
		if(copyOfs1.length() != copyOfs2.length()) {
			status = false;
		} else {
			char[] s1Array = copyOfs1.toCharArray();
			StringBuilder sb = new StringBuilder(copyOfs2);
			for(char c : s1Array) {
				int index = sb.indexOf(""+c);
				if(index != -1) {
					sb = sb.deleteCharAt(index);
				} else {
					status = false;
					break;
				}
			}
		}
		
		if(status) System.out.println(s1+" and "+s2+" are anagrams");
		else System.out.println(s1+" and "+s2+" are not anagrams");
	}
	
}
// 출처 : https://javaconceptoftheday.com/anagram-program-in-java/