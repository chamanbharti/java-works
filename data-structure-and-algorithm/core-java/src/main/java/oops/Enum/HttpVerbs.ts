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

enum HttpVerbs{
    GET,
    POST = 0,
    PUT
}
console.log(`PUT=${HttpVerbs.PUT}`);//1