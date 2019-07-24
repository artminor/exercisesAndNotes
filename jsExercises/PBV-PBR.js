var dolly = ['Dolly', 'sheep', []];

function getClone(animal) {
  // get new clone name
  var cloneName = animal[0] + 'clone';
  // instantiate new array
  var clone = [cloneName, animal[1], []];
  
  // push clone name to original animal
  animal[2].push(cloneName);
  
  return clone;
}


console.log(getClone(dolly))
console.log(getClone(dolly))
// dolly should have two clone children after two function calls. both mutate the original array.
console.log(dolly)

console.log('-------------------')
// params: an array, a start index to start splicing, and a number of elements to splice
function mySplice(arr, start, numToDelete) {
  var startElems = getInitialElem(arr, start);
  var deletedElems = getDeletedElem(arr, numToDelete);
 
  for(var i=0; i<startElems.length; i++) {
    // must use an array method that will mutate the original array (so cannot use concat here)
    arr.unshift(startElems.pop())
  }

  return deletedElems;
}

// helper function to get elements in the original array
// up to the index where we start slicing
// side effect: mutates original array
function getInitialElem(arr, stop) {
  var initial = []
  for (var i=0; i<stop; i++) {
    initial.push(arr.shift());
  }
  return initial;
}

// helper function to get elements in the original array
// loop up until delete count
// side effect: mutates original array
function getDeletedElem(arr, deleteCount) {
  var deleted = [];
  for (var i=0; i<deleteCount; i++) {
    deleted.push(arr.shift())
  }
  return deleted;
}

var myArray = [1,2,3];
console.log("deleted elements: ", mySplice(myArray, 1, 1))    // [2]
console.log("original array:", myArray)    // [1,3]

