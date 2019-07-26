// function replaceSpace(str, num){
// 	return str.trim().split(" ").join("%20");
// }


// replaceSpace("Sarah Jane Smith     ", 16);



function countLetters(string) {
	let newString = "";
	let miniString = "";
	let miniCount = 1;

	let str = string.split("");

	for (let i = 0; i < str.length; i++) {
		if (str[i] === str[i + 1]) {
			miniCount++;
			miniString = str[i] + miniCount;
		} else {
			miniString = str[i] + miniCount;
			newString += miniString;
			miniCount = 1;
			miniString = "";
		}
	}

	if (newString.length < string.length) {
		return newString;
	} else {
		return string;
	}
}

countLetters("aaaabbbbcccDddd")