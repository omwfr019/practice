package cos;

import java.util.Arrays;

public class COS_01_05 {

	public int[] solution(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 1;
            right -= 1;
        }
        return arr;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        COS_01_05 sol = new COS_01_05();
        int[] arr = {1, 4, 2, 3};
        int[] ret = sol.solution(arr);
 
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + Arrays.toString(ret) + " .");
    }
	
}
