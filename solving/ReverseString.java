package solving;

public class ReverseString {

	public static void main(String[] args) {
		String str = "reverse";
		System.out.println(revStr1(str));
		System.out.println(revStr2(str));
		System.out.println(revStr3(str));
	}

	public static StringBuffer revStr1 (String str) {
		StringBuffer sbf = new StringBuffer(str);
		return sbf.reverse();
	}
	
	public static String revStr2 (String str) {
		char[] strAry = str.toCharArray();
		char[] strAry2 = new char[strAry.length];
		for(int i=0; i<strAry.length; i++) {
			strAry2[i] = strAry[strAry.length-i-1];
		}
		return String.valueOf(strAry2);
	}
	
	public static String revStr3 (String str) {
		if((str==null) || (str.length()<=0)) return str;
		return revStr3(str.substring(1)) + str.charAt(0);
	} /*
	 *  1st Call —>   recursiveMethod(“MyJava”)
		2nd Call —> recursiveMethod(“yJava”) + “M”
		3rd Call —>  (recursiveMethod(“Java”) + “y”) + “M”
		4th call —>  ((recursiveMethod(“ava”) + “J”)+”y”) + “M”
		5th Call —>  (((recursiveMethod(“va”) + “a”) + “J”)+”y”) + “M”
		6th Call —>  ((((recursiveMethod(“a”) + “v”) + “a”) + “J”)+”y”) + “M”
		After 6th call, it Stops calling itself. Because the length of passed string is 1.
		So, finally it returns “avaJyM”.
	 */
}

//출처 : https://javaconceptoftheday.com/java-program-to-reverse-a-string/