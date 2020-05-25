package solving;

import java.util.Arrays;

// Find All Pairs of Elements In An Array Whose Sum Is Equal To A Given Number.
public class PairsOfElementsInArray {
	
	public static void main(String[] args) {
		findThePairs(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
        findThePairs(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
        findThePairs(new int[] {12, 13, 40, 15, 8, 10, -15}, 25);
        findThePairs(new int[] {12, 23, 125, 41, -75, 38, 27, 11}, 50);
	}
	
	
	static void findThePairs(int inputArray[], int inputNumber) {
		System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
		
		for(int i=0; i<inputArray.length; i++) {
			for(int j=i+1; j<inputArray.length; j++) {
				if(inputArray[i]+inputArray[j] == inputNumber) {
					System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
				}
			}
		}
	}
	
	static void findThePairs2(int inputArray[], int inputNumber) {
		Arrays.sort(inputArray);
		System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
		int i = 0;
		int j = inputArray.length-1;
		
		while(i<j) {
			if(inputArray[i]+inputArray[j] == inputNumber) {
				System.out.println(inputArray[i]+" + "+inputArray[j]+" = "+inputNumber);
				i++;
				j--;
			} else if (inputArray[i]+inputArray[j] < inputNumber) {
				i++;
			} else if (inputArray[i]+inputArray[j] > inputNumber) {
				j--;
			}
		} 
	}
	
}
// 출처 : https://javaconceptoftheday.com/how-to-find-all-pairs-of-elements-in-an-array-whose-sum-is-equal-to-a-given-number/