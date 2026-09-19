const siswa = [
    {name: "Yuda", nilai: 85},
    {name: "Angga", nilai: 90},
    {name: "Wisnu", nilai: 0},
    {name: "Amel", nilai: 92}

];

const siswalulus =  siswa.filter(siswa => siswa.nilai >= 80);
console.log(siswalulus);
