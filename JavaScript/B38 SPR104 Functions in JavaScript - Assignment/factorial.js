function factorial(n){
    let r = 1;
    for(let i = 2; i <= n; i ++){
        r *= i;
    }
    return r;
}

console.log(factorial(4)); // 24
console.log(factorial(5)); // 120
console.log(factorial(6)); // 720