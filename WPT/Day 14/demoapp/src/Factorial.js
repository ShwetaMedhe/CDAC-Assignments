import React from 'react'

const calculateFactorial  = (n) =>
{
if (n<0) return "undefined";
if (n === 0) return 1;

let result =1;
for(let i =1; i<=n; i++){
 result = result*i;
}
return result;
};

export default function Factorial({num1}){
    const number = parseInt(num1,10);
    const result = calculateFactorial(number);

    return (
        <div>
            <h3>Factorial Calulator</h3>
            <p>Factorial of {number} is : {result}</p>
        </div>
    )

}