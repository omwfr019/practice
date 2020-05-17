package solving;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		String str = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End\r\n";
		System.out.println(str);
		
		String strWithoutSpaces = str.replaceAll("\\s+", "");
		// \\s+ : 1 or more spaces.
		System.out.println(strWithoutSpaces);
				
		String strWithoutSpaces2 = "";
		for(int i=0; i<str.length(); i++) {
			if( !Character.isWhitespace(str.charAt(i)) ) {
				strWithoutSpaces2 += str.charAt(i);
			}
		}
		System.out.println(strWithoutSpaces2);
	}

}
// 출처 : https://javaconceptoftheday.com/remove-white-spaces-from-string-in-java/