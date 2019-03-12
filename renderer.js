// This file is required by the index.html file and will
// be executed in the renderer process for that window.
// All of the Node.js APIs are available in this process.

const sqlite3 = require('sqlite3').verbose();
const db = new sqlite3.Database('sqlite3.db');

const query = `SELECT * from primes`;
 db.all(query, [], (err,rows)=>{
   if(err) {  
    throw err;
   }
   const tableauPrimes = document.querySelector('.primes'); 
   rows.forEach((row) => {
     tableauPrimes.innerHTML+= `<tr> <td>${row.nom}</td> <td>${row.prix_ducats}</td> </tr>`;
   });

 });

db.close();