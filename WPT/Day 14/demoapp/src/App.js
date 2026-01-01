import React from 'react';
import './App.css';
import Calulator from './Calculation'; 
function App() {
    return (
        <div className="App">
            <h1>Main App Component Demo</h1>
            <p>This component renders the Calulator:</p>
            { }
            <Calulator num1="12" num2="23" />
        </div>
    );
}

export default App;