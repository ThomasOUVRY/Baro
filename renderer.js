// This file is required by the index.html file and will
// be executed in the renderer process for that window.
// All of the Node.js APIs are available in this process.

// DATABASES MODULES
const sqlite3 = require('sqlite3').verbose();
const dbPrimes = new sqlite3.Database('sqlite3.db');
const dbBaro = new sqlite3.Database('sqlite3B.db');

// On cherche le nombre d'items pour le champ size de la balise select
const queryNbItemsBaro = `SELECT * from baroItems`;
let nbItemsBaro;
const selectBaliseBaro = document.querySelector('.baroList');
console.log(selectBaliseBaro);

dbBaro.all(queryNbItemsBaro, [], (err, rows) => {
  if (err) {
    throw err;
  }
  nbItemsBaro = rows.length;
  // Debut balise SELECT BARO
  let html = `<select name="listBaro" size="50" multiple>`;
  rows.forEach((row) => {
    html += `<option value="${row.nom}">${row.nom} ${row.prix_ducats} </option>`;
  });
  html += `</select>`;
  selectBaliseBaro.innerHTML = html;
});

dbPrimes.close();
dbBaro.close();