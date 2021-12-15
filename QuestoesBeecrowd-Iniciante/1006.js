let a = 2 * parseFloat(lines.shift());
let b = 3 * parseFloat(lines.shift());
let c = 5 * parseFloat(lines.shift());

console.log(media(a, b, c));

function media(a, b) {
  let res = (a + b + c) / 10;
  let res2 = res.toFixed(1);

  return `MEDIA = ${res2}`;
}

