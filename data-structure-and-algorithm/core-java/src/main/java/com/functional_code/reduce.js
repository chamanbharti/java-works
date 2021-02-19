var sum = [0,1,2,3,4].reduce(function(preVal, currentVal, index, array){
    return preVal + currentVal;
});
console.log(sum);//10

var sum2 = [0,1,2,3,4].reduce(function(preVal, currentVal, index, array){
    return preVal + currentVal;
}, 1);
console.log(sum2);//11