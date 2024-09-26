// 2.
var arr = [5, 3, 8, 1, 2];
let max = 0;
let min = arr[0];
// to find the maximum number
for(let i = 0; i < arr.length; i ++){
    if (arr[i] > max){
        max = arr[i];
    }
}
// To find the minimum value
for(let i = 0; i < arr.length; i ++){
    if (arr[i] < min){
        min = arr[i];
    }
}
console.log(`\nIn the array: [${arr}]:\nMinimum value: ${min}.\nMaximum value: ${max}.\n`);
