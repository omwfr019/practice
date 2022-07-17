/*
    Input : sorted array of integers.
    Output : an array that includes both values that sum to zero or undefined if a pair does not exist.
*/


function sumZero(arr) {
    let i = 0;

    while (arr[i] < 0) {
        if (arr.includes(arr[i] * -1)) {
            return [arr[i], arr[i] * -1];
        }

        i++;
    }
}

function sumZero2(arr) {
    for (let i=0; i<arr.length - 1; i++) {
        if (arr.includes(arr[i] * -1) && arr[i] != 0) {
            return [arr[i], arr[i] * -1];
        }
    }
}

/**
 * Ex) Naive Solution
 * Time Complexity = O(n^2)
 * Space Complexity = O(1)
 */
function sumZeroEx1(arr) {
    for(let i = 0; i < arr.lnegth; i++) {
        for(let j = i+1; j < arr.length; j++) {
            if(arr[i] + arr[j] === 0) {
                return [arr[i], arr[j]];
            }
        }
    }
}

/**
 * Ex) Refactor
 * Time Complexity = O(n)
 * Space Complexity = (1)
 */
function sumZeroEx2(arr) {
    let left = 0;
    let right = arr.length - 1;
    while (left < right) {
        let sum = arr[left] + arr[right];
        if (sum === 0) {
            return [arr[left] + arr[right]];
        } else if (sum > 0) {
            right--;
        } else {
            left++;
        }
    }
}


console.log(sumZero([-3,-2,-1,0,1,2,3])) //[-3, 3]
console.log(sumZero([-2,0,1,3])) //undefined
console.log(sumZero([1,2,3]))    //undefined
console.log(sumZero([-5,-4,-2,0,1,3,4]))
