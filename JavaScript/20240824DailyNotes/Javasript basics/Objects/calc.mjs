import Calculator from "./class.mjs"; // import the class
// import  module from path
let result= new Calculator(2,3);// new object/instance  will created and this will get defined // then the constructor will get called by default  
let result2= new Calculator(5,6);
console.log(result.add());// i need to call the add i need call the divide
console.log(result2.add());

// class is nothing but a template or blueprint of my object

// example
// abstraction only necessary things are accessible by the user or anyone
// rest of the code complexity I am hiding it
// Through export we will be able to send the access to use the method or class in altogether a new file
// import will access the exported method or class into the new file 