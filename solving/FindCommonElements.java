package solving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

// Java Program To Find Common Elements Between Two Arrays.
public class FindCommonElements {

	public static void main(String[] args) {
		String[] s1 = {"one", "two", "three", "four", "five", "four"};
		String[] s2 = {"three", "four", "five", "six", "seven", "four"};
		
		CommonElements1(s1, s2); //[four, three, five]
		CommonElements2(s1, s2);
		RemoveCommonElements(s1, s2); //[one, two, three, four, five, six, seven];
	}
	
	static void CommonElements1 (String[] s1, String[] s2) {
		HashSet<String> set = new HashSet<String>();
		for(int i=0; i<s1.length; i++) {
			for(int j=0; j<s2.length; j++) {
				if(s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		System.out.println(set);
	}
	
	static void CommonElements2 (String[] s1, String[] s2) {
		HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
		HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
		set1.retainAll(set2);
		System.out.println(set1);
	}
	
	static void RemoveCommonElements (String[] s1, String[] s2) {
		String[] strings = Stream.concat(Arrays.stream(s1), Arrays.stream(s2)).distinct().toArray(String[]::new);
		System.out.println(Arrays.toString(strings));
	}

}
// 출처 : https://javaconceptoftheday.com/java-program-to-find-common-elements-between-two-arrays/