var InputType = document.getElementById('InputType');
var OutputType = document.getElementById('OutputType');
var input = document.getElementById('input');
var output = document.getElementById('output');


var WeightInputType = document.getElementById('WeightInputType');
var WeightOutputType = document.getElementById('WeightOutputType');
var weightinput = document.getElementById('weightinput');
var weightoutput = document.getElementById('weightoutput');


var InputTypeValue, OutputTypeValue;
var WeightInputTypeValue, WeigthOutputTypeValue;

input.addEventListener("keyup",calcoutput);
InputType.addEventListener("change",calcoutput);
OutputType.addEventListener("change",calcoutput);


weightinput.addEventListener("keyup",weightcalculate);
WeightInputType.addEventListener("change",weightcalculate);
WeightOutputType.addEventListener("change",weightcalculate)

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
    if(InputTypeValue == "Meters" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 1000;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 1000000;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 1000000000;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 1609;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) * 1.094;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) * 3.281;
    }
    if(InputTypeValue == "Meters" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) * 39.3701;
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
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 1000000;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 1000000000;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 1000000000000;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 1.609;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) * 1094;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) * 3281;
    }
    if(InputTypeValue == "Kilometers" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) * 39370.1;
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
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 10;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 10000;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 10000000;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 160934;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) / 91.44;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) / 30.48;
    }
    if(InputTypeValue == "Centimeters" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) / 2.541;
    }




    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) / 1000;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) / 1000000;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) / 10;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Millimeters"){
        output.value = input.value;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 1000;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 1000000;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 1609000;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) / 914;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) / 305;
    }
    if(InputTypeValue == "Millimeters" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) / 25.4;
    }



    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) / 1000000;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) / 1000000000;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) / 10000;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) / 1000;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Micrometers"){
        output.value = input.value;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 1000;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 1609000000;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) / 914400;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) / 304800;
    }
    if(InputTypeValue == "Micrometers" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) / 25400;
    }



    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) / 1000000000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) / 1000000000000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) / 10000000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) / 1000000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) / 1000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Nanometers"){
        output.value = input.value;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 1609000000000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) / 914400000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) / 304800000;
    }
    if(InputTypeValue == "Nanometers" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) / 25400000;
    }


    if(InputTypeValue == "Miles" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) * 1609;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) * 1.609;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) * 160934;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 1609000;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 1609000000;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 1609000000000;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Miles"){
        output.value = input.value;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) * 1760;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) * 5280;
    }
    if(InputTypeValue == "Miles" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) * 63360;
    }



    if(InputTypeValue == "Yards" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) / 1.094;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) / 1094;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) * 91.44;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 914;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 914400;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 914400000;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 1760;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Yards"){
        output.value = input.value;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) * 3;
    }
    if(InputTypeValue == "Yards" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) * 36;
    }




    if(InputTypeValue == "Feet" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) / 3.281;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) / 3281;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) * 30.48;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 305;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 304800;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 304800000;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 3;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) / 3;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Feet"){
        output.value = input.value;
    }
    if(InputTypeValue == "Feet" && OutputTypeValue == "Inches"){
        output.value = Number(input.value) * 12;
    }



    if(InputTypeValue == "Inches" && OutputTypeValue == "Meters"){
        output.value = Number(input.value) / 39.37;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Kilometers"){
        output.value = Number(input.value) / 39370;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Centimeters"){
        output.value = Number(input.value) * 2.54;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Millimeters"){
        output.value = Number(input.value) * 25.4;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Micrometers"){
        output.value = Number(input.value) * 25400;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Nanometers"){
        output.value = Number(input.value) * 25400000;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Miles"){
        output.value = Number(input.value) / 63360;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Yards"){
        output.value = Number(input.value) / 36;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Feet"){
        output.value = Number(input.value) / 12;
    }
    if(InputTypeValue == "Inches" && OutputTypeValue == "Inches"){
        output.value = input.value;
    }
}

