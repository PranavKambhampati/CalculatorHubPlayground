var InputType = document.getElementById('InputType');
var angle = document.getElementById('angle');
var input = document.getElementById('input');
var output = document.getElementById('actualAnswer');


var InputTypeValue;

input.addEventListener("keyup",calcoutput);
InputType.addEventListener("change",calcoutput);

function calcoutput() {
    InputTypeValue = InputType.value;


    if (InputTypeValue == "Sine") {
        output.value = Math.sin(Number(angle.value));
    }
    if (InputTypeValue == "Cosine") {
        output.value = Math.cos(Number(angle.value));
    }
    if (InputTypeValue == "Tangent") {
        output.value = Math.tan(Number(angle.value));
    }
}