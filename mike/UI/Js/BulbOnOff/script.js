let isLightOn = false;

function toggleLight() {
    const toggle = document.querySelector('.toggle')
    const h1 = document.getElementsByTagName('h1')[0];
    const body = document.body;
    const switchElement = document.querySelector('.switch');

    isLightOn = !isLightOn;

    // Toggle the position of the switch
    if (isLightOn) {
        h1.textContent = 'Light On'
        body.style.backgroundColor = 'black';
        body.style.color = 'white'
        toggle.style.backgroundColor = 'black'
        switchElement.style.backgroundColor = 'white'
        toggle.style.transform = 'translateX(30px)'; // Move to the right (light on)
        toggle.style.borderColor = 'white';
    } else {
        h1.textContent = 'Light Off'
        body.style.backgroundColor = 'white';
        body.style.color = 'black'
        toggle.style.backgroundColor = 'white'
        toggle.style.transform = 'translateX(0)'; // Move to the left (light off)
        switchElement.style.backgroundColor = ''
    }
}
