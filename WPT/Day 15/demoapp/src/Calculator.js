import React, { useState } from 'react';

export default function Calculator() {
  const [num1, setNum1] = useState(10);
  const [num2, setNum2] = useState(5);
  const [operation, setOperation] = useState('add');

  const calculate = () => {
    switch (operation) {
      case 'add': return num1 + num2;
      case 'subtract': return num1 - num2;
      case 'multiply': return num1 * num2;
      case 'divide': return num2 !== 0 ? (num1 / num2).toFixed(2) : 'Error';
      default: return 'Invalid';
    }
  };

  return (
    <div>
      <h3>Calculator</h3>
      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(Number(e.target.value))}
        placeholder="Num1"
      />
      <input
        type="number"
        value={num2}
        onChange={(e) => setNum2(Number(e.target.value))}
        placeholder="Num2"
      />
      <select value={operation} onChange={(e) => setOperation(e.target.value)}>
        <option value="add">Add</option>
        <option value="subtract">Subtract</option>
        <option value="multiply">Multiply</option>
        <option value="divide">Divide</option>
      </select>
      <p>Result: {calculate()}</p>
    </div>
  );
}
