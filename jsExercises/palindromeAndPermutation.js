function palindrome(word) {
	let reverse = [];
	let wordArr = word.split("");

	//flip word backward
	for (let i = wordArr.length - 1; i >= 0; i--) {
		reverse.push(wordArr[i]);
	}

	//compare flipped word
	if (reverse.join("") == word) {
		return true;
	} else {
		return false;
	}
}

// palindrome("racecar");
// palindrome("racear");


function permutation(word, compareWord) {
	let wordArr = word.toLowerCase().split("");
	let compWordArr = compareWord.toLowerCase().split("");
	let wordObj = {};
	let compObj = {};

	//make obj to track letters in each word
	for (let i = 0; i < compWordArr.length; i++) {
		if (!compObj[compWordArr[i]]) {
			compObj[compWordArr[i]] = 1;
		} else {
			compObj[compWordArr[i]]++;
		}

	}

	console.log(compObj);
	for (let i = 0; i < wordArr.length; i++) {
		if (!wordObj[wordArr[i]]) {
			wordObj[wordArr[i]] = 1;
		} else {
			wordObj[wordArr[i]]++;
		}
	}

	console.log(wordObj);
	let result = false;

	//compare objects
	for(let key in wordObj){
		if(wordObj[key]==compObj[key]){
			result = true;
		}else{
			result = false;
		}
	}
	return result;


}

permutation("Tact coa", "taco cat");