let num = Math.floor(Math.random() * 100)
let count = 0
let lastnum = 0;
let usernum = 0;
let gameActive = true

function validateInput(value) {
    if (value.length > 2) {
        alert("You have to write a number between 0 and 99")
        document.getElementById('inp').value = value.slice(0, 2)
    }


    let pattern = /\D/;
    if (pattern.test(value)) {
        alert("Non digit characters are not allowed")
        document.getElementById('inp').value = value.slice(0, value.length - 1)
    }
}

function checkNumber() {
    count++
    lastnum = usernum
    usernum = document.getElementById('inp').value


    if (usernum == num) {
        alert("You have predicted the number")
        window.location = "index.html"
    }

    else {
        alert(`Wrong predication. You have ${3 - count} chances left`)

        if (count == 3) {
            alert(`Game Over, the number was ${num}`)
            gameActive = false
            window.location = "index.html"
        }

        if (gameActive) {
            if (usernum > num) {
                alert(`Hint: The number is in between ${lastnum} and ${usernum}`)
            }

            if (usernum < num) {
                alert(`Hint: The number is in between ${usernum} and 100`)
            }
        }
    }
}