package solving;

import java.text.DecimalFormat;

// Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String.
public class PercentageOfString {

	public static void main(String[] args) {
		characterPercentage("Tiger Runs @ The Speed Of 100 km/hour.");
        characterPercentage("My e-mail : eMail_Address321@anymail.com");
        characterPercentage("AUS : 123/3, 21.2 Overs");
	}
	
	static void characterPercentage(String inputString) {
		int totalChars = inputString.length();
		int upperCaseLetters = 0; //대문자
		int lowerCaseLetters = 0; //소문자
		int digits = 0; //숫자
		int others = 0; //기호
		
		for(int i=0; i<inputString.length(); i++) {
			char ch = inputString.charAt(i);
			if(Character.isUpperCase(ch)) upperCaseLetters++;
			else if(Character.isLowerCase(ch)) lowerCaseLetters++;
			else if(Character.isDigit(ch)) digits++;
			else others++;
		}
		
		double upperCaseLetterPercentage = (upperCaseLetters * 100.0) / totalChars;
		double lowerCaseLetterPercentage = (lowerCaseLetters * 100.0) / totalChars;
		double digitsPercentage = (digits * 100.0) / totalChars;
		double otherCharPercentage = (others * 100.0) / totalChars;
		DecimalFormat formatter = new DecimalFormat("##.##");
		
		System.out.println("In '"+inputString+"' : ");
		System.out.println("Uppercase letters are "+formatter.format(upperCaseLetterPercentage)+"%");
		System.out.println("Lowercase letters are "+formatter.format(lowerCaseLetterPercentage)+"%");
		System.out.println("Digits Are "+formatter.format(digitsPercentage)+"%");
		System.out.println("Other Characters Are "+formatter.format(otherCharPercentage)+"%");
		System.out.println("-----------------------------");
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-find-percentage-of-uppercase-letters-lowercase-letters-digits-and-special-characters-in-string/