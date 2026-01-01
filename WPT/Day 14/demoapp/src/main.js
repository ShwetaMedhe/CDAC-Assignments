import React from 'react';
import ReactDOM from 'react-dom/client';
import App1 from './app1'; // Import your main component

// Find the root element in index.html (usually id="root")
const rootElement = document.getElementById('root');

// Render the application
ReactDOM.createRoot(rootElement).render(
    <React.StrictMode>
        <App1 />
    </React.StrictMode>
);