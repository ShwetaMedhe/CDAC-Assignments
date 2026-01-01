import React, { useState, useEffect } from 'react';

function Counter() {
  const [count, setCount] = useState(0);

  useEffect(() => {
    document.title = `Count: ${count}`;
  }, [count]);

  const incrementCounter = () => {
    setCount(prevCount => prevCount + 1);
  };

  return (
    <div style={{ padding: '20px', textAlign: 'center' }}>
      <h2> React Counter</h2>

      <button onClick={incrementCounter} style={{ padding: '10px 20px', fontSize: '16px', cursor: 'pointer' }}>
         Counter: {count}
      </button>

      <table style={{ 
        border: '1px solid #000', 
        margin: '20px auto', 
        width: '300px', 
        borderCollapse: 'collapse' 
      }}>
        <thead>
          <tr style={{ backgroundColor: '#eee' }}>
            <th style={{ border: '1px solid #000', padding: '10px' }}>Metric</th>
            <th style={{ border: '1px solid #000', padding: '10px' }}>Value</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td style={{ border: '1px solid #000', padding: '10px' }}>Current Count</td>
            <td style={{ border: '1px solid #000', padding: '10px', textAlign: 'center' }}>
              <strong>{count}</strong>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default Counter;