/*
  input : two arrays
  output : 'same' function should return true if every value in the array has it's corresponding value squared in the second array. 
            The frequency of values must be the same.
*/


function same(array1, array2) {
    let aryToMap = new Map();

    if (arrays[0].length != arrays[1].length) return false;
    
    arrays[1].forEach(x => {
        if(aryToMap.has(x)) {
            aryToMap.set(x, aryToMap.get(x) + 1);
        } else {
            aryToMap.set(x, 1);
        }
    });
    
    arrays[0].forEach(x => {
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

console.log(same([1,2,3],[4,1,9])); //true
console.log(same([1,2,3],[1,9])); //false
console.log(same([1,2,3],[4,4,1])); //false
