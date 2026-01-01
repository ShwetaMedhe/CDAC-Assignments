const http = require ('http');
const server = http.createServer((req,res)=>{
    res.writeHead
    (200,{'content-type':'text/html'})
    res.end("Hello, from Node JS server\n")
});
server.listen(8080);
