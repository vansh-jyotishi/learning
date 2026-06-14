const jokeAPI = "https://official-joke-api.appspot.com/random_joke";
const user  = fetch(jokeAPI);
user.then(function(data){
    console.log(data);
});
console.log(user);

//here fetch returns a promise which is when
//  resolved can be used for ista result like 
// shown with the ex of data..

user.then(function(data){
    console.log(data);
});
setTimeout(()=>{
    console.log(user)
},1000)
//finally,promise is an object which represents
// eventual completion of an asyncronous operation