package solving;

import java.util.Arrays;

// 두 배열이 동일한지 확인
public class CheckEqualityOfTwoArrays {
	
	/*
	 * 1. 두 배열의 길이 확인
	 * 2. 대응하는 요소 쌍 확인
	 * (배열의 크기가 큰 경우 권장하지 않음)
	 */
	
	public static void main(String[] args) {
		int[] arrayOne = {2, 5, 1, 7, 4, 8};
		int[] arrayTwo = {2, 5, 1, 7, 4, 9};
		checkEqual1(arrayOne, arrayTwo);
		
		String[] s1 = {"java", "j2ee", "struts", "hibernate"};
		String[] s2 = {"jsp", "spring", "jdbc", "hibernate"};
		String[] s3 = {"java", "j2ee", "struts", "hibernate"};
		checkEqual2(s1, s2, s3);
		
		String[] ss1 = {"java", "swings", "j2ee", "struts", "jsp", "hibernate"};
		String[] ss2 = {"java", "struts", "j2ee", "hibernate", "swings", "jsp"};
		checkEquals3(ss1, ss2);
		
		String[][] sss1 = { {"java", "swings", "j2ee"}, {"struts", "jsp", "hibernate"} };
		String[][] sss2 = { {"java", "swings", "j2ee"}, {"struts", "jsp", "hibernate"} };
		checkEquals4(sss1, sss2);
	}
	
	static void checkEqual1 (int[] arrayOne, int[] arrayTwo) {
		boolean areArraysEqual = true;
		
		if(arrayOne.length == arrayTwo.length) {
			for(int i=0; i<arrayOne.length; i++) {
				if(arrayOne[i] != arrayTwo[i]) {
					areArraysEqual = false;
					break;
				}
			}
		} else {
			areArraysEqual = false;
		}
		
		if(areArraysEqual) {
			System.out.println("Two Arrays Are Equal");
		} else {
			System.out.println("Two Arrays Are Not equal");
		}
	}
	
	static void checkEqual2 (String[] s1, String[] s2, String[] s3) {
		System.out.println(Arrays.equals(s1, s2)); //false
		System.out.println(Arrays.equals(s1, s3)); //true
	}
	
	// 요소 수와 요소 집합은 동일하지만 위치가 다른 두 배열 비교.
	static void checkEquals3 (String[] ss1, String[] ss2) {
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		System.out.println(Arrays.equals(ss1, ss2)); //true
	}
	
	// 다차원 배열 검사
	static void checkEquals4 (String[][] sss1, String[][] sss2) {
		System.out.println(Arrays.deepEquals(sss1, sss2)); //true
		System.out.println(Arrays.equals(sss1, sss2)); //false
	}
	
}
// 출처 : https://javaconceptoftheday.com/how-to-check-the-equality-of-two-arrays-in-java/