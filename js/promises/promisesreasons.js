const cart = ["shoes", "pants", "kurtas"];

createOrder(cart); // returns orderId

proceedToPayment(orderId);

//this code is asyncronous but the issue here is you cant
//control the flow because if the user takes too much 
//time to create order your code fails cause next function
//is depended on it

//it can  be resolved by using callbacks like..

createOrder(cart,
    function (orderId) {
        proceedToPayment(orderId);
    }
);

//but the issue here is inversion of control we gave whole
//control to create order api that at somepoint the createOrder
//api will call our function and we sit casually that is
//dangerous cause we lose control in this way  

//we can solve it through promises like..
const promise = createOrder(cart);

promise.then(function (orderId){
    proceedToPayment(orderId);
});