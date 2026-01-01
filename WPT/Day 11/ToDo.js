const http = require('http');

const todos = [
  { id: 1, task: 'Read Carefully' },
  { id: 2, task: 'Implement' }
];

const server = http.createServer((req, res) => {
  const urlParts = req.url.split('/');
  
  // GET /todos -> return all todos as JSON
  if (req.method === 'GET' && req.url === '/todos') {
    res.writeHead(200, {'Content-Type': 'application/json'});
    res.end(JSON.stringify(todos));
  }
  // GET /todos/<id> -> return specific todo in HTML
  else if (req.method === 'GET' && urlParts[1] === 'todos' && urlParts[2]) {
    const id = Number(urlParts[2]);
    const todo = todos.find(t => t.id === id);

    if (todo) {
      res.writeHead(200, {'Content-Type': 'text/html'});
      res.end(`
        <h1>Todo</h1>
        <p><b>ID:</b> ${todo.id}</p>
        <p><b>Task:</b> ${todo.task}</p>
      `);
    } else {
      res.writeHead(404, {'Content-Type': 'text/html'});
      res.end('<h1>Todo not found</h1>');
    }
  }
  else {
    res.writeHead(404, {'Content-Type': 'text/plain'});
    res.end('Not Found');
  }
});

server.listen(3409, () => {
  console.log('Server running on http://localhost:3409');
});
