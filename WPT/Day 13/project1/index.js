const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');
const app = express()
const port = 8080

// Set up the view engine and views directory
app.set('views', path.join(__dirname, 'hbs'));
app.set('view engine', 'hbs')

// Use body-parser middleware to parse form data
app.use(bodyParser.urlencoded({ extended: true }))

// Define the route for displaying the calculator form
app.get("/Calc", (req, res) => {
    res.render("Calc")
})

// Define the POST route for handling the calculation
app.post("/docalculation", (req, res) => {
    // Extract numerical inputs from the request body
    let n1 = req.body.num1
    let n2 = req.body.num2

    // Perform the calculation
    let sum = parseInt(n1) + parseInt(n2)

    // Render the calculator view with the result
    res.render("Calc", { result: sum })
})

///assignment 4
app.use((req, res, next) => {
    console.log('Time:', Date.now());

    // Correct way to add data to the request object
    req.customData = "from use"; 
    
    // Pass control to the next method
    next(); 
});

app.get("/about", (req, res) => {
    console.log('about');
    
    // Read the data from the custom property set by the middleware
    if (req.customData) {
        console.log("Data from middleware:", req.customData);
    } else {
        console.log("No data found from middleware.");
    }
    
    res.render("aboutus");
});

///////////

// Start the server
app.listen(port, () => {
    console.log(`Server listening on port ${port}`)
})