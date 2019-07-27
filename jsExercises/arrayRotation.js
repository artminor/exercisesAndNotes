"use strict";

// you can write to stdout for debugging purposes, e.g.

//rotate array buy r elements
function rotate(arr, key){
    
    
    while(key<0){
        arr.push(arr.shift());
        key++;
    }
    
    while(key>0){
        arr.unshift(arr.pop());
        key--;
    }
    
    return arr;
}


console.log("rotate back to front " + rotate([2,6,3,9,12], 2));
console.log("rotate front to back " + rotate([2,6,3,9,12], -2));
console.log("test case " + rotate([5, 42, 36, 3, 8, 27, 128], 3))