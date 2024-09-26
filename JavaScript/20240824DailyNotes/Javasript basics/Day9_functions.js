// syntax 
function sayMyName() {  // function statement // function declaration 
console.log("Divyang")
}
sayMyName // reference to my function
sayMyName() // executing the function

// function statement is nothing but a function declared ysimpl with the function keyword 


// function expression

// const myfunction = function () {  // i can use the anonymous function to declare expression 
//     console.log("Divyang")
// }

// myfunction();


// Anonymous function
// ANONYMOUS FUNCTION CANT WORK ALONE OR IT CANT BE CALLED 
// Anonymous function is nothing but A function who has no name 
// WHAT IS THE USE
// function (){ // HOW I WILL CALL THIS FUNCTION
//     console.log("hELLO")
// }

// argument vs parameters

//parameters 
// you can only call a function after the declaration

// return that will be considered as the output of function when you will call it 
// dont return anything inside a function 
// the default value which will get returned is nothing its the undefined
// console.log(addTwoNumbers(8,4)); 
// argument is something of a value which you are passing at the time of calling or execution of the function 
// parameter is nothing but the particular variables which will pass inside the function and we will assign them values 
// as a part of argument while calling the function

// return


// let answer = addTwoNumbers("a","b") // the sum which is getting returned 
// console.log(answer);
// nesting in the function

// scope 
// where can i access my variables is nothing but scope
// global scope  block scope function scope
// lexical scope 
// lexical means surrounding 
// the particular child function 
// the child or nested functions will be able to access the variable of the parent function 
function add(num1, num2){  // add
    return num1+num2 // i need to return a value 
} // nested function

function multiply(num1,num2){ // multiply
    return num1*num2
}


function calculator(num1, num2, operation){ // parent function
    return operation(num1,num2);// higher order function
}

// call back is the function passed as an argument 
// higher order function is a function which takes a function as an argument or it returns a function
console.log(calculator(5,3, add))

// let answer =calculator(5,2);

// console.log(answer)


// fat Arrow function
let division = (a,b)=>{
    return a+b;
}
 
let division1 = (a,b)=> a+b; // i am returning the a+b
 
// i dont need to use the return keyword to return something in an arrow function 
// if the function is just a one liner or my return statement is in the single statement


// readebility 

//Higher order function 
// The function which takes another function as an argument 

// Call backs the function which will be a parameter for another function 
// ascii value nothing but a number designated to a string value 
// sort on the array it will sort it in the according to the ascii value 
let array= [1,2,5, 6, 3,4];
// call back is nothing but a function as a parameter
array.sort((a,b)=>{ // call back here 
return a-b; //  ascending order descending order 
}); 
//.sort is nothing but a higher order function

// function as a parameter
// call back 
// (a,b)=>{ // call back here 
//return a-b; //  ascending order descending order 
//}
// function which has a call back
// that parameter can be a function 
// console.log(array);































// console.log(Math.floor(Math.random() * (10- 5 + 1)) + 5);