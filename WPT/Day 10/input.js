let a=process.argv[2];
let b=parseInt(a);
try{
if(b>0&&b<6){
for(let i=0;i<3;i++)
{
    let stars ="";
    for(let j=3;j>i;j--)
    {
        stars+="*";
    }
    
    console.log(stars);
}
}else{
    
}
}
catch(error){
   throw "please enter value between 1 to 5";
}
