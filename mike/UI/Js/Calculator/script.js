function restart(){
    window.location="index.html"
}
function addDigitOrOperator(digit){
    let previous_value = document.getElementById('result').value;
    let last = previous_value.charAt(previous_value.length-1)
    if((last == "+" || last =="-"||last=="*"||last=="/"||last=="**"||last=='.')&&(digit=="+"||digit=="-"||digit=="*"||digit=="/"||digit=="**" || digit=='.')){
        alert("Idiot don't write two operators")
    }
    else{
         document.getElementById('result').value = (previous_value+digit)
    }
   
}
function calculateResult(){
    let str = document.getElementById('result').value;

    try{
        let answer = eval(str);
        document.getElementById('result').value = answer;
    }
    catch{
        alert("Wrong input of numbers");
        document.getElementById('result').value = '';
    }
    
}
function eraseLastDigit(){
    let previous_value = document.getElementById('result').value;
    document.getElementById('result').value = previous_value.slice(0,previous_value.length-1);
}