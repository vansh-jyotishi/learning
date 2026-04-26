const express = require("express")
const port = 3000;
const application = express();
application.get('/',function(req,res){
    res.send('Hello World  :)  !!!')
})

application.listen(port, function(){
    console.log(`example app listening on port ${port}`);
    
})