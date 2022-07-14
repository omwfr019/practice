/*
  input : two arrays
  output : 'same' function should return true if every value in the array has it's corresponding value squared in the second array. 
            The frequency of values must be the same.
*/


function same(array1, array2) {
    let aryToMap = new Map();

    if (arrays1.length != arrays2.length) return false;
    
    arrays2.forEach(x => {
        if(aryToMap.has(x)) {
            aryToMap.set(x, aryToMap.get(x) + 1);
        } else {
            aryToMap.set(x, 1);
        }
    });
    
    arrays1.forEach(x => {
        let searchValue = Math.pow(x,2);
        
        if(aryToMap.has(searchValue)) {
            if(aryToMap.get(searchValue) == 1) { 
                aryToMap.delete(searchValue);
            } else {
                aryToMap.set(searchValue, aryToMap.get(searchValue) - 1);
            }
        }
    });
    
    if (aryToMap.size != 0) {
        return false;
    }
    
    return true;
}


/**
 * EX) A naive solution (Time Commplexity = O(N^2))
 */
function sameEx1(arr1, arr2) {
    if(arr1.length !== arr2.length) {
        return false; 
    }
    for(let i=0; i<arr1.length; i++) {
        let correctIndex = arr2.indexOf(arr1[i] ** 2)
        if(correctIndex === -1) {
            return false; 
        }
        arr2.splice(correctIndex, 1)
    }
    return true
}


/ **
  * EX) Refactored (Time Complexity = O(N))
  */
function sameEx2(arr1, arr2) {
    if(arr1.length !== arr2.length) {
        return false;
    }
  
    let frequencyCounter1 = {}
    let frequencyCounter2 = {}
    for(let val of arr1) {
      frequencyCounter1[val] = (frequencyCounter1[val] || 0) + 1
    }
    for(let val of arr2) {
      frequencyCounter2[val] = (frequencyCounter2[val] || 0) + 1
    }
    for(let key in frequencyCounter1) {
      if(!(key ** 2 in frequencyCounter2)) {
          return false 
      }
      if(frequencyCounter2[key ** 2] !== frequencyCounter1[key]) {
          return false 
      }
    }
    return true
}


console.log(same([1,2,3],[4,1,9])); //true
console.log(same([1,2,3],[1,9])); //false
console.log(same([1,2,3],[4,4,1])); //false
