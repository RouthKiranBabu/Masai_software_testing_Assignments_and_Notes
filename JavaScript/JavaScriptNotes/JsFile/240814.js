/*
slice: it will take portion of the array it will generates its copy
Splice: will remove the elements from the starting index till 
the specified number of elements and can also add values

mutable and immutable in javascript:
array are mutable 
strings are immutable
whatever the operations are there which i can perform on array i 
should be able to perform on string any of the operation which is 
changing the original array i cant perform it string 

i can also perform the for loop in the string
replace on the string will create the new string

string is encoded in ascii value
it is a number assigned to every string elements which we type
charCodeAt()
*/
// changes the value
let arr = [1, 2, 3]
arr[0] = 0
console.log(arr)

// does not changes
let str = "string value"
str[0] = "S"
console.log(str)

// to get the index
console.log(str.indexOf("r"))

// to get the value of string at that index
console.log(str.charAt(2))

// changing char of the string
let newstr = str.replace("s", "S")
console.log(newstr)

// to check the type
let strn = new String("Hello")
console.log(typeof(strn)) // output: object
console.log(typeof(newstr)) // output: string

console.log(strn.lastIndexOf('l'))

let s = "newstring"
console.log(s.startsWith("n")) // true
console.log(s.endsWith('g')) // true

// string concat
let st = "Hello"
let sts = st.concat(", World!")
console.log(sts)

let s1 = "Delhi"
let s2 = `Hello, ${s1}`
console.log(s2) //Hello, Delhi

let sen = "    how are you!    "
let ssen = sen.trim()
console.log(ssen) // how are you!
let nsen = sen.trimEnd()
console.log(`"${nsen}"`) // "    how are you!"
let msen = sen.trimStart()
console.log(`"${msen}"`) // "how are you!    "

let arr1 = [1, 2, 3, 4]
let arrstr = arr1.join("")
console.log(arrstr) // 1234
let arrstr1 = arr1.join()
console.log(arrstr1) // 1,2,3,4
let arrstr2 = arr1.join(" and ")
console.log(arrstr2) // 1 and 2 and 3 and 4

let str1 = "string one two three"
let str2 = str1.split()
console.log(str2) // [ 'string one two three' ]
let str3 = str1.split("")
console.log(str3) // [
//     's', 't', 'r', 'i', 'n',
//     'g', ' ', 'o', 'n', 'e',
//     ' ', 't', 'w', 'o', ' ',
//     't', 'h', 'r', 'e', 'e'
//   ]
let str4 = str1.split(" ")
console.log(str4) // [ 'string', 'one', 'two', 'three' ]

let n = 1
let str5 = String(n)
console.log(`type of ${n} is ${typeof(str5)}`) // type of 1 is string

let str6 = "2"
let n1 = Number(str6)
console.log(n1) // 2
let str7 = "a"
let n2 = Number(str7)
console.log(n2) // NaN
let str8 = "2"
let n3 = +str8 
console.log(n3) // 2

// to get ascii code of characters
let str9 = "aAzZ09"
for (let i = 0; i < str9.length; i ++){
    console.log(str9.charCodeAt(i))
}
/*97
65
122
90
48
57*/

// to get the ascii code value
console.log(String.fromCharCode(57)) // 9

let str10 = "abc"
let str11 = str10.repeat(5)
console.log(str11) // abcabcabcabcabc

// Problem Solving
// let s1 = "a2b3c4" // output: aabbbcccc
// let s2 = "abc3d4" // output: abcabcabcdddd
// let s = s2
// let cs = ""
// let result = ""
// function isNumber(value) {
//     return !isNaN(Number(value));
// }
// for(let i = 0; i < s.length; i ++){
//     if (isNumber(s[i])){
//         result += cs.repeat(s[i])
//         cs = ""
//     }else{
//         cs += s[i]
//     }
// }
// console.log(result)