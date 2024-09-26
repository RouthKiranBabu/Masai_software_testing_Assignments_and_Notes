// there are certain methods or functions which are the in-built function of a browser-WebAPIs
// window object  has certain in built functions
// are the in built function or we can say methods of the window object or browser
//console.log("Hello"); // in built function/WebAPIS of the browser
// i am accessing a in built function of browser 
// prompt method is used to take the input from the browser 
// let input =prompt("Hey Enter your name!");
// console.log(input);
// alert
// alert is used to give any message which is you know necessary to pop out 
// or like a waring or error message 
// alert("Hi");
// ok return true
// cancel means false

//confirm
// confirm("Hi")
// ok cancel
// return true or false 

// it will give you the option of true and false 
// it will take a call back 
// setInterval(()=>{
//     console.log("Hey Print this in every 3 second")
// },5000)// 3000==> 3s
// it will execute the code/ logic in the set of interval 

// setInterval(callback, time(ms))
// setTimeout(()=>{
//   console.log('HI')// it will execute the logic after end of mentioned time
// },5000)


// date

// let currDate= new Date();
// console.log(currDate);
// //give is the time with regard to time zone
// console.log(currDate.getTime())
// GET THE MONTH 
// console.log(currDate.getMonth())
// // YEAR
// console.log(currDate.getYear());
// // date 
// console.log(currDate.getDay());
// //day
// // MINUTES
// console.log(currDate.getDate());

// console.log(currDate.getMinutes());
// // seconds minute hours
// console.log(currDate.getSeconds())

// web apis browser methods
// //floor
// let num=9.5;
// console.log(Math.floor(num));
// // round it off to the lesser value or it will remove the decimal and convert it into a lesser digit
// // Ciel
// console.log(Math.ceil(num));
// // it will round it of to the particular larger value

// // abs absolute value // positive value 
// let num2= -9; 
// console.log(Math.abs(num2));
// //max min
// let a =10; 
// let b=9; 
// let c=11; 
// console.log(Math.max(a,b,c));// maximum number 
// // minimum Math.min()
// console.log(Math.random()) // it will generate some random value between 0 and 1

// let say you have to test a sign up page 
// everytime to test sign up
// i need a new email everytime 
// divyang@gmail.com
let randomValue= Math.random().toString().substring(2)// it will generate a number between 0 and 1 and it will
// convert it to string
// console.log(randomValue);
// let randomemail= `divyang${randomValue}@gmail.com`
// console.log(randomemail);

// 0.234
// "0.234"
// 234

// palindrome 
// "121" ==> 121 , 121
let num=121
// num =["1", "2", "1"]


// you can achieve a good functionality by chaining of in built functions
console.log(num===Number(num.toString().split("").reverse().join("")));

// num.toString() --> 123 "123"
// .split("")  "123" --> ["1", "2", "3"] 
// .reverse() ["3","2","1"]
// join() --> "321"

// parseInt "9" "123" -->123
// Number("123")--> 123
// isNaN() //not a number boolean 
console.log(typeof(parseInt("9")));
