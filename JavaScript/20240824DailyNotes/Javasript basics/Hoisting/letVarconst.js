// Scope means is the particular vairable is it accessible or not
// var num=66;
//  Var is a keyword to declare the variable
// Var is a global scope
// Var is a function scope
// var re-declared and it can be re-assigned 
// var num=77;
// var num=79;
// re declaration 

// console.log(num);
// function print(){
//      var a="Masai"
// }
// console.log(a);
// let name="Divyang";
//redeclaring is not allowed

// let num2=77; 
// let  is a keyword to declare the variable
// let is block scope
// let can be reassigned but not redeclared
// num2=88;
// console.log(num2);

// const num3= 88;
// redeclaration
// num3=99;// reassigning
// const is a keyword to declare the variable
//const is also block scoped
//const cant be reassigned or cant be redeclared 
// upto down fashion 


console.log(a);// it will already have the value of undefined
// it will give me an error that the variable is not defined --> java 
var a=10; // function scoped 
// var b=15; // creation phase is going on it will get the value assigned of undefined
// it will give me undefined as a output
console.log(b);

// let and const keyword are hoisted
// the value will be assigned as undefined to a variable declared with let and const  
// yes they are hoisted like the variable with var keyword
// but while the creation to execution it will go to TDZ
// let b=20;
// b=30;// reassigning 
// var c=20
// var c=30// redeclaring 
// const constant;// its the part of the syntax
// i can put the constant un init
// const constant; err
// const constant =10; // redeclaration  err
//constant=50; // reassign err
// console.log(constant);
// Syntax error: error regarding the syntax 
// console.log(b);
// let b=40;
// reference error :which is regarding the referring we can say accessing the variable

const a=50; 
a=60; // syntax error 
console.log(a);