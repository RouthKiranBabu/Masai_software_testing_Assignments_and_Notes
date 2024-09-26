let string = "hello";
let r = "";

for(let i = string.length - 1; i > -1 ; i --){
    r += string.at(i);
}

console.log(r); // olleh