package solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

// Remove Duplicate Elements From ArrayList In Java.
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
		listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");
        System.out.print("ArrayList With Duplicate Elements : ");
        System.out.println(listWithDuplicateElements);
        
        LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
        System.out.print("ArrayList After Removing Duplicate Elements : ");
        System.out.println(listWithoutDuplicateElements);
        
        
        String [] ary = new String[] {"a", "b", "c", "a", "d"};
        LinkedHashSet set2 = new LinkedHashSet(Arrays.asList(ary));
        System.out.println(set2);
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-remove-duplicate-elements-from-arraylist-in-java/