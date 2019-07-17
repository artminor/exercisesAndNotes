import {MustHaveCoffee} from './coffee/getcoffee'


var SweetSweetBasil = (function () {
    function SweetSweetBasil(name) {
        console.log("Hey, Basil do somthing " + name);
    }
    SweetSweetBasil.prototype.color = function () {
        console.log("Green");
    };
    return SweetSweetBasil;
}());
var basil = new SweetSweetBasil("Basil!");
basil.color();


let coffee = new MustHaveCoffee();