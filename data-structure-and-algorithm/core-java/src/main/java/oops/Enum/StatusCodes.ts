// enum StatusCodes {
//     NOTFOUND = 404,
//     NOTMODIFIED = 304,
//     OK = 200,
//     NOTCONTENT = 204
// }
// console.log(`Not Found Code is ${StatusCodes.NOTFOUND}`);

// enum StatusCodes {
//     NOTFOUND = "NOTFOUND",
//     OK = "OK",
//   //  METHOD//invalid 
// }
// console.log(`Not Found Code is ${StatusCodes.NOTFOUND}`);

enum StatusCodes {
    CANCEL,
    NOTFOUND = "NOTFOUND",
    YES = "yes",
    NO = 0,
    UNKNOWN
  //  METHOD//invalid 
}
console.log(`CANCEL is ${StatusCodes.CANCEL}\nYES:${StatusCodes.YES} \nNO:${StatusCodes.NO} \nUNKNOWN:${StatusCodes.UNKNOWN}`);