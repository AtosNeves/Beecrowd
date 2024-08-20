var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let tempo = lines.shift();

console.log(`${tempo*2} minutos`);
