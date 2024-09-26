// data type of textual value which we are storing
// Immutable nature of the string 
// let arr= [1,2,3]
// arr[1]=4;
// console.log(arr);
// let str="Hello";
// console.log(str);

// console.log(str.indexOf("e"));
// // indexing will also here start from the zero
// console.log(str[1]);
// console.log(str.charAt(1));

// .replace()
// any of the manipulation or change you do on the original string 
// it will not reflect or change the original string but it will get stored itnot
// a new string 
// let str2=str.replace("H", "M");
// console.log(str2);

// declaration 
// let str1='Hello';  // single quotes 
// let str3="Divyang"; // double quotes 
// let str4=`Masai`// back tics //string 
// let array = new Array(1,2,3);//object
// let string = new String("Dehli");// object
// console.log(typeof(str3));
// console.log(typeof(string));

// navigation
// length is also a property a string 
// like an array i can access whatever be the individual character of a string
//looping 
//let str="Masai is very good platform"
// for(let i=0; i<str.length; i++){
//     console.log(str[i]);
// }
// navigation

// console.log(str.indexOf("e")); // it will give me the first occurence of my character 
//console.log(str.lastIndexOf("o"));



// replace  will change the first occurence of the partcular element which i gave to replace
//replace all // every particular element 
// let newStr= str.replaceAll("a", "e"); 
// console.log(newStr);

// let name="Tivyang"; 
// console.log(name.startsWith("D"));  // boolean value 
// console.log(name.endsWith("g"));//  true


// concatenation
// let newString= "Hello"
// let anotherString= newString.concat(" Masai")
// console.log(anotherString);

// manual concatenation 

// let anothercity= "Mumbai"
// console.log(city + 6);
// template literal 
// TO CONCATENATE OR TO GIVE VALUE OF A VARIABLE INSIDE STRING
// let city=`Dehli  ${anothercity}`
// console.log(city);


// trim()
// login page 
// username 
// password 
// qwerty  
// let setence = "   My name is Divyang     " // at the end 

// let shortSentence= setence.trimEnd();
// trim(); 
//trimStart(); // remove the white space from the start 
//trimEnd(); // remove it from the end

// console.log(setence);
// console.log(shortSentence);

// join()

let array=[1,2,3,4]; 
let arrStr=array.join(" and ")
seperator //,
// it will join the particular array and convert it to the string 
console.log(arrStr);
console.log(typeof(arrStr));


// split // opposite of join

// let nameOFcity= "Hyderabad is a good city"
let anotherString= nameOFcity.split(""); 
// console.log(anotherString); 


// //converting string into a number
// let string ="123"

// let strNum= Number(string); // it will throw an error // it should be a number otherwise not a number

// let numstr= +string;
// console.log(typeof(numstr));


//ASCII 
// it is a number address assigned to every string elements which we type
// charCodeAt(); //ASCII VALUE OF STRING VALUE IS NOTHING BUT 49
// let str="Apple";
// let cutStr=str.substring(1,3);  // slice
// let slicedStr= str.slice(1,3);
// console.log(cutStr);
// console.log(slicedStr);


// console.log(str.charCodeAt(1));// ASCCII Value of the index

// console.log(String.fromCharCode(112));// String value 

// "p" "P" "!#?"

// substring 
// its a portion of  a string
// slice also we can perform on the string

// //.repeat(count)
// let repString=string.repeat(4)
// console.log(repString);


let str= "Hello";
str.split();
// the split() is an in built function which you can access when you are declaring a string
// this is a function which i am declaring
function myName(){
    console.log('Divyang');
}