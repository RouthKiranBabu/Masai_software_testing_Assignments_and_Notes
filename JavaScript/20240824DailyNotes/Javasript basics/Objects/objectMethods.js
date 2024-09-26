
let obj = {
    name:"Divyang", // key: value
    age:"21", 
    city:"Banglore"
}
// adding a property to the object 
// obj["Nation"]="India"

// dot operator
// obj.state="Gujarat"
// console.log(obj)
// //  Object.freeze(obj)

// obj.state="Maharashtra"
// console.log(obj);
// // check whether a property is present or not 
// console.log("Nation" in obj) // boolean value true or false 
// console.log(obj.hasOwnProperty("Nation"))
// // delete a property
// delete obj.name
// console.log(obj)
// iterate through the properties // array  for of //object loop for in loop 
for(let key in obj){ // access the keys
    console.log(`${key}:${obj[key]}`)
    // console.log(obj[key])
}
