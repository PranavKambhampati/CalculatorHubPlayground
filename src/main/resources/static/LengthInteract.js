var InputType = document.getElementById('InputType');
var OutputType = document.getElementById('OutputType');
var input = document.getElementById('input');
var output = document.getElementById('output');


var InputTypeValue, OutputTypeValue;

input.addEventListener("keyup",calcoutput);
InputType.addEventListener("change",calcoutput);
OutputType.addEventListener("change",calcoutput);



function calcoutput(){ //need to add more conversions

    //output.value = input.value; Only to make sure that the boxes are detecting input

    InputTypeValue = InputType.value;
    OutputTypeValue = OutputType.value;

    if(InputTypeValue == "Meters" && OutputTypeValue == "Meters"){
        output.value = input.value;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) * 0.001;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) * 100;
    }

    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) * 1000;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Kilometers"){
        output.value = input.value;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) * 100000;
    }

    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) * 0.01;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) * 0.00001;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Centimeters"){
        output.value = input.value;
    }

}

