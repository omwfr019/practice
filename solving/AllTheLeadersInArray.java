package solving;

import java.util.Arrays;

// Find All The Leaders In An Integer Array.
/* An element is said to be leader if all the elements on it’s right side are smaller than it.
 *  For example, if {14, 9, 11, 7, 8, 5, 3} is the given array then {14, 11, 8, 5, 3} are the leaders in this array.
 */
public class AllTheLeadersInArray {

	public static void main(String[] args) {
	    //findTheLeaders(new int[] {12, 9, 7, 14, 8, 6, 3}); // 14, 8, 6, 3
        //findTheLeaders(new int[] {8, 23, 19, 21, 15, 6, 11}); // 23, 21, 15, 11
        //findTheLeaders(new int[] {55, 67, 71, 57, 51, 63, 38}); // 71, 63, 38
        //findTheLeaders(new int[] {21, 58, 44, 14, 51, 36, 23}); //58, 51, 36, 23
	}
	
	static void findTheLeaders1(int[] inputArray) {
		int inputArrayLength = inputArray.length;
		int max = inputArray[inputArrayLength-1];
		System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
		System.out.println(inputArray[inputArrayLength-1]);
		for(int i=inputArrayLength-2; i>=0; i--) {
			if(inputArray[i] > max) {
				System.out.println(inputArray[i]);
				max = inputArray[i];
			}
		}
	}
	
	static void findTheLeaders2(int[] inputArray) {
		System.out.println("The leaders in "+Arrays.toString(inputArray)+" are : ");
		for(int i=0; i<inputArray.length; i++) {
			boolean flag = true;
			for(int j=i+1; j<inputArray.length; j++) {
				if(inputArray[j] > inputArray[i]) {
					flag = false;
					break;	
				}
			}
			if(flag) {
				System.out.println(inputArray[i]);
			}
		}
	}
	
}
// 출처 : https://javaconceptoftheday.com/how-to-find-all-the-leaders-in-an-integer-array/