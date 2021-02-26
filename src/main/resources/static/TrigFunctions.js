
var angle = document.getElementById('angle');
var input = document.getElementById('input');
var output = document.getElementById('output');


var InputTypeValue, OutputTypeValue;

input.addEventListener("keyup",calcoutput);
InputType.addEventListener("change",calcoutput);
OutputType.addEventListener("change",calcoutput);

function calcoutput() {

    InputTypeValue = InputType.value;
    OutputTypeValue = OutputType.value;

    if (InputTypeValue == "Sine") {
        output.value = Math.sin(angle);
    }
    if (InputTypeValue == "Cosine") {
        output.value = Math.cos(angle);
    }
    if (InputTypeValue == "Tangent") {
        output.value = Math.tan(angle);
    }
}