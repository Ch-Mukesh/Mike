function validateMob(value) {
            if (value.length > 10) {
                alert("Mobile number should be of 10 digits");
                let num = document.getElementById('mob').value;
                document.getElementById('mob').value = num.slice(0, 10);
            }

            let last_digit = value.charAt(value.length - 1)
            last_digit = parseInt(last_digit)

            if (last_digit >= 0 && last_digit <= 9) {
                //allowed
                document.querySelector("h3").innerText = `Your Mobile No is: ${document.getElementById('mob').value}`;
            }
            else {
                alert("Mobile number can only have digit b/w 0-9")
                let num = document.getElementById('mob').value;
                document.getElementById('mob').value = num.slice(0, num.length - 1);
            }
        }