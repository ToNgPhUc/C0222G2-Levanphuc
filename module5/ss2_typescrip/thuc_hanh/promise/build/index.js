"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
let money = 10000;
const buyACar = (car) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (money > 10000) {
                resolve("Can buy " + car);
            }
            else {
                reject("Do not enough money");
            }
        }, 100);
    });
};
money = 1000;
const promise = buyACar("Vinfast").then(value => {
    console.log(value);
}, error => {
    console.log(error);
});
// let result = buyAcar("car").then(value => {
//     console.log(value)
// }, error => {
//     console.log(error)
// } )
