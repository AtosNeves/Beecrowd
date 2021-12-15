var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let a = Number(lines.shift());
let b = Number(lines.shift());
let c = Number(lines.shift());
let d = Number(lines.shift());
let res =pa(a, b) - pc(c, d);
console.log(`DIFERENCA = ${res}`);

function pa(a, b) {
  return a * b;
}
function pc(c, d) {
  return c * d;
}

