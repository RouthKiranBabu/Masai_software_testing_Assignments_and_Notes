for(let i = 1; i <= 10; i++){
    let [row, j, condition] = ["", 1, false]
    while(j <= i){
        if (j % 7 == 0) break
        if (j % 3 == 0){
            j += 1
            condition = true
            continue
        }else{ condition = false }
        row += new String(j) + " "
        j += 1
    }
    if (!condition)console.log(row)
}
/*Output
1 
1 2 
1 2 4 
1 2 4 5 */