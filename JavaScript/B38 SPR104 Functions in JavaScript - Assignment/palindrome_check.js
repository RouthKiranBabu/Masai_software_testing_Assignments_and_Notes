function isPalindrome(s){
    let l = [];
    let r = [];
    for (let i = 0; i < s.length; i ++){
        l.push(s[i]);
    }
    for (let i = s.length - 1; i >= 0; i --){
        r.push(s[i]);
    }
    let s1 = l.join("");
    let s2 = r.join("");
    // console.log(s1, s2);
    if (s1 == s2){return true;}
    else{return false;}
}

let n = 1213; n = n.toString();
console.log(isPalindrome(n));
let n1 = 121; n1 = n1.toString();
console.log(isPalindrome(n1));
let n2 = 123421; n2 = n2.toString();
console.log(isPalindrome(n2));