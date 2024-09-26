// let age =17;

// // line 1 
// // line 2 
// //line 3

// if else 
// if(age>=18){
//     //statement 
//     console.log('You are able to vote');
//     // conditional is not satisfied 
// }
// else console.log('You are not eligible to vote') // else block will execute


// Travelling to abroad 
// passport
//visa

let passportIspresent= false;
let visaIspresent = false;

if((visaIspresent && passportIspresent) ){
    // both of the condition should get followed 
    console.log('You can travel');
}
else if (visaIspresent){
    console.log('You have visa but you need passport');
}
else if(passportIspresent){
    console.log('You have passport but...');
}
else console.log('you cant travel abroad');
 
// if 
// else if 
// else 

// let say i am arranging a party 
// the person should be my friend 

// or  he should be above 16
let isMYfriend= false;
let age =13; 
// AND operator all of the condition should be true it should be satisfied &&
// OR one from the mention condition should be satisfied ||
//!
if( age>16 || isMYfriend){
    console.log('you are welcome to the party'); // executed 
}
// else if(isMYfriend){
//     console.log('You are my friend come to next party');
// }
else console.log("Dont come to party");




// switch statments 

let day =8;

switch(day){
    case 1:console.log("Monday"); 
    break;
    case 2: console.log("Tuesday");
    break;
    case 3: console.log("Wednesday");
    break;// break will stop the execution 
    // continue will skip the current interation
    default:console.log("Invalid day number");
}
// Ternary operator
// if i want to use a one liner to check the conditions 
// if i want to execute either this or that
// let age =17;
let canYouvote = age>=18 ? console.log("You can vote") : console.log("You cant vote");

// let say i am arranging a party 
let isMyfriend = true;
console.log(!true)
if(isMyfriend!==true){
    console.log("Dont come to the party");
}

// Not operator
