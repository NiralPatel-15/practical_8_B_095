function generatePattern() {
  const type = document.getElementById("patternType").value;
  const symbol = document.getElementById("symbol").value || "+";
  const rows = parseInt(document.getElementById("rows").value);

  let result = "";


  if (type === "left") {
    for (let i = 1; i <= rows; i++) {
      result += (symbol + " ").repeat(i) + "\n";
    }
  }

 
  else if (type === "inverted") {
    for (let i = rows; i >= 1; i--) {
      let spaces = " ".repeat(rows - i);
      let stars = (symbol + " ").repeat(i);
      result += spaces + stars + "\n";
    }
  }

  document.getElementById("output").innerText = result;
}
