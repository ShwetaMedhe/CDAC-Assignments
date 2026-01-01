import React, { useState } from 'react';

export default function CaseConverter() {
    // State for input text
    const [text, setText] = useState('');
    // State for output display on the screen
    const [outputText, setOutputText] = useState('Output will appear here.');

    // Updates the input text state
    const handleTextChange = (event) => {
        setText(event.target.value);
    };

    // Handler for UPPER CASE button
    const handleUpperCase = () => {
        if (!text.trim()) {
            setOutputText("Please enter text first.");
            return;
        }
        const result = text.toUpperCase();
        setOutputText(result); // Display on screen
        console.log('UPPERCASE Output:', result); // Log to console
    };

    // Handler for small case button
    const handleLowerCase = () => {
        if (!text.trim()) {
            setOutputText("Please enter text first.");
            return;
        }
        const result = text.toLowerCase();
        setOutputText(result); // Display on screen
        console.log('lowercase output:', result); // Log to console
    };

    return (
        <div style={{ padding: '20px', border: '1px solid #0056b3', maxWidth: '400px', margin: '20px auto', borderRadius: '8px' }}>
            
            {/* 1. TextField */}
            <input
                type="text"
                value={text}
                onChange={handleTextChange} 
                placeholder="Enter text here..."
                style={{ width: '100%', padding: '10px', marginBottom: '15px', boxSizing: 'border-box' }}
            />
            
            {/* 2. Buttons */}
            <button
                onClick={handleUpperCase}
                style={{ padding: '10px 15px', marginRight: '10px', backgroundColor: '#28a745', color: 'white', border: 'none', cursor: 'pointer', borderRadius: '4px' }}
            >
                UPPER CASE
            </button>
            <button
                onClick={handleLowerCase}
                style={{ padding: '10px 15px', backgroundColor: '#ffc107', color: '#333', border: 'none', cursor: 'pointer', borderRadius: '4px' }}
            >
                small case
            </button>
            
            {/* 3. Output Display on Screen */}
            <div style={{ marginTop: '20px', padding: '10px', borderTop: '1px dashed #ccc' }}>
                <p>Converted Output:</p>
                <p style={{ fontWeight: 'bold', fontSize: '1.2em', wordWrap: 'break-word' }}>
                    {outputText}
                </p>
            </div>
        </div>
    );
}