/*
    Input : Two strings.
    Output : Checks whether the characters in the first string from a subsequence of the characters in the second string.

    The function shold check whether the characters in the first string appear somewhere in the second string, 
    without their order changing.
*/


function isSubsequence(substr, str) {
    let chkIdx = 0;

    for(let char of str) {
        if(substr.charAt(chkIdx) === char) {
            chkIdx++;
        }

        if(chkIdx === substr.length) {
            return true;
        }
    }

    return false;
}

// 반복
function isSubsequenceEx1(str1, str2) {
    var i = 0;
    var j = 0;
    if (!str1) return true;
    while (j < str2.length) {
        if (str2[j] === str1[i]) i++;
        if (i === str1.length) return true;
        j++;
    }
    return false;
}

// O(1) 공간이 아닌 재귀
function isSubsequenceEx2(str1, str2) {
    if(str1.length === 0) return true;
    if(str2.length === 0) return false;
    if(str2[0] === str1[0]) return isSubsequence(str1.slice(1), str2.slice(1))
    return isSubsequence(str1, str2.slice(1))
}


console.log(isSubsequence('hello', 'hello world')); ///true
console.log(isSubsequence('sing', 'sting'));    //true
console.log(isSubsequence('abc', 'abracadabra'));   //true
console.log(isSubsequence('abc', 'acb'));   //false
