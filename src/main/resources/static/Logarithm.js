var InputType = document.getElementById('InputType');
var number = document.getElementById('number');
var input = document.getElementById('input');
var output = document.getElementById('actualAnswer');


var InputTypeValue;

input.addEventListener("keyup",calcoutput);
InputType.addEventListener("change",calcoutput);

function calcoutput() {
    InputTypeValue = InputType.value;


    if (InputTypeValue == "log") {
        output.value = Math.log10(Number(number.value));
    }
    if (InputTypeValue == "ln") {
        output.value = Math.log(Number(number.value));
    }
    if (InputTypeValue == "2") {
        output.value = Math.pow(2, (number.value));
    }
    if (InputTypeValue == "e") {
        output.value = Math.pow(2.71828,(number.value));
    }
    if (InputTypeValue == "10") {
        output.value = Math.pow(10,(number.value));
    }
}