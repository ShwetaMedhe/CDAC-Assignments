import React, { useState, useEffect } from 'react';

function Lifecycle() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    console.log(`useEffect: Count is now ${count}`);
    document.title = `You clicked ${count} times`;
    
    return () => {
      console.log(`Cleanup: Preparing for next run (Current count was ${count})`);
    };
  }, [count]);

  useEffect(() => {
    console.log('Component Mounted: Setting up initial configuration.');
  }, []);


  return (
    <div>
      <h1>Functional Counter Lifecycle </h1>
      <p>The current count is: <strong>{count}</strong></p>
      
      <button onClick={() => setCount(prevCount => prevCount + 1)}>
        Increment Count
      </button>
      
    </div>
  );
}

export default Lifecycle;