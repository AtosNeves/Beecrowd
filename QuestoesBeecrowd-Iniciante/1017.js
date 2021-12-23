var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let tempo = lines.shift();
let velocidade = lines.shift();

console.log(consumo(tempo, velocidade));

function consumo(tempo, velocidade) {
  let distancia = tempo * velocidade;

  let consumoCarro = distancia / 12;

  return consumoCarro.toFixed(3);
}

