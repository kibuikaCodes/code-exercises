function countVowels(str) {
    var vowels = 'aeiouAEIOU';
    var vcount = 0;

    for (var i=0; i<str.length; i++) {
        if (vowels.indexOf(str[i]) !== -1){
            vcount += 1;
        }
    }
    return vcount;
}
console.log(countVowels("qwertyuioasdfghjkl\zxcvbnm,"))