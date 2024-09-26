function sumArray(arr){
    let r = 0;
    for(let i = 0; i < arr.length; i ++){
        r += arr[i];
    }
    return r;
}

let a = [3, 2, 5];
console.log(sumArray(a));

let b = [4, -1, 0];
console.log(sumArray(b));