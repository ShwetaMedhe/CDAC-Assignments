import React, { useState } from 'react';

function Counter_usestate() {
  const [count, setCount] = useState(0);

  const handleIncrement = () => {
    setCount(prevCount => prevCount + 1);
  };

  return (
    <div>
      <h1>Counter</h1>
      
      <p>Current Count: <strong>{count}</strong></p>
      
      <button onClick={handleIncrement}>
        Count 
      </button>
    </div>
  );
}

export default Counter_usestate;