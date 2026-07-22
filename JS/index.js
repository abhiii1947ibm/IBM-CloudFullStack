// console.log("Hi there");


// let l = 5;
// var v = 6;
// {
//     l = 10;
//     v = 20;
//     console.log(l);
//     console.log(v);
// }
// console.log(l);
// console.log(v);


// let arr = [1, "abhi", true, undefined, null, 90]

// var a = arr.indexOf(undefined);
// console.log(a);


// function sum(a, b){
//     return a+b;
// }

// var a = sum(2,3);

// let z = (a,b) => 2+3;
// console.log(z(2,3));


let cal = {
    sum: (a,b) => a+b,
    sub: (a,b) => a-b,
    mul: (a,b) => a*b,
    div: (a,b) => a/b
}

// console.log(cal.mul(5,7));


let arr = [1, "abhi", true, undefined, null, 90]
arr.filter(e => e % 2 == 0).forEach(e =>console.log(e));
console.log(null/2);


