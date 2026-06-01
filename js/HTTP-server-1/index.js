const express = require("express")
const port = 3000;
const application = express();
application.get('/iseligibletovote',(req,res)=>{
    let age = req.query.age;
    if(age>=18){
        res.send(`you are eligible to vote cause you are ${age} years old`)
    }else{
        res.send(`you are not eligible to vote cause you are ${age} years old`)
    }
    

})

application.listen(port, function(){
    console.log(`example app listening on port ${port}`);
    
})