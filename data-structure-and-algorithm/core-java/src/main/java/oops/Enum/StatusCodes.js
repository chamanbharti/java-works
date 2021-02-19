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
var StatusCodes;
(function (StatusCodes) {
    StatusCodes[StatusCodes["CANCEL"] = 0] = "CANCEL";
    StatusCodes["NOTFOUND"] = "NOTFOUND";
    StatusCodes["YES"] = "yes";
    StatusCodes[StatusCodes["NO"] = 0] = "NO";
    StatusCodes[StatusCodes["UNKNOWN"] = 1] = "UNKNOWN";
    //  METHOD//invalid 
})(StatusCodes || (StatusCodes = {}));
console.log("CANCEL is " + StatusCodes.CANCEL + "\nYES:" + StatusCodes.YES + " \nNO:" + StatusCodes.NO + " \nUNKNOWN:" + StatusCodes.UNKNOWN);
