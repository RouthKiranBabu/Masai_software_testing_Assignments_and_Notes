let [arr, str] = [[], ""]
for(let i = 1; i <= 5; i++){
    arr.push(i)
    str = arr.join(" ")
    console.log(str)
}
/*Output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/