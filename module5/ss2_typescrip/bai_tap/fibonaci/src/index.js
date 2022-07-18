// happy coding 👻
var x = 0;
var y = 1;
var z = x + y;
var sum = z;
console.log(x);
console.log(y);
for (var i = 2; i < 10; i++) {
    console.log(z);
    x = y;
    y = z;
    z = x + y;
    sum += z;
}
console.log('tổng các số fibonaci là: ' + sum);
