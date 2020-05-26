package solving;

import java.util.Arrays;

// Separate Zeros From Non-Zeros In An Array.
public class SeparateZerosFromArray {

	public static void main(String[] args) {
		moveZerosToFront(new int[] {12, 0, 7, 0, 8, 0, 3});
        moveZerosToFront(new int[] {1, -5, 0, 0, 8, 0, 1});
        moveZerosToEnd(new int[] {0, 1, 0, 1, -5, 0, 4});
        moveZerosToEnd(new int[] {-4, 1, 0, 0, 2, 21, 4});
        moveZerosToEnd2(new int[] {0, 1, 0, 1, -5, 0, 4});
        moveZerosToEnd2(new int[] {-4, 1, 0, 0, 2, 21, 4});
	}
	
	
	static void moveZerosToFront(int inputArray[]) {
		int counter = inputArray.length-1;
		for(int i=inputArray.length-1; i>=0; i--) {
			if(inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while(counter >= 0) {
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	static void moveZerosToEnd(int inputArray[]) {
		int counter = 0;
		for(int i=0; i<inputArray.length; i++) {
			if(inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}
		while(counter < inputArray.length) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
	
	static void moveZerosToEnd2(int inputArray[]) {
		int [] outputArray = new int[inputArray.length];
		for(int i=0, j=0; i<inputArray.length; i++) {
			if(inputArray[i] != 0) {
				outputArray[j] = inputArray[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-separate-zeros-from-non-zeros-in-an-array/