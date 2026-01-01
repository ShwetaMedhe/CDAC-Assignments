

import React from 'react';

export default function Calulator({ num1, num2 }) {

    const n1 = parseFloat(num1);
    const n2 = parseFloat(num2);

    const divisionResult = n2 === 0 ? "Error: Divide by Zero" : n1 / n2;

    return (
        <div >
            <h3>Basic Calculator</h3>
            <p>Numbers: {n1} and {n2}</p>
            
                <p>Addition: {n1 + n2} </p>
                <p>Subtraction: {n1 - n2} </p>
                <p>Multiplication: {n1 * n2} </p>
                <p>Division: {divisionResult} </p>
            
        </div>
    );
}