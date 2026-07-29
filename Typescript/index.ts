let a: number = 70;
let b: number = 30;

console.log(a + b);

function sum(...nums: number[]): number{
    return nums.reduce((a, b) => a + b, 0);
}

console.log(sum(50,60));
