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


console.log(sumZero([-3,-2,-1,0,1,2,3])) //[-3, 3]
console.log(sumZero([-2,0,1,3])) //undefined
console.log(sumZero([1,2,3]))    //undefined
console.log(sumZero([-5,-4,-2,0,1,3,4]))
