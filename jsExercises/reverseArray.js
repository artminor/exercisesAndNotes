// Write a function that accepts an array and returns a reversed copy of that array. Use recursion.

function reversedArr(arr){
	var backwards = [];
	if(!arr[0]){
		return arr;
	}else{
		backwards.push(arr.pop());
		return backwards.concat(reversedArr(arr));
	}
}


var arr = [1,2,3,4];

// var reversedArr = reverseArray(arr);

console.log(reversedArr(arr))    // [4,3,2,1]
// console.log(arr)    // [1,2,3,4]