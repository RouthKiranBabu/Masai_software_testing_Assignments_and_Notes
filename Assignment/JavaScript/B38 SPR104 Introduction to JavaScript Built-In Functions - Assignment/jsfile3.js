let c = true;
while(c){
    let ph = prompt("Enter your Phone Number?");
    let n = !isNaN(ph) && parseInt(ph);
    if (n){
        console.log("Phone number accepted.");
        c = false;
    }else{
        alert("Please enter a valid phone number.");

    }
}
