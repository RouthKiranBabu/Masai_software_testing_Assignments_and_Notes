// // // object its a non primitive data type in javascript 
// // // object is nothing and object can have properties-value and methods-function
// // // let arr=[1,2,3,4];
// // // object can possess properties and methods 
// // // object literals  let obj= {}
// // // encapsulation encapsulated it inside an object 
// let myObj= {
//     num1:1,
//     num2:2,
//     add: function(){
//         return this.num1+ this.num2
//     },
//     // printThis: function(){ // show the application of the this keyword
//     //     return this;
//     // }
// }
// // abstraction will provide developer a security 
// // normal user is not able to see everything 
// // it will provide the user simplicity 
// // // console.log(myObj.add(1,2));
// // // console.log(myObj.printThis());
// // // this is a keyword in the javascript 
// // // this is used to set up context of object 
// // // this keyword is a reference to the object
// // // this keyword is setting up a reference to the current object 

// let employee= {
//     salary:25000,
//     overtime:5,
//     ratePerovertime:500,
//     calcualteTotalSalary: function (){
//         return this.salary + (this.overtime * this.ratePerovertime)// particular variables are not storing the correct value 
//         // not a number error 
//         // the arrow function does not have the this reference 
//         // if i am declaring a method inside an object i will go with the normal function 
//         // declaration or the anonymous function-nameless
//     }
// }


// console.log(employee.calcualteTotalSalary());

// create a book object 
// give it the properties of author, name, price , quantity
// you need to pass a method of total price which will be nothing but price*quantity

// constructor function 
// constructor function are nothing but the functions used to create an instance 
// instance -->object
// naming convention --> You should declare a constructor with a capital letter
// function Cars(name, model , color){ // its a constructor
//     this.name= name, // this.name is the variable of this function 
//     // name itself is the parameter 
//     this.model= model, 
//     this.color=color
//     return this.name
// }

// let myOldCar = new Cars("Alto", "2010","red"); // it will define the this reference 
// let myNewCar= new Cars("Merc", "2016", "white")
// let myCar= new Cars("Honda","2018", "red");

// let myArr= new Array('1','3','4')// a in built inside the javascript // it will have all the properties of the array
// let string= new String("hello") // i am starting an instance of the String class  its js library 
// this will have properties and methos of the sting

// i intiated an instance or an object by using an constructor
// new keyword is used to create a new instance

// try to initialize the book object with the constructor


// class
//class in known as the template , blueprint to create on object

// let str= "123abc";
// console.log(Number(str)); //number
// it will throw me an error the particular string it not a number 
//console.log(parseInt(str)); 
// both answer are correct 
// but the more preferred will be parseInt()
// parseInt 
// that hey create a book store 
// which has property of price quantity author and etc 
// and it should have methods like orderBook() sellBook() calculateQuant()
// you need initialize multiple instances of the samething 

// page object model in the testing framework 

// spread operartor spreads the value of an array 
// ...nameOFthearray
// let arr= [1,2,3]
// console.log(Math.min(...arr));
// // when i will spread it, it will give me the type of the whole array 
// // in the javascript arrays are nothing but special type of objects
// console.log(typeof[...arr])// arrays are special types of object in javascipt
let arr= [1,2,3]
let arr2= [4,5,6]
let arr3= [...arr, ...arr2]
console.log(arr3);
// function addThree(a,b,c ){
//     return a+b+c
// }
// console.log(addThree(...arr))

// let obj2 = {
//     name2:"Vishal",
//     age2:"23", 
//     city2:"Dehli"
// }
//console.log(...obj)// i cant direcly call the spread operator on a object
// let copyObject ={ ...obj}
// // console.log(copyObject);
// let mergeObject ={ ...obj , ...obj2}
// // if there are same properties so then it will switch all th values with the merge object 
// console.log(mergeObject);
