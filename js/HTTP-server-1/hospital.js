const express = require("express")
const hospitalApplication = express()
hospitalApplication.get('/',(req,res)=>{
 res.send('<b>hospital app par hai aap jahan logon ki kidney chori ki jati hai</b>')
})
hospitalApplication.listen(8080,()=>{
    console.log("hospital app ia running on port 8080")
})
var users =[{name:'vidhi',
    kidneys:[
        {healthy:true},
        {healthy:false},
        {healthy:true},
        {healthy:false},
        {healthy:true},
        {healthy:false},
        {healthy:true},
        {healthy:false}
    ]
}]
hospitalApplication.get('/getkidneyscount',function(req,res){
           var numberofkidney = users[0].kidneys.length;
    res.send(numberofkidney+"")
})

hospitalApplication.get('/gethealthykidneyscount',function(req,res){
           var kidneys = users[0].kidneys
           var healthykidney =0;
          for (let i=0 ;i<kidneys.length; i++){
            if (kidneys[i].healthy==true){
               healthykidney++ 
            }
          }
           res.send(healthykidney+"")

})

hospitalApplication.post('/addkidney',function(req,res){
    
})