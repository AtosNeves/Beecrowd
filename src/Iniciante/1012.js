var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let linha = lines.shift().split(" ");

let a = parseFloat(linha.shift());
let b = parseFloat(linha.shift());
let c = parseFloat(linha.shift());

console.log(`TRIANGULO: ${areaDoTrianguloRetangulo(a, c)}`);
console.log(`CIRCULO: ${areaCirculo(c)}`);
console.log(`TRAPEZIO: ${areaTrapezio(a, b, c)}`);
console.log(`QUADRADO: ${areaQuadrado(b)}`);
console.log(`RETANGULO: ${areaRetangulo(a, b)}`);
function areaDoTrianguloRetangulo(a, c) {
  let final0 = (a * c) / 2;
  let final = final0.toFixed(3);
  return final;
}

function areaCirculo(c) {
  const pi = 3.14159;
  let final0 = pi * c * c;
  let final = final0.toFixed(3);
  return final;
}

function areaTrapezio(a, b, c) {
  let area = ((a + b) * c) / 2;
  let final = area.toFixed(3);
  return final;
}

function areaQuadrado(b) {
  return Math.pow(b, 2).toFixed(3);
}

function areaRetangulo(a, b) {
  return (a * b).toFixed(3);
}

