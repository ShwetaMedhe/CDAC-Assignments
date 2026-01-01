const http = require('http');
const url = require('url');

const server = http.createServer((request, response) => {
  const parsedUrl = url.parse(request.url, true);
  const query = parsedUrl.query; // { fName: 'ABC', lName: 'XYZ' }

  response.writeHead(200, { 'Content-Type': 'text/html' });

  if (query.fName) {
    response.write(`<h1>Hello ${query.fName}</h1>`);
  } else {
    response.write('<h1>Hello Guest</h1>');
  }

  response.end();
});

server.listen(3000, () => {
  console.log('Server running at http://localhost:3000');
});

