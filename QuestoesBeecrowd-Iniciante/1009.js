var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let name = String(lines.shift());
let salarioFixo = Number(lines.shift());
let vendas = Number(lines.shift());

console.log(`TOTAL = R$ ${resultado(salarioFixo,vendas)}`)


function resultado(salario, vendas) {
  let valorFinal = vendas * 0.15 + salario;
  let final = valorFinal.toFixed(2);
  return final;
}

