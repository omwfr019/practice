/*
    Input : sorted array.
    Output : counts the unique values in the array.

    ※ There can be negative numbers in the array.
*/


function countUniqueValues(arr) {
    let cntUniqueValue = 1;

    if (arr.length === 0) { return 0; }

    for (let i=1; i<arr.length; i++) {
        if (arr[i] != arr[i-1]) cntUniqueValue++;
    }

    return cntUniqueValue;
}

function countUniqueValues2(arr) {
    return new Set(arr).size;
}

function countUniqueValues3(arr) {
    return arr.filter((item, index) => arr.indexOf(item) === index).length;
}

/**
 * Ex) Refactor
 * Time Complexity = O(n) 
 */
function countUniqueValuesEx(arr) {
    if(arr.length === 0) return 0;

    let i = 0;
    for(let j = 1; j < arr.length; j++) {
        if(arr[i] !== arr[j]) {
            i++;
            arr[i] = arr[j];
        }
    }
    return i + 1;
}


console.log(countUniqueValues([1,1,1,1,1,2]))   //2
console.log(countUniqueValues([1,2,3,4,4,4,7,7,12,12,13]))  //7
console.log(countUniqueValues([]))    //0
console.log(countUniqueValues([-2,-1,-1,-0,1])) //4
