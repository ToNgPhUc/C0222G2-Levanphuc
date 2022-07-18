// happy coding 👻
let x = 0;
let y = 1;
let z = x + y;
let sum = z;
console.log(x)
console.log(y)
for (let i = 0; i < 10; i++) {
    console.log(z)
    x = y;
    y = z;
    z = x + y;
    sum += z;
}
console.log('tổng các số fibonaci là: '+sum);
