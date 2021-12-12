var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
    
var a = parseInt(lines.shift());
var b = parseInt(lines.shift());
  var res = sum(a,b); 
console.log('X = ' + res);
function sum(a,b){
    
    return a+b;
}
