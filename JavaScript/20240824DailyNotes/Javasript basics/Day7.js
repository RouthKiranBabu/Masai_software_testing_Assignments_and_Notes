// for of 
// for of will directly access the value 
// it will auto increment 
// declaration of the array 
let array= [22,33,44,55]
const arr2= new Array("Array", "aRRAY2")
console.log(typeof(arr2))
// // property 
// array.length // it will return me the length of array 

// methods in array 
// inbuilt method or we can say function of the array 
// let index=array.indexOf(22);
// console.log(index);

//multiline
/**
 slice
 splice 
 includes 
 reverse 
 join
*/

// push
//pop 
//shift 
//unshift 


// // push
// cities.push('Banglore'); // end of the array
// // unshift 

// cities.unshift('Chandigarh');// add it to the start of the array 
// console.log(cities);

// this methods are manipulating the actual array 

// let fruits=['Orange', 'Grapes', 'Papaya'];
// // pop and shift
// fruits.pop(); 
// fruits.shift();
// console.log(fruits);
// this will also manipulate the real array 

// slice 

let cities =['Ahemdabad', 'Dehli', 'Mumbai', 'Banglore', 'Chandigarh']; 
// // array.slice(startindex, endingindex) endindex without including it 
// let slicedCities=cities.slice(2);
// console.log(slicedCities);
// let removedItem=cities.pop()
// console.log(removedItem);
// index , count 
// it will remove that element
// array.splice(startingIndex, number of element which i want to remove, the values which i want to add)
// cities.splice(1,3, "Rajkot", "Surat");

// console.log(cities);
// slice if i use it will create a new array from the original array
// splice will again manipulate the original array

// // now to access the new generated array i need to declare it inside a variable 
// //reverse
// cities.reverse();
// console.log(cities)
// // concat 
// let num1= [22,33,44,55]

// let num2=[77,88,99]
// let concatArray=num1.concat(num2)
// it will also create a new array
// console.log(concatArray)
// let presentOrNOt =num2.includes(78);
// console.log(presentOrNOt);
// let array2= [22,33,44,55]
// let strArray=array2.join();
// .join() it will convert the array to string by joining all the elements
// console.log(typeof(strArray));
// Textual data stored in variable 
// declaration 
const string= "Hello";

//! Length
string.length
// ! Accessing 
console.log(string[0])
console.log(string.charAt(1));

// ! looping 
for(let i=0; i<string.length; i++){
    console.log(string[i]);

}
// for of can also be used for string
for(let char of string){
    console.log(char)
}

// !changing the string 
string[3] = "p"
console.log(string);

// strings in js is immutable 
const strp =string.replace("Hel","Mel")
console.log(strp)


// .replace // replaces the first instance 

// replace all // replaces every instance 

// concat // to join two strings  + .concat()   

// trim remove trailing and leading space 


// ! searching navigation 
// indexOf()

// lastIndexOf

//startsWith() // boolean

// endsWith()

//! Substring 
console.log(string.substring(1,3)) // without    inclusion of index  // can compare it with slice 
// if we dont provide it will go till last index // we need to give index +1 inside it to go till last


//! Conversion
console.log(string.toLowerCase())
console.log(string.toUpperCase())

let num = 1; 
let strNum= String(num)
console.log(String(num)) // this wont work for the array will give unwanted result
console.log(typeof(strNum))

// !ASCII Value
console.log(string.charCodeAt(0))

console.log(String.fromCharCode(72))  // i can see what Alphabet has ASCII value of 72

// comparison
console.log(string.includes("el"))

// split and join strings 
console.log(string.split(" ")); // splits according to seperator and returns an array

// For array or anything   toString can be used

// .join() can be used on array 

let arr=[1,2,3,4]
let joinedStr=arr.join(" and ")// in built method of javascript 
console.log(joinedStr)
let str="123"
let numStr= Number(str)
let numStr2= +str
console.log(numStr);
console.log(typeof(numStr2));
// reverse cant be performed on a string


// isPalindrome
let x=121
let isPalindrome= Number(String(x).split("").reverse().join(""))
console.log(x===isPalindrome)

const n = new String("Hello");
const l = new Array("Hello");
