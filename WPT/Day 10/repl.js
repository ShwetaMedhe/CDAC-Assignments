// 5)  USINF REPL concept 

//     write function which has for loop to display 
// 	current date -  dd-mm-yyyy format 
// 	then save that script in myDate.js file 
function showDate() {
  let today = new Date();
  let day = today.getDate();
  let month = today.getMonth() + 1;
  let year = today.getFullYear();
  if (day < 10) day = '0' + day;
  if (month < 10) month = '0' + month;
  let date = day + '-' + month + '-' + year;
  for (let i = 0; i < 5; i++) {
    console.log(date);
  }
}

showDate();
