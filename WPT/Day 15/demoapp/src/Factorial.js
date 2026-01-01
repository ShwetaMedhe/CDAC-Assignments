import React, { useState } from 'react';

export default function Factorial() {
  const [number, setNumber] = useState(5);

  const calculateFactorial = (n) => {
    if (n < 0) return 'undefined';
    let result = 1;
    for (let i = 1; i <= n; i++) {
      result *= i;
    }
    return result;
  };

  return (
    <div>
      <h3>Factorial Calculator</h3>
      <input
        type="number"
        value={number}
        onChange={(e) => setNumber(Number(e.target.value))}
      />
      <p>Factorial of {number} is: {calculateFactorial(number)}</p>
    </div>
  );
}
