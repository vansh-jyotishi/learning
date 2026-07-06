// const express = require('express');
// const app = express();
// const port = 3000;

// app.get('/', (req, res) => {
//   res.send('Hello World!');
// });
// app.get("/getname",(req,res)=>{
//     res.send("my name is <h1>vansh</h1>");
// })
// app.listen(port, () => {
//   console.log("Example app listening on port :"+port);
// });
const express = require('express');
const path = require('path');
const app = express();
const port = 3000;
app.use(express.static("E:/learning/express/public/"))
app.get('/', (req, res) => {
  res.send('Hello World!');
});
app.get("/getname",(req,res)=>{
    res.send("my name is <h1>vansh</h1>");
})
app.listen(port, () => {
  console.log("Example app listening on port :"+port);
});