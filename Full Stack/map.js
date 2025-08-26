// Map in JAVA :
// It is a collection ok key value pair with some special features :
// key can be of any type : String,numbers,objets etc.
// Keeps the order of the keys as you add them.

   // How to create map :
//1. Using new Map() and set().
let myexample=new Map()
myexample.set("name","shivang");
myexample.set("age",20);
console.log(myexample);

// 2. Passing an array of key value pair.
let examples=new Map([
    ["name","shivang"],
    ["age",20],
    ["section d","D"]
])
console.log(examples);