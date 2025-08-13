function darkMode(){
    let b = document.getElementsByTagName('body');
    b[0].id = "dark";

    // document.getElementById('sun').style.display = "none";
    document.getElementById('heading').innerText = "This is dark mode";
}

function lightMode(){
    let b = document.getElementsByTagName('body');
    b[0].id = "light";

    // document.getElementById('moon').style.display = "none";
    document.getElementById('heading').innerText = "This is light mode";
}

function red(){
    let heading = document.querySelector('#heading');
    heading.style.color = "red";
}

function wheat(){
    let heading = document.querySelector('#heading');
    heading.style.color = "wheat";
}
