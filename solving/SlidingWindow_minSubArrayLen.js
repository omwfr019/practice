/*
    Input : An array of positive integers and a positive integer.
    Output : The minimal length of a contiguous subarray of which the sum is greater than or equal to the integer passed to the function.

    If there isn't one, return 0 instead.

    Constraints : Time Complexity : O(n), Space Complexity : O(1)
*/


function minSubArrayLen(arr, num) {
    let sum = 0;
    let cnt = 1;
    let i = 0;

    while (cnt < arr.length) {
        sum += arr[i];

        if (i >= cnt) {
            sum -= arr[i - cnt];
        }

        if (sum >= num) {
            return cnt;
        }

        if (i == arr.length - 1) {
            i = 0;
            sum = 0;
            cnt++;
        } else {
            i++;
        }
    }

    return 0;
}

function minSubArrayLenEx(nums, sum) {
    let total = 0;
    let start = 0;
    let end = 0;
    let minLen = Infinity;

    while (start < nums.length) {
        // if current window doesn't add up to the given sum then move the window to right.
        if(total < sum && end < nums.length) {
            total += nums[end];
            end++;
        }

        // if current window adds up to at least the sum given then we can shrink the window.
        else if(total >= sum) {
            minLen = Math.min(minLen, end-start);
            total -= nums[start];
            start++;
        }

        // current total less than required total but we reach the end, need this or else we'll be in an infinite loop.
        else {
            break;
        }
    }

    return minLen === Infinity ? 0 : minLen;
}


console.log(minSubArrayLen([2,3,1,2,4,3], 7)) // 2 -> because [4,3] is the smallest subarray
console.log(minSubArrayLen([2,1,6,5,4], 9)) // 2 -> because [5,4] is the smallest subarray
console.log(minSubArrayLen([3,1,7,11,2,9,8,21,62,33,19], 52)) // 1 -> because [62] is greater than 52
console.log(minSubArrayLen([1,4,16,22,5,7,8,9,10],39)) // 3
console.log(minSubArrayLen([1,4,16,22,5,7,8,9,10],55)) // 5
console.log(minSubArrayLen([4, 3, 3, 8, 1, 2, 3], 11)) // 2
console.log(minSubArrayLen([1,4,16,22,5,7,8,9,10],95)) // 0
