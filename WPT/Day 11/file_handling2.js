const fs = require('fs');

fs.readFile("Sample.txt", "utf-8", (err, data) => {
  if (err) {
    console.log("Error occurred:", err);
  } else {
    console.log(data);
  }
});
