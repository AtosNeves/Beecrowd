var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let r = lines.shift();

console.log(`VOLUME = ${volume(r)}`);


function volume(r) {
  const pi = 3.14159;

  let v = (4 / 3) * pi * Math.pow(r, 3);

  let final = v.toFixed(3);
  return final;
}


