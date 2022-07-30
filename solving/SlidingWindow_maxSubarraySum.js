/*
    Input : An array of integers and a number.
    Output : Finds the maximum sum of a subarray with the length of the number passed tp the function.

    A subarray must consist of consecutive elements from the original array.
*/


function maxSubarraySum(arr, cnt) {
    if (arr.length < cnt) return null;

    let max = -Infinity;
    let sum = 0;

    for(let i=0; i<arr.length; i++) {
        sum += arr[i];
        
        if(i >= cnt) {
            sum -= arr[i - cnt];
        }

        if(i >= cnt - 1 && sum > max) {
            max = sum;
        }
    }

    return max;
}

function maxSubArraySumEx(arr, num) {
    if (arr.length < num) return null;

    let total = 0;
    for (let i=0; i<num; i++) {
        total += arr[i];
    }

    let currentTotal = total;
    for (let i = num; i < arr.length; i++) {
        currentTotal += arr[i] - arr[i-num];
        total = Math.max(total, currentTotal);
    }
    return total;
}


console.log(maxSubarraySum([100,200,300,400], 2))   //700
console.log(maxSubarraySum([1,4,2,10,23,3,1,0,20], 4))  //39
console.log(maxSubarraySum([-3,4,0,-2,6,-1], 2))    //5
console.log(maxSubarraySum([3,-2,7,-4,1,-1,4,-2,1], 2)) //5
console.log(maxSubarraySum([2,3], 3))   //null
