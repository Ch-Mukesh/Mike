function trigger(event) {
  console.log("Something is typing there");
  console.log(event.target.value);
  let str = "12-13+1";
  console.log(eval(str));
}
