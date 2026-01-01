
function add(...a) {
   
    let sum = 0;
    
    for (let i = 0; i < a.length; i++) {
        sum += a[i];
        if(a[i]%2!=0)
        {
            console.log("Odd numbers "+a[i])
        }
    }
    const max=Math.max(...a);

    console.log("Addition of " + (a.length) + " numbers = " + sum);
    console.log("Maximum "+max);

}

add(12, 23, 34);
add(1, 2);
add(18, 20, 33);
