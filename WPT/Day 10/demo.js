const { resolve } = require("path")

function resolvelater(callback){
  return new Promise(
    (resolve)=>{
        setInterval(()=>{
            resolve(console.log("hello world"));
        },2000)
    }
)
}
function display(){
 console.log("hello world");
}
resolvelater(display);