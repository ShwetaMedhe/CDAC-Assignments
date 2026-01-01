const nums = process.argv.slice(2).map(Number);

if (nums.length !== 10) {
  console.log("Please enter exactly 10 numbers");
  process.exit(1);
}

function isPrime(n) {
  if (n <= 1) return false;
  for (let i = 2; i < n; i++) {
    if (n % i === 0) return false;
  }
  return true;
}

let evenSum = 0;
let evenIndexSum = 0;
let primeSum = 0;

for (let i = 0; i < nums.length; i++) {
  if (nums[i] % 2 === 0)
     evenSum += nums[i];
  if (i % 2 === 0) 
    evenIndexSum += nums[i];
  if (isPrime(nums[i])) 
    primeSum += nums[i];
}

console.log("Addition of even numbers:", evenSum);
console.log("Addition of numbers at even indices:", evenIndexSum);
console.log("Addition of prime numbers:", primeSum);
