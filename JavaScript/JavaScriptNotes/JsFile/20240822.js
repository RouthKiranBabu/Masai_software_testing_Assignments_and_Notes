/*
Object oriented Programming 
1. Encapsulation
2. Abstraction
3. Polymorphism
4. Inheritence 
Object is the non-primitive datatype in javascript 
Object can have properties-value and methods-functions
Object can posses both mehtod and properties.
Object literal is in the form of let obj = {}
Encapsulation encapsulated it inside an object.
this is the keyword of the javascript.
this is used to set the context of the object.
this is the reference of the object.
this keyword is setting up a reference to the current object
*/
let obj = {
    n1 : 1,
    n2 : 2,
    add: function(){
        return this.n1 + this.n2;
    },
    printthis: function(){
        console.log(this);
    }
}
console.log(obj.add(), obj.n1, obj.n2);
console.log(Object.entries(obj));
console.log(obj.hasOwnProperty('addd'));
/*3 1 2
[
  [ 'n1', 1 ],
  [ 'n2', 2 ],
  [ 'add', [Function: add] ],
  [ 'printthis', [Function: printthis] ]
]
false*/

//spread operator spreads the value of the array
let arr = [1, 2, 3, 4];
console.log(Math.min(...arr));
console.log(Math.max(...arr));
/*1
4*/

let a1 = [1, 2, 3];
function addthree(a, b, c){
    return a + b + c;
}
console.log("After addition:", addthree(...a1));
// After addition: 6

function add(n1, n2){return n1 + n2;}
function sub(n1, n2){return n1 - n2;}
function mul(n1, n2){return n1 * n2;}
function div(n1, n2){return n1 / n2;}
/* function c is a higher order function it is div as the argument
function which either returns or takes a function as an argument is nothing
but the higher order function
now the function which is getting passed as an argument inside other function
is a callback
the arrow function does not have its own this key word
when i will pass this reference inside an arrow function which is lets say
a part of object so it wont be able to refer to recognize the this reference
*/
let c = (num1, num2, func) => { return func(num1, num2);}
console.log(c(3, 2, div));

// particular variable is not stored becouse arrow function does not have
// this reference
let e = {salary: 25000, overtime: 5, ratePerOverTime: 500, 
    calculateTotalSalary: () => {return this.salary + (this.overtime * this.ratePerOverTime)}};
console.log(e.calculateTotalSalary()); // NaN - Not a Number

// Not a arrow function
let e1 = {salary: 25000, overtime: 5, ratePerOverTime: 500, 
    calculateTotalSalary: function(){return this.salary + (this.overtime * this.ratePerOverTime)}};
console.log(e1.calculateTotalSalary()); // 27500

let e3 = {key1: "value1", key2: "value2", key3: "value3"};
console.log(e3); // { key1: 'value1', key2: 'value2', key3: 'value3' }

let e4 = {...e3};
console.log(e4); // { key1: 'value1', key2: 'value2', key3: 'value3' }

let e5 = {key2: "value5", key3: "value3", key4: "value4"};
console.log(e5); // { key2: 'value5', key3: 'value3', key4: 'value4' }
let mergeobj = {...e4, ...e5};
console.log(mergeobj); // { key1: 'value1', key2: 'value5', key3: 'value3', key4: 'value4' }

let arr1 = [1, 2, 3];
let arr2 = [4, 5, 6];
let arr3 = [...arr1, ...arr2];
console.log(arr3); // [ 1, 2, 3, 4, 5, 6 ]

let e6 = {};
console.log(e6); // {}
e6['name'] = "firstname";
console.log(e6, e6['name']); // { name: 'firstname' } firstname
e6.name = "lastname";
console.log(e6, e6['name']); // { name: 'lastname' } lastname

// Check whether the property is present or not 
console.log("name" in e6, "Name" in e6); // true false

let e7 = {"name": "first"};
e7.name = "firstmodify";
console.log(e7.name);
// will not make change to object
Object.freeze(e7);
e7.name = "againmodify";
console.log(e7.name);

let e8 = {"k1": "v1", "k2": "v2"};
console.log("k1" in e8); // true
console.log("k3" in e8); // false
console.log(e8.hasOwnProperty("k1")); // true
console.log(e8.hasOwnProperty("k3")); // false
delete e8.k1;
console.log(e8); // { k2: 'v2' }
e8 = {"k1": "v1", "k2": "v2", "k3": "v3"};
for(let key in e8){
    console.log(key);
}
// Output provides keys:
// k1
// k2
// k3

// to get the values:
for(let key in e8){
    console.log(e8[key]);
}// Output:
// v1
// v2
// v3

// var is the function scope
function print(){
    var var1 = "Masai";
}
// console.log(var1) // ReferenceError: var1 is not defined

// console.log(va1);
// let va1 = "value"; // ReferenceError: Cannot access 'va1' before initialization

// console.log(e9);
// var e9 = "value"; // undefined

// console.log(va1);
// const va1 = "value"; // ReferenceError: Cannot access 'va1' before initialization

/*
Creation phase:
1. Memory Space Allocation
2. Function Declarations assigned
3. Variable declarations assigned 
4. this binding created

Executon phase:
1. Javascript is executed line by line

let and const keywords are hoisted
the value will be assigned as undefined to a variable declared with let and const
yes they are hoisted like the variable with var keyword
but while the creation to execution it will go to TDZ
*/
// let a = undefined; console.log(a); // undefined
/*
declaring variable with var, let and const they are hoisted Hoisting
we can access the variable, function before initialization and the 
default value it will be assigned as undefined when I will print or access
a variable with var before init it will give me the undefined becouse of the 
hoisting 
let and const - yes they are hoisted but the values till they are assigned
as undefined will be in a temporal dead zone (unaccessible by the logic)
let and const are blocked scope
let reassign it 
var is function scope 
var you can redeclare and reassign
const you can do both 
*/