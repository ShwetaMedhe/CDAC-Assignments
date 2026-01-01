const fs = require('fs');

fs.writeFileSync('sample.txt', 'Hello File');
console.log('File written synchronously');
