var arr = [1, 2, 3, 4];

console.log(arr.flatMap(x => [x, x * 2]));
// is equivalent to
console.log(arr.reduce((acc, x) => acc.concat([x, x * 2]), []));
// [1, 2, 2, 4, 3, 6, 4, 8]