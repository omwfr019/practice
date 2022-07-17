/*
    Input : an array of integers and a number called n.
    Output : maximum sum of n consecutive elements in the array.
*/


function maxSubarraySum(arr, n) {
    let i = 0;
    let tempSum = 0;
    let maxSum = 0; // ! 음수일 경우 고려 !

    if (arr.length < n) return null;

    while (i < arr.length) {
        tempSum += arr[i];
        if (i >= n-1) {
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }
            tempSum -= arr[(i+1)-n];
        }
        i++;
    }

    return maxSum;
}

/**
 * A naive Solution
 * Time Complexity = O(n^2)
 */
function maxSubarraySumEx1(arr, num) {
    if (num > arr.length) {
        return null;
    }
    let max = -Infinity;    // 배열이 모두 음수로 구성되어 있다면 가장 큰 합은 음수일 것이기 때문
    for (let i = 0; i < arr.length - num + 1; i++) {
        temp = 0;
        for (let j = 0; j < num; j++) {
            temp += arr[i+j];
        }
        if (temp > max) {
            max = temp;
        }
    }
    return max;
}

/**
 * Refactor
 * Time Complexity = O(n)
 */
function maxSubarraySumEx2(arr, num) {
    let maxSum = 0;
    let tempSum = 0;
    if (arr.length < num) return null;
    for (let i = 0; i < num; i++) {
        maxSum += arr[i];
    }
    tempSum = maxSum;
    for (let i = num; i < arr.length; i++) {
        tempSum = tempSum - arr[i-num] + arr[i];
        maxSum = Math.max(maxSum, tempSum);
    }
    return maxSum;
}


console.log(maxSubarraySum([1,2,5,2,8,1,5],2))  //10
console.log(maxSubarraySum([1,2,5,2,8,1,5],4))  //17
console.log(maxSubarraySum([4,2,1,6],1))    //6
console.log(maxSubarraySum([4,2,1,6,2],4))  //13
console.log(maxSubarraySum([],4))   //null
