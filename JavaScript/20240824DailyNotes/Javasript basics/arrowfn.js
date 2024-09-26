

// function statement or Declaration 

// function myFunction(){

// }
// // function expression 
// let myfunction2= function (){  // anonymous function nameless function
//    return "hello"
// }
// console.log(myfunction2());

// arrow function 
// if we want to return something in a single line 
// we dont need to use the return keyword 
// if it is a single line or output it will return but no need to use the return keyword 
// also it will increase the readebility

// let myfunction3=()=>"hello"; //return 
// console.log(myfunction3());
// function keyword is not needed 

// callback function 
// it is a function which is an argument of an another function
// higher order function is a function which will take argument as a function or it will return a function 

// let add=(num1, num2)=>{
//     return num1+num2;
// }
// // let multiply =








let calculator =(num1, num2, operation)=>{
    return operation(num1, num2);
}

let answer= calculator(2, 5, add);
//calculator function is a higher order function
// it is taking add as an argument // it is returning a function
// any function which either returns function or takes a function as an argument is nothing but a higher order function
// now the function which is getting passed as an argument inside an another function is a callback
// the arrow function does not have its own this key word 
// when i will pass this reference inside an arrow function which is lets say a part of object 
// so it wont me able to refer to recognize the this reference 














// let product= calculator(2,5,(num1, num2)=> num1*num2)
// // add is nothing but a callback function 
// // calculation is nothing but its a higher order function
// console.log(answer);
// console.log(product);


// scope 

// anything which is accessible is my scope 
// the accessibility of the variable by a piece of code is nothing but the scope

// lexical 
// things which are surrounded 
// lexical scope will allow the function to access the function of its parent 
// parent function 

function parent(){// but the parent was not able to access the variable from inside 
    let outsidevariable="Outside"
    function nested(){ // child was able access the variable from outside 
        let insidevariable="Inside"
        console.log(outsidevariable);// access this variable 
        console.log(insidevariable);

    }
    nested();
    // console.log(insidevariable);// child variable 
    console.log(outsidevariable);
}
parent();

