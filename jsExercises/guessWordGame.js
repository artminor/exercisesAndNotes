"use strict";

// you can write to stdout for debugging purposes, e.g.
// ttp guess word game challenge. 
// chances of "winning" are extremely slim because letter choice was set to be random
// word length is the number of chances allowed
function guess() {
	let answer = "smile";
	let ansArr = answer.toLowerCase().split("");
	let status = [];
	let wrongCounter = answer.length;
	let characters = "abcdefghijklmnopqrstuvwxyz";

	while (wrongCounter > 0) {
		let input = characters.charAt(Math.floor(Math.random() * characters.length));
		for (let i = 0; i < ansArr.length; i++) {
			console.log("current input is " + input + " being compared to " + ansArr[i]);
			if (ansArr[i] == input.toLowerCase()) {
				status[i] = ansArr[i];
				console.log("you got a letter right! " + status.join(""));
			}
		}
		wrongCounter--;
	}
	if (status.join("") == answer) {
		console.log("you got it! " + status.join(""));
	}

}

guess();