// For travelling we need visa and passport 
// you_have_visa = false 
// you_have_passport = true 
// if (you_have_passport && you_have_visa){
//     console.log('You are eligible.');
// }else if (you_have_visa && !you_have_passport){
//     console.log('You need to have passport!');
// }else if (you_have_passport && !you_have_visa){
//     console.log("You need to have visa.");
// }else if (!you_have_passport && !you_have_visa){
//     console.log("You need to have both visa and passport.");
// }

// Switch statement
// let day = 'a';
// switch(day){
//     case 1: 
//     console.log("Sunday");
//     break;
//     case 2:
//         console.log("Monday");
//         break;
//     case 3:
//         console.log("Tuesday");
//         break;
//     case 4:
//         console.log("Wednesday");
//         break;
//     case 5:
//         console.log("Thrusday");
//         break;
//     case 6:
//         console.log("Friday");
//         break;
//     case 7:
//         console.log("Saturday");
//         break;
//     default:
//         console.log("Invalid day number");
// }

// Ternary operator
// let age = 18
// let canvote = age >= 18 ? "Yes" : "No";
// console.log(canvote);
// let canvoten = age >= 18 ? console.log("You can vote") : console.log("You can't vote");
// console.log("Console retured value: " + canvoten);

// let n = 10;
// let res = "";
// let sum = 0;
// while(n >= 1){
//     res += n + " ";
//     sum += n;
//     n --;
// }
// console.log(res + "0");
// console.log("Sum: " + sum);

// Formatting
// let fruit = "Banana";
// let strf = "Fruit: ";
// console.log(strf + fruit);
// console.log(`Formating: Fruit-> ${fruit}.`);

// Using prompt:
// let input = prompt("Write the input!");
// document.write(input);
// console.write(typeof(input));

// let index = 1;
// let ends = 10;
// while (index <= 10){
//     if (index % 2 != 0){
//         index += 1;
//         continue;
//     }
//     console.log(index);
//     index += 1;
// }

// If condition is initially true that it print from 1 to 11
// if condition is initially false then it only prints 1
// condition = false;
// i = 1;
// do{
//     if (i % 2 == 0){i += 1;continue;}
//     else{console.log(i);i ++;}
//     if (i > 10){
//         condition = false;
//     }
// }while(condition == true);

// let arr = [1, 2, 3, 4, "test", 12.23, true];
// for(var i = 0; i <= 10; i ++){
//     console.log(`Index: ${i}, Value: ${arr[i]}.`);
// }

// arr = [1, 2, 3, 4, "test", 12.23, true];
// console.log(`Length of [${arr}] is ${arr.length}.`);
// console.log(`Index of ${true} is ${arr.indexOf(true)}.`)
// for(var i = 0; i <= arr.length; i += 2){
//     console.log(`Array[${i}] = ${arr[i]}.`);
// }

// for (var i = 5; i > -1; i--){
//     console.log(`Value: ${i}.`);
// }

// let arr = [true, false, "how are you"];
// arr.forEach((value, index)=>{
//     console.log(`Value: ${value}, at index: ${index}.`);
//     if(typeof(value) == 'string'){
//         console.log(`Length of the [${value}] is ${value.length}.`);
//     }
// });

// arr = [32, 12, 3, 65]
// let val = 0
// for (var i = 0; i < arr.length; i ++){
//     if (arr[i] > val){
//         val = arr[i];
//     }
// }
// console.log(val)

// Output is -1 if element doesnot exist
// arr = [1, 2]
// console.log(arr.indexOf(4))

// return array values
// let arr = [1, 4, 3, "stringvalue", true]
// for(let element of arr){
//     console.log(element);
// }

// return array index
// for(let element in arr){
//     console.log(element);
// }

// string = "This is a sentence."
// newstr = ""
// for(let i = string.length - 1; i > - 1; i--){
//     newstr += string[i]
// }
// console.log(newstr)

// for (let i = 2; i <= 10; i ++){
//     console.log(`**************************\nTable for ${i}:`)
//     for(let j = 1; j <= 10; j ++){
//         console.log(`${i} * ${j} = ${i * j}`);
//     }
// }

// for (let i = 1; i <= 10; i++){
//     str = "";
//     for (let j = 1; j <= 3; j ++){
//         str += `${j} * ${i} = ${i * j}\t\t`;
//     }
//     console.log(str);
// }

// function isprime(n){
//     if (n == 0 || n == 1){
//         return false;
//     }
//     for (let i = 2; i < n; i ++){
//         if (n % i == 0){
//             return false;
//         }
//     }
//     return true;
// }

// function primeinrange(st, e){
//     if (st > e){
//         return -1;
//     }
//     let s = "";
//     for (let i  = st; i <= e; i ++){
//         if (isprime(i)){
//             s += i + " ";
//         }
//     }
//     return s;
// }
// let start = 0;
// let end = 50;
// console.log(primeinrange(start, end))

// Assuming there's an element with id="output"
// document.getElementById("output").textContent = "Hello, World!";

// const arr = new Array(2, "fruit", 3.45)
// console.log(arr)
// // adding element to the last of the list
// arr.push(23)
// // adding element to the first of the list
// arr.unshift(32)
// // for checking
// console.log(arr)
// // removing the first element and saving it
// const fe = arr.shift()
// // removing the last element and saving it
// const le = arr.pop()
// // for checking
// console.log(`first e: ${fe}, last e: ${le}, new array: [${arr}].`)

// let arr = [1, 2, 3, 4, 5, 6, 7, 8]
// // filter to create array having even numbers
// const earr = arr.filter(num => num % 2 == 0)
// // to find the first even number
// const firste = arr.find(num => num % 2 == 0)
// const firstea = earr.find(num => num % 2 == 0)
// console.log(`First even: ${firste}, First even: ${firstea}.`)

// let arr = ['banana', 'apple', 'chery', 'pineapple', 'Guava', 'guava']
// arr.sort()
// console.log(arr)

// // to get all the element of the list
// let arr = ['first', 1, 1.0, true]
// arr.forEach(element => {
//     console.log(element)
// });

// // Making elements to the uppercase
// let fruits = ['apple', 'banana', 'cherry']
// const upper = fruits.map(element => element.toUpperCase())
// console.log(upper)

// // to get the sum
// let arr = [1, 2, 3, 4]
// const sum = arr.reduce((first, current) => first + current, 0)
// console.log(sum)

// // creating multi dimentional array
// let arr = [[3, 2, 43], [5, 6, 45], [7, 6, 45]]
// console.log(arr[1][2])


