import React from 'react';
import CaseConverter from './CaseConverter'; 

// Renamed the function to App1 for consistency
export default function App1() {
    return (
        <div style={{ padding: '20px', textAlign: 'center' }}>
            <h2>React Case Converter Demo</h2>
            <p>Type text and click a button to see the result below.</p>
            <CaseConverter />
        </div>
    );
}