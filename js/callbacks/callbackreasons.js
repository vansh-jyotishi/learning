
// normal code{synchronous}...

//     
// function checkInventory() {
//     console.log("checking the inventory...");
// }
// function createOrder() {
//     console.log("creating the order...");
// }
// function chargePayment() {
//     console.log("chatrging the payment...");
// }
// function sendInvoice() {
//     console.log("sending the invoice...");
// }
// function main(){
//     checkInventory();
//     createOrder();
//     chargePayment();
//     sendInvoice();
// }

// main();


//output 
// checking the inventory...
// creating the order...
// chatrging the payment...
// sending the invoice...

//this code runs sequentially no order is disturbed the functions are called and executed 
// on the main thread  and the application can freeze at that point and no other funnctions will run.

//Asyncronous code...
//
function checkInventory() {
    setTimeout(() => {
        console.log("checking the inventory...");
    }, 2000);

}
function createOrder() {
    setTimeout(() => {
        console.log("creating the order...");
    }, 1000);

}
function chargePayment() {
    setTimeout(() => {
        console.log("chatrging the payment...");
    }, 3000);

}
function sum (n){
    let sum = 0;
    for(let i = 0;i<n;i++){
        sum = sum+i;
    }
    return sum;
}
function sendInvoice() {
    setTimeout(() => {
        console.log("sending the invoice...");
    }, 1000);

}
function main() {
    checkInventory();
    createOrder();
    chargePayment();
    console.log(sum(100000000000));
    sendInvoice();
}

main();
//in this code the code runs asynchronously the orders is altered according to our need and the functions wait in queue until the main thread is stopped