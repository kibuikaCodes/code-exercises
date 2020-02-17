// function that takes in an integer, converts it to binary and counts the 1s.

var countBits = function(n) {
  var bin = n.toString(2);
  var arr = (""+bin).split("").map(Number);
  var vcount = 0;
  for (var i=0; i<arr.length; i++){
    if (arr[i] === 1 ){
      vcount += 1;
    }
  }
  return vcount;
};

console.log(countBits(7623176162));


// The simplified version

function countBits(n) {
    for(c=0;n;n>>=1)c+=n&1
    return c;
  }

  console.log(countBits(782742861));


  // another one
  countBits = n => n.toString(2).split('0').join('').length;