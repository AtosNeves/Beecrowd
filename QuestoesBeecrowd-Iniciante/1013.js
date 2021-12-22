var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let a = Number(linha.shift());
let b = Number(linha.shift());
let c = Number(linha.shift());

let maior = abs(a, b);
maior = abs(maior, c);

console.log(`${maior} eh o maior`);

function abs(a, b) {
  return  (a + b + Math.abs(a - b)) / 2;
}
