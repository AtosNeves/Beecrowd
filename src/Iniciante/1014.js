var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

var distanciaPercorrida = Number(lines.shift());
var consumoDeCombustivel = parseFloat(lines.shift());

console.log(`${media(distanciaPercorrida, consumoDeCombustivel)} km/l`);

function media(distanciaPercorrida, consumoDeCombustivel) {
  return (distanciaPercorrida / consumoDeCombustivel).toFixed(3);
}

