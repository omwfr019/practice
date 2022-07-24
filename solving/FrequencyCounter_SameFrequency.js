/*
    Input : two positive integers.
    Output : find out if the two numbers have the same frequency of digits.
*/

function sameFrequency(num1, num2) {
    if (!num1 || !num2) return false;
    
    if (String(num1).length !== String(num2).length) return false;
  
    let arrNum1 = Array.from(num1.toString());
    let arrNum2 = Array.from(num2.toString());
    
    for (let eachNum of arrNum1) {
        let idx = arrNum2.indexOf(eachNum);
        
        if (idx < 0) return false;
        else arrNum2[idx] = -1;
    }

    return true;
}

console.log(sameFrequency(182,281));    //true
console.log(sameFrequency(34,14));  //false
console.log(sameFrequency(3589578,5879385));    //true
console.log(sameFrequency(22,222)); //false
