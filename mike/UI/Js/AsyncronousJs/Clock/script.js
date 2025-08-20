function updateClock() {
  const handsOfClock = document.getElementsByTagName("img");

  let now = new Date();
  let seconds = now.getSeconds();
  let minutes = now.getMinutes() + seconds / 60;
  let hours = now.getHours() + minutes / 60;

  handsOfClock[2].style.transform = `rotate( ${seconds * 6}deg)`;
  handsOfClock[1].style.transform = `rotate( ${minutes * 6}deg)`;
  handsOfClock[0].style.transform = `rotate( ${hours * 30}deg)`;
}


setInterval(updateClock,1000);
updateClock(); //For immediate result call once otherwise ignore