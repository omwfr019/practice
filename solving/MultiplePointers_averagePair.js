/*
    Input : Sorted array of integers, A target average.
    Output : Determine if there is a pair of values in the array where the average of the pair equals the target average.

    Constraints : Time=O(n), Spece=O(1)
*/


// 다시 풀기
function averagePair(arr, val) {
    if(!arr || !val || val < 0) return false;

    let left = 0;
    let right = 1;

    while(left >= 0 && right >= 0 && left < right) {
        if(arr[left] + arr[right] === val * 2) {
            return true;
        }

        if(arr[left] + arr[right] < val * 2) {
            left++;
            right++;
        } else {
            left--;
        }
    }

    return false;
}

function averagePairEx(arr, num) {
    let start = 0;
    let end = arr.length-1;
    while(start < end) {
        let avg = (arr[start]+arr[end]) / 2
        if(avg === num) return true;
        else if(avg < num) start++
        else end--
    }
}


console.log(averagePair([1,2,3], 2.5));
console.log(averagePair([1,3,3,5,6,7,10,12,19], 8));
