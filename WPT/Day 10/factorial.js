const { exit } = require("process");

const args = process.argv.slice(2);
const num =parseInt(args[0]);

if(isNaN(num)&& num<0){
    console.log("please provide non negative number");
    process.exit(1);
}

    function factorial(n){
        if(n===0|| n===1){
         return 1;
        }else
        return n*factorial(n-1);
    
}
console.log("factorial of :"+num+" is "+factorial(num)); 