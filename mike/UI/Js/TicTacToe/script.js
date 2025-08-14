let cp = "O";
let gameActive = true;
const jsConfetti = new JSConfetti();

function mark(id) {
  if (gameActive) {
    if (cp == "O") {
      document.getElementById(id).innerHTML = cp;
      checkWinner();
      if (gameActive) {
        cp = "X";
        document.getElementById("turn").innerHTML = `${cp}'s turn now`;
      }
    } else {
      document.getElementById(id).innerHTML = cp;
      checkWinner();
      if (gameActive) {
        cp = "O";
        document.getElementById("turn").innerHTML = `${cp}'s turn now`;
      }
    }
  } else {
    alert("restart the game");
    let btn = document.getElementsByTagName("button")[0];
    btn.style.transition = "transform 0.3s bounce";
    btn.style.transform = "scale(1.1)";
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

  if (c1 == cp && c2 == cp && c3 == cp) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
  } else if (cp == c4 && cp == c5 && cp == c6) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    gameActive = false;
    jsConfetti.addConfetti({
      //   emojis: ["🏆", "🎉", "💫"],
      confettiColors: ["#ff0a54", "#ff477e", "#ff7096", "#ff85a1", "#fbb1bd"],
      confettiNumber: 60,
    });
  } else if (cp == c7 && cp == c8 && cp == c9) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
  } else if (cp == c1 && cp == c4 && cp == c7) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
  } else if (cp == c2 && cp == c5 && cp == c8) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
  } else if (cp == c3 && cp == c6 && cp == c9) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
  } else if (cp == c1 && cp == c5 && cp == c9) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
  } else if (cp == c3 && cp == c5 && cp == c7) {
    document.getElementById("result").innerHTML = `${cp} is the winner!!`;
    decor();
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
      decor();
    }
  }
}

function restart() {
  window.location = "index.html";
}

function decor() {
  document.getElementById("turn").innerHTML = "";
  gameActive = false;
  jsConfetti.addConfetti({
    confettiColors: ["#ff0a54", "#ff477e", "#ff7096", "#ff85a1", "#fbb1bd"],
  });
  let btn = document.getElementsByTagName("button")[0];
  btn.style.transition = "transform 0.5s cubic-bezier(0.68, -0.55, 0.27, 1.55)";
  btn.style.transform = "scale(2)";
}
