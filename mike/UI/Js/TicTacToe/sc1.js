let cp = "O";
let gameActive = true;
const jsConfetti = new JSConfetti();

console.log(jsConfetti);

function mark(id) {
  if (gameActive) {
    if (cp == "O") {
      document.getElementById(id).innerHTML = cp;
      checkWinner();
      cp = "X";
      if (gameActive) {
        document.getElementById("turn").innerHTML = "X's turn";
      } else {
        document.getElementById("turn").innerHTML = "";
      }
    } else {
      document.getElementById(id).innerHTML = cp;
      checkWinner();
      cp = "O";
      if (gameActive) {
        document.getElementById("turn").innerHTML = "O's turn";
      } else {
        document.getElementById("turn").innerHTML = "";
      }
    }
  } else {
    alert("Please restart the game");
  }
}

function checkWinner() {
  let c1 = document.getElementById("cell1").innerHTML;
  let c2 = document.getElementById("cell2").innerHTML;
  let c3 = document.getElementById("cell3").innerHTML;
  let c4 = document.getElementById("cell4").innerHTML;
  let c5 = document.getElementById("cell5").innerHTML;
  let c6 = document.getElementById("cell6").innerHTML;
  let c7 = document.getElementById("cell7").innerHTML;
  let c8 = document.getElementById("cell8").innerHTML;
  let c9 = document.getElementById("cell9").innerHTML;

  if (cp == c1 && cp == c2 && cp == c3) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c4 && cp == c5 && cp == c6) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c7 && cp == c8 && cp == c9) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c1 && cp == c4 && cp == c7) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c2 && cp == c5 && cp == c8) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c3 && cp == c6 && cp == c9) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c1 && cp == c5 && cp == c9) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (cp == c3 && cp == c5 && cp == c7) {
    document.getElementById("result").innerHTML = cp + " is the winner";
    jsConfetti.addConfetti({
      emojis: ["💫", "🌸", "💔", "💥", "💦", "💕", "💫", "🔸"],
    });
    gameActive = false;
  } else if (gameActive) {
    if (
      c1 != "" &&
      c2 != "" &&
      c3 != "" &&
      c4 != "" &&
      c5 != "" &&
      c6 != "" &&
      c7 != "" &&
      c8 != "" &&
      c9 != ""
    ) {
      document.getElementById("result").innerHTML = "Game Drawn";
      gameActive = false;
    }
  }
}

function restart() {
  window.location = "index.html";
}
