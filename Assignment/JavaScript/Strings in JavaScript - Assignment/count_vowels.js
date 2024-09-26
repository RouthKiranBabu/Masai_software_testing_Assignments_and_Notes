let s = "The quick brown fox jumps over the lazy dog.";

let c = 0;
for(let i = 0; i < s.length ; i ++){
    if (s.charCodeAt(i) == 97 || s.charCodeAt(i) == 101 || s.charCodeAt(i) == 105 || s.charCodeAt(i) == 111 || s.charCodeAt(i) == 117){
        c += 1;
    }
}
console.log("Count:", c);