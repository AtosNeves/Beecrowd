var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

let a = lines.shift();
let b = lines.shift();
console.log(mul(a,b));

function mul(a,b){


    return `PROD = ${a*b}`
}
