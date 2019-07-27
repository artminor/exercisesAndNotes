
function common(str1, str2){
    let temp = "";
    if(str2.length<str1.length){
        temp=str2;
        str2=str1;
        str1=temp;
    }
    
    let arr1 = str1.split(""), arr2 = str2.split(""), com = 0;
    
    for(let i = 0; i <arr1.length; i++){
        for(let j = 0; j<arr2.length; j++){
            if(arr1[i]==arr2[j]){
                com+=1;
                arr2.shift(j);
                break;
            }
        }
    }
    return com;
}

console.log(common("ABAZDC", "BACBAD")); //ABAD L=4
console.log(common("ABC", "AC"));
console.log(common("AC", "ACDEF"));
console.log(common("ABAZDCAAAAA", "BACBADAAAAA"));