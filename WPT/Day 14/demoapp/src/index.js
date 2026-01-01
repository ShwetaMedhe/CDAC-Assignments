import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App'; 
import Factorial from './Factorial'; 
import reportWebVitals from './reportWebVitals';
import App1 from "./app1.js";
const root = ReactDOM.createRoot(
    document.getElementById('root')
);

root.render(
    <React.StrictMode>
        
        <App />

        <hr />

        
        <h2>Standalone Factorial Component</h2>
        <Factorial num1="5" />

        <hr />
        
        <h2>Event Demonstration Area</h2>
        <form>
            <input type="text" placeholder="Type something here..." />
        </form>
        <App1/>

    </React.StrictMode>
);

reportWebVitals();