
const express = require('express');
const path = require('path')
const app = express();
const port = 3000;

app.get('/', (req, res) => {
  res.sendFile('Hello World!');
});

app.use(express.static("E:/learning/express/blogexpress/static/"))

app.listen(port, () => {
  console.log("Example app listening on port :"+port);
});