function weightcalculate(){

    //weightoutput.value = weightinput.value;

    WeightInputTypeValue = WeightInputType.value;
    WeightOutputTypeValue = WeightOutputType.value;


    if(WeightInputTypeValue == "Kilograms" && WeightOutputTypeValue == "Kilograms"){
        weightoutput.value = weightinput.value;
    }
    if(WeightInputTypeValue == "Kilograms" && WeightOutputTypeValue == "Grams"){
        weightoutput.value = Number(weightinput.value) * 1000;
    }
    if(WeightInputTypeValue == "Kilograms" && WeightOutputTypeValue == "Milligrams"){
        weightoutput.value = Number(weightinput.value) * 1000000;
    }
    if(WeightInputTypeValue == "Kilograms" && WeightOutputTypeValue == "Micrograms"){
        weightoutput.value = Number(weightinput.value) * 1000000000;
    }
    if(WeightInputTypeValue == "Kilograms" && WeightOutputTypeValue == "Pounds"){
        weightoutput.value = Number(weightinput.value) * 2.205;
    }
    if(WeightInputTypeValue == "Kilograms" && WeightOutputTypeValue == "Ounces"){
        weightoutput.value = Number(weightinput.value) * 35.274;
    }


    if(WeightInputTypeValue == "Grams" && WeightOutputTypeValue == "Kilograms"){
        weightoutput.value = Number(weightinput.value) / 1000;
    }
    if(WeightInputTypeValue == "Grams" && WeightOutputTypeValue == "Grams"){
        weightoutput.value = weightinput.value;
    }
    if(WeightInputTypeValue == "Grams" && WeightOutputTypeValue == "Milligrams"){
        weightoutput.value = Number(weightinput.value) * 1000;
    }
    if(WeightInputTypeValue == "Grams" && WeightOutputTypeValue == "Micrograms"){
        weightoutput.value = Number(weightinput.value) * 1000000;
    }
    if(WeightInputTypeValue == "Grams" && WeightOutputTypeValue == "Pounds"){
        weightoutput.value = Number(weightinput.value) / 454;
    }
    if(WeightInputTypeValue == "Grams" && WeightOutputTypeValue == "Ounces"){
        weightoutput.value = Number(weightinput.value) / 28.35;
    }


    if(WeightInputTypeValue == "Milligrams" && WeightOutputTypeValue == "Kilograms"){
        weightoutput.value = Number(weightinput.value) / 1000000;
    }
    if(WeightInputTypeValue == "Milligrams" && WeightOutputTypeValue == "Grams"){
        weightoutput.value = Number(weightinput.value) / 1000;
    }
    if(WeightInputTypeValue == "Milligrams" && WeightOutputTypeValue == "Milligrams"){
        weightoutput.value = weightinput.value;
    }
    if(WeightInputTypeValue == "Milligrams" && WeightOutputTypeValue == "Micrograms"){
        weightoutput.value = Number(weightinput.value) * 1000;
    }
    if(WeightInputTypeValue == "Milligrams" && WeightOutputTypeValue == "Pounds"){
        weightoutput.value = Number(weightinput.value) / 453592;
    }
    if(WeightInputTypeValue == "Milligrams" && WeightOutputTypeValue == "Ounces"){
        weightoutput.value = Number(weightinput.value) / 28350;
    }


    if(WeightInputTypeValue == "Micrograms" && WeightOutputTypeValue == "Kilograms"){
        weightoutput.value = Number(weightinput.value) / 1000000000;
    }
    if(WeightInputTypeValue == "Micrograms" && WeightOutputTypeValue == "Grams"){
        weightoutput.value = Number(weightinput.value) / 1000000;
    }
    if(WeightInputTypeValue == "Micrograms" && WeightOutputTypeValue == "Milligrams"){
        weightoutput.value = Number(weightinput.value) / 1000;
    }
    if(WeightInputTypeValue == "Micrograms" && WeightOutputTypeValue == "Micrograms"){
        weightoutput.value = weightinput.value;
    }
    if(WeightInputTypeValue == "Micrograms" && WeightOutputTypeValue == "Pounds"){
        weightoutput.value = Number(weightinput.value) / 453600000;
    }
    if(WeightInputTypeValue == "Micrograms" && WeightOutputTypeValue == "Ounces"){
        weightoutput.value = Number(weightinput.value) / 28350000;
    }


    if(WeightInputTypeValue == "Pounds" && WeightOutputTypeValue == "Kilograms"){
        weightoutput.value = Number(weightinput.value) / 2.205;
    }
    if(WeightInputTypeValue == "Pounds" && WeightOutputTypeValue == "Grams"){
        weightoutput.value = Number(weightinput.value) * 454;
    }
    if(WeightInputTypeValue == "Pounds" && WeightOutputTypeValue == "Milligrams"){
        weightoutput.value = Number(weightinput.value) * 453592;
    }
    if(WeightInputTypeValue == "Pounds" && WeightOutputTypeValue == "Micrograms"){
        weightoutput.value = Number(weightinput.value) * 453600000;
    }
    if(WeightInputTypeValue == "Pounds" && WeightOutputTypeValue == "Pounds"){
        weightoutput.value = weightinput.value;
    }
    if(WeightInputTypeValue == "Pounds" && WeightOutputTypeValue == "Ounces"){
        weightoutput.value = Number(weightinput.value) * 16;
    }


    if(WeightInputTypeValue == "Ounces" && WeightOutputTypeValue == "Kilograms"){
        weightoutput.value = Number(weightinput.value) / 35.274;
    }
    if(WeightInputTypeValue == "Ounces" && WeightOutputTypeValue == "Grams"){
        weightoutput.value = Number(weightinput.value) * 28.35;
    }
    if(WeightInputTypeValue == "Ounces" && WeightOutputTypeValue == "Milligrams"){
        weightoutput.value = Number(weightinput.value) * 28350;
    }
    if(WeightInputTypeValue == "Ounces" && WeightOutputTypeValue == "Micrograms"){
        weightoutput.value = Number(weightinput.value) * 28350000;
    }
    if(WeightInputTypeValue == "Ounces" && WeightOutputTypeValue == "Pounds"){
        weightoutput.value = Number(weightinput.value) / 16;
    }
    if(WeightInputTypeValue == "Ounces" && WeightOutputTypeValue == "Ounces"){
        weightoutput.value = weightinput.value;
    }

}
