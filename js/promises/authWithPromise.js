// const db = [{ userName: "hemlata", password: "12345", dob: { dd: 1, mm: "january", yy: 2001 } },
// { userName: "pushpa", password: "23456", dob: { dd: 2, mm: "january", yy: 2001 } },
// { userName: "munna", password: "34567", dob: { dd: 3, mm: "january", yy: 2001 } },
// { userName: "birjbihari", password: "45678", dob: { dd: 4, mm: "january", yy: 2001 } },
// { userName: "pappu", password: "56789", dob: { dd: 5, mm: "january", yy: 2001 } },
// { userName: "chahat", password: "67890", dob: { dd: 6, mm: "january", yy: 2001 } }
// ]

// console.log("enter username:");
// let usnm = "hemlata";
// console.log("enter password:");
// let pass = "12345";


// function getUser(username) {
//     for (let i of db) {
//         if (i.userName == username) {
//             return i;
//             break;
//         }
//     }
//     return false;
// }
// function auth(userName, Password) {
//     let user = false;
//     setTimeout((username) => {
//         for (let i of db) {
//             if (i.userName == username) {
//                 user = i;

//                 break;

//             }
//         }
//         setTimeout(() => {
//             if (user == false) {
//                 console.log("invalid username");

//             } else if (user.password == Password) {
//                 console.log("login success");

//             } else {
//                 console.log("incorrect password");

//             }
//         },0)
//     }
//         , 2000, userName);


// }
// auth(usnm, pass);

// let getUser = new Promise((resolve, reject) => {
//     let user = false;
//     setTimeout((username) => {
//         for (let i of db) {
//             if (i.userName == username) {
//                 user = i;
//                 break;
//             }
//         }
//         if (user == false) {
//             reject("user not found");
//         } else {
//             resolve(user);
//         }
//     }, 2000, usnm)
// })

// getUser.then((user) => {
//     if (user.password == pass) {
//         console.log("login succesfull ...  =)  ...");

//     } else {
//         console.log("incorrect password !!!!!!  please try again...");

//     }
// }).catch((error) => {
//     console.log(usnm + " " + error);

// })

// function auth(username, password) {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//             const user = db.find(u => u.userName === username);
//             if (!user) {
//                 reject("user not found");
//             } else if (user.password !== password) {
//                 reject("incorrect password");
//             } else {
//                 resolve(user);
//             }
//         }, 2000);
//     });
// }

// auth(usnm, pass)
//     .then((user) => {
//         console.log("login succesfull ...  =)  ... welcome " + user.userName);
//     })
//     .catch((error) => {
//         console.log(usnm + " -> " + error + " !!!!!!  please try again...");
//     });
num = -200;
const obj = new Promise((resolve,reject) => {
    setTimeout(() => {
        if (num < 0) {
            reject("num is less than zero");
        } else {
            resolve("num is greater than or equal to zero");
        }
    }, 1000)
});

obj.then((result)=>{
    console.log(result);
}).catch((result)=>{
    console.log(result);
    
})

