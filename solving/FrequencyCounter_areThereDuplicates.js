/*
    Input : A variable number of arguments.
    Output : checks whether there are any duplicates the arguments passed in.

    using the frequency counter pattern OR the multiple pointers pattern.

    Restrictions: Time=O(n), Space=O(n)
    Bonus: Time=O(n log n), Space=O(1)
*/

function areThereDuplicates1(...args) {
    let freqCounter = [];

    for(let val of args) {
        if (freqCounter.indexOf(val) > -1) {
            return true;
        }
        else {
            freqCounter.push(val);
        }
    }

    return false;
}

function areThereDuplicates2(...args) {
    let setArgs = new Set(args);

    if(args.length !== setArgs.size) return true;
    else return false;
}

// Solution (Frequency Counter)
function areThereDuplicatesEx1() {
    let collection = {}
    for(let val in arguments) {
        collection[arguments[val]] = (collection[arguments[val]] || 0) + 1
    }
    for(let key in collection) {
        if(collection[key] > 1) return true
    }
    return false;
}

// Solution (Multiple Pointers)
function areThereDuplicatesEx2(...args) {
    // Two pointers
    args.sort((a,b) => a > b);
    let start = 0;
    let next = 1;
    while(next < args.length){
        if(args[start] === args[next]){
            return true
        }
        start++
        next++
    }
    return false
}

// Solution (One Liner)
function areThereDuplicatesEx3() {
    return new Set(arguments).size !== arguments.length;
}


console.log(areThereDuplicates(1, 2, 3));   //false
console.log(areThereDuplicates(1, 2, 2));   //true
console.log(areThereDuplicates('a', 'b', 'c', 'a'));    //true
console.log(areThereDuplicates(3,5,6,3,1,2,4));
