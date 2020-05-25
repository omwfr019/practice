package solving;

import java.util.Arrays;

// Find Continuous Sub Array Whose Sum Is Equal To Given Number.
public class SubArrayWhoseSumIsNumber {

	public static void main(String[] args) {
		findSubArray1(new int[]{42, 15, 12, 8, 6, 32}, 26);
        findSubArray1(new int[]{12, 5, 31, 13, 21, 8}, 49);
        findSubArray1(new int[]{15, 51, 7, 81, 5, 11, 25}, 41);
        findSubArray1(new int[] {26, 15, 12, 8, 6, 32, 26}, 26);
	}
	
	static void findSubArray1(int[] inputArray, int inputNumber) {
		System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
		
		//int sum = inputArray[0];
		int sum = 0;
		int start = 0;
		
		for(int i=0; i<inputArray.length; i++) {
			sum += inputArray[i];
			
			while(sum > inputNumber && start <= i-1) {
				sum -= inputArray[start];
				start++;
			}
			
			if(sum == inputNumber) {
				//System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
				
				for(int j=start; j<=i; j++) {
					System.out.print(inputArray[j]+" ");
				}
				System.out.println();
			}
		}
	}
	
	static void findSubArray2(int[] inputArray, int inputNumber) {
		System.out.println("Continuous sub array of "+Arrays.toString(inputArray));
		int sum = 0;
		for(int i=0; i<inputArray.length; i++) {
			sum = inputArray[i];
			if(sum == inputNumber) {
				System.out.println(inputArray[i]);
				continue;
			}
			for(int j=i+1; j<inputArray.length; j++) {
				sum += inputArray[j];
				if(sum == inputNumber) {
					//System.out.println("Continuous sub array of "+Arrays.toString(inputArray));
					for(int k=i; k<=j; k++) {
						System.out.print(inputArray[k]+" ");
					}
					System.out.println();
				} else if (sum < inputNumber) {
					continue;
				} else if (sum > inputNumber) {
					break;
				}
			}
		}
	}
	
}
// 출처 : https://javaconceptoftheday.com/how-to-find-continuous-sub-array-whose-sum-is-equal-to-given-number/