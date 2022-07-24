/*
    Input : sorted array of integers.
    Output : index where the value passed to the function is located.
*/


/**
 * A naive solution
 * Linear Search (선형 탐색)
 * Time Complexity = O(n) 
 */
function searchEx1(array, val) {
    for (let i = 0; i < array.length; i++) {
        if (array[i] === val) return i;
    }
    return -1;
}

/**
 * Refactor
 * Binary Search (이진 탐색)
 * Time Complexity = Log(n)
 */
function search(array, val) {
    let min = 0;
    let max = array.length - 1;

    while (min <= max) {
        let middle = Math.floor((min + max) / 2);
        let currentElement = array[middle];

        if (array[middle] < val) {
            min = middle + 1;
        }
        else if (array[middle] > val) {
            max = middle - 1;
        } 
        else {
            return middle;
        }
    }

    return -1;
}


console.log(search([1,2,3,4,5,6],4));   //3
console.log(search([1,2,3,4,5,6],6));   //5
console.log(search([1,2,3,4,5,6],11));   //-1
