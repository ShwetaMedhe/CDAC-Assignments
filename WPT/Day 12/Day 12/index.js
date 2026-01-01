const express = require('express');
const users1 = require('./MOCK_DATA.json');
//const usersbylname = require('./MOCK_DATA.json');
const f = require('fs');
const p = require('path');
const port = 8000;
const app = express();

app.get('/',(req,res)=>{
    res.send("Hello From Express.");
});

app.get('/users',(req,res)=>{
    res.json(users1);
});

//get method
app.get('/users/:id',(req,res)=>{
    const id = Number(req.params.id);
    console.log("id")
    const user = users1.find(user=>user.id===id)
    return res.json(user);
});

//get method
app.get('/users1/:email',(req,res)=>{
    const email = req.params.email;
    console.log("email")
    const user= users1.find(user=>user.email===email) 

    return res.json(user);
});

//get method
app.get('/usersbyfname/:first_name',(req,res)=>{
    const first_name = req.params.first_name;
    console.log("first_name")
    const user= users1.find(user=>user.first_name===first_name) 

    return res.json(user);
});

//get method
app.get('/usersbylname/:last_name',(req,res)=>{
    const last_name = req.params.last_name;
    console.log("last_name")
    const user= users1.find(user=>user.last_name===last_name) 

    return res.json(user);
});

//delete method
app.delete('/users/:id',(req,res)=>{
    const id = Number(req.params.id);
    const user = users1.find(user=>user.id===id)
    return res.json(user);

});

//post method
app.use(express.urlencoded({ extended: false }))

app.post('/adduser', (req, res) => {
    const data = req.body;// 
    console.log("data " + data.email);
    users1.push(
        { data, id: users1.length + 1 });
    f.writeFile('./MOCK_DATA.json',
        JSON.stringify(users1), (err) => {
            console.log(err)
        });

    return res.json("data added ");
    });



//put method
app.put('/users/:id', (req, res) => {
    const id = Number(req.params.id);
    const updatedUserData = req.body;
    const userIndex = users1.findIndex(user => user.id === id);

    if (userIndex === -1) {
        return res.status(404).json({ error: 'User not found' });
    }
    
    users1[userIndex] = { ...users1[userIndex], ...updatedUserData };
    
    f.writeFile('./MOCK_DATA.json', JSON.stringify(users1, null, 2), (err) => {
        if (err) {
            console.error('Error writing file:', err);
            return res.status(500).json({ error: 'Failed to update user' });
        }
        return res.json({ status: 'User updated successfully' });
    });
});
    
//aboutus.html page
app.get('/usersbyabout/aboutus', (req, res) => {
    const t = p.join(__dirname, 'aboutus.html');
    console.log(t);
    res.sendFile(t);
});


app.listen(port);
console.log("From Start Script.");
