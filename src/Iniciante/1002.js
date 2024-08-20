var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");

const pi = 3.14159;
let a = lines.shift();
const b = pi * a * a;
let saida = b.toFixed(4);
console.log("A=" + saida);

