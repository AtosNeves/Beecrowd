var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');


let numero = Number(lines.shift());
let qHoras = Number(lines.shift());
let vHora = parseFloat((lines.shift()));
let res = qHoras*vHora;
res = res.toFixed(2);
console.log(`NUMBER = ${numero}`)
console.log(`SALARY = U$ ${res}`)

function salario(a, b) {
  return a * b;
}


