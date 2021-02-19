// enum HttpVerbs{
//     GET = 105,
//     POST,
//     PUT
// }
//console.log(`POST=${HttpVerbs.POST}`);//106
// enum HttpVerbs{
//     GET = 1,
//     POST = 0,
//     PUT
// }
// console.log(`PUT=${HttpVerbs.PUT}`);//1
var HttpVerbs;
(function (HttpVerbs) {
    HttpVerbs[HttpVerbs["GET"] = 0] = "GET";
    HttpVerbs[HttpVerbs["POST"] = 0] = "POST";
    HttpVerbs[HttpVerbs["PUT"] = 1] = "PUT";
})(HttpVerbs || (HttpVerbs = {}));
console.log("PUT=" + HttpVerbs.PUT); //1
