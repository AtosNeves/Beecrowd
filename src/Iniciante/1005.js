var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let a = 3.5 * parseFloat(lines.shift());
let b = 7.5 * parseFloat(lines.shift());
console.log(media(a, b));

function media(a, b) {
    
    let res = (a + b) / 11;
    let res2 = res.toFixed(5);
  
    return `MEDIA = ${res2}`;
}

