/*
  Input : two strings
  Output : The function 'validAnagram' should return true if the second string is an anagram of the first.
  
  ※ 모든 입력값은 한 단어
  ※ 공백, 마침표, 구두점, 숫자 등은 고려하지 않음
  ※ 모두 소문자라고 가정
*/


function validAnagram(first, second) {
    if (first.length !== second.length) {
        return false;
    }

    const lookup = {};

    for (let i = 0; i < first.length; i++) {
        let letter = first[i];
        // if letter exists, increment, otherwise set to 1
        lookup[letter] ? lookup[letter] += 1 : lookup[letter] = 1;
    }

    for (let i = 0; i < second.length; i++) {
        let letter = second[i];
        // can't find letter or letter is zero then it's not an anagram
        if (!lookup[letter]) {
            return false;
        } else {
            lookup[letter] -= 1;
        }
    }

    // for (let letter of first) {
    //     lookup[letter] ? lookup[letter] += 1 : lookup[letter] = 1;
    // }

    // for (let letter of second) {
    //     if (!lookup[letter]) {
    //         return false;
    //     } else {
    //         lookup[letter] -= 1;
    //     }
    // }

    return true;
}


console.log("result: " + validAnagram('', ''));  //true
console.log("result: " + validAnagram('aaaz', 'zzza'));  //false
console.log("result: " + validAnagram('anagram', 'nagaram'));  //true
console.log("result: " + validAnagram('rat', 'car'));  //false
console.log("result: " + validAnagram('awesome', 'awesom'));  //false
console.log("result: " + validAnagram('qwerty', 'qeywrt'));  //true
console.log("result: " + validAnagram('texttwisttime', 'timetwisttext'));  //true
