var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
let linha1 = lines.shift().split(" ");
let linha2 = lines.shift().split(" ");

let x1 = parseFloat(linha1.shift());
let y1 = parseFloat(linha1.shift());
let x2 = parseFloat(linha2.shift());
let y2 = parseFloat(linha2.shift());

console.log(dis(x1, y1, x2, y2));


function dis(x1, y1, x2, y2) {
  let p1 = Math.pow((x2 - x1), 2);
  let p2 = Math.pow((y2 - y1), 2);

  let distancia = Math.sqrt(p1+p2);

  return distancia.toFixed(4);


}
