let len = document.getElementById("len");
let lc = document.getElementById("lc");
let uc = document.getElementById("uc");
let ss = document.getElementById("ss");
let num = document.getElementById("num");

function validatePassword(pass) {
  let arr = Array(5).fill(false);

  if (pass.length >= 8 && pass.length <= 25) arr[0] = true;

  for (let i = 0; i < pass.length; i++) {
    if (pass.charCodeAt(i) >= 65 && pass.charCodeAt(i) <= 90) 
        arr[2] = true;
    else if (pass.charCodeAt(i) >= 97 && pass.charCodeAt(i) <= 122)
      arr[1] = true;
    else if (pass.charCodeAt(i) == 64 || pass.charCodeAt(i) == 95)
      arr[3] = true;
    else if (pass.charCodeAt(i) >= 48 && pass.charCodeAt(i) <= 57)
      arr[4] = true;
  }

  len.innerHTML = arr[0] ? "✅ Length OK" : "❌ Must be at least 8 chars and lessThan 25 Char's";
  lc.innerHTML = arr[1] ? "✅ Lowercase OK" : "❌ Must contain lowercase";
  uc.innerHTML = arr[2] ? "✅ Uppercase OK" : "❌ Must contain uppercase";
  ss.innerHTML = arr[3] ? "✅ Special OK" : "❌ Must contain @ or _";
  num.innerHTML = arr[4] ? "✅ Number OK" : "❌ Must contain a number";
}
