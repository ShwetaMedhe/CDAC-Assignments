function findLargest(arr) {

    arr.sort((a, b) => a - b); // Sort the array in ascending order

    return arr[arr.length - 1]; // Return the last element
}

let arr = [10, 5, 20, 8];
console.log("Largest element in the array is:", findLargest(arr));

