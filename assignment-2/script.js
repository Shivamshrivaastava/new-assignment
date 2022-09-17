const button = document.querySelector("button");
const sentence = document.querySelector("#sentence");
const letter = document.querySelector("#letter");
const display = document.querySelector(" h2");
button.addEventListener("click", function () {
  let myStr = sentence.value;
  let myReg = letter.value;
  let n = myStr.indexOf(myReg);
  if (n == -1) {
    display.textContent = "the letter doesnot exist in the sentence";
  } else {
    let s = myStr.slice(n + 1, myStr.length);
    display.textContent = s;
  }
});
