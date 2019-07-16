class SweetSweetBasil{
	name: string;
	color:string;
	constructor(){
		// console.log("Hey, Basil do somthing " + name);
		// this.color = startColor;
	}
	getColor(){
		console.log(this.color)
	}
}

let basil = new SweetSweetBasil();

// basil.getColor();


class Basil extends SweetSweetBasil{
	constructor(name:string, startColor:string){
		//always have to call super when calling from inherited class
		super();
		this.name = name;
		this.color = startColor;
	}

	setNewColor(newColor:string){
		this.color= newColor;
	}
}

let morebasil = new Basil("basil", "bright green");

morebasil.getColor();
morebasil.setNewColor("Red");
morebasil.getColor();