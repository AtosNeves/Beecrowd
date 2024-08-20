var input = require("fs").readFileSync("/dev/stdin", "utf8");
var lines = input.split("\n");


let infoItem1 = lines.shift().split(" ");
let infoItem2 = lines.shift().split(" ");

let codigoItem1 = infoItem1.shift();
let quantidadeItem1 = infoItem1.shift();
let precoItem1 = infoItem1.shift();

let codigoItem2 = infoItem2.shift();
let quantidadeItem2 = infoItem2.shift();
let precoItem2 = infoItem2.shift();

console.log(`VALOR A PAGAR: R$ ${resultado(quantidadeItem1, precoItem1, quantidadeItem2,precoItem2)}`);

function resultado(numeroPeças1, precoItem1, numeroPeças2, precoItem2) {
  let valor1 = numeroPeças1 * precoItem1;
  let valor2 = numeroPeças2 * precoItem2;
  let final2 = (valor1 + valor2).toFixed(2);
  return final2;
}

