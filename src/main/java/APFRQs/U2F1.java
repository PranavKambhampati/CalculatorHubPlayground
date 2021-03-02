package APFRQs;

public class U2F1 {

    String MainSequence;

    public U2F1(String seq){
        MainSequence = seq;
        System.out.println("Sequence: " + MainSequence);

    }

    public String insertSegment(String segment, int ind){
        String MainSequence1 = MainSequence.substring(0,ind);
        String MainSequence2 = MainSequence.substring(ind);
        MainSequence = MainSequence1 + segment + MainSequence2;
        return MainSequence;
    }

    public void changeSequence(String seq){
        String MainSequence = seq;
        System.out.println("New Sequence: " + MainSequence);
    }

    public void display(){
        System.out.println("Initilizing Display");
    }

    public static void Remover (String oldSeq, String segment) {
        String newSeq = oldSeq.replace(segment,"");
        System.out.println(newSeq);
    }

    public static void calculate (double a, double b){
        double answer = Math.pow(a,2) + Math.pow(b,2);
        double answer1 = Math.sqrt(answer);
        System.out.println(answer1);
    }

    public static void main(String[] args) {


        ////A. Write a statement to create a LightSequence object gradShow that has the intial light sequence "0101 0101 0101." Write the statment below.

        //Should be the one below
        //LightSequence gradShow = new LightSequence("0101 0101 0101");
        U2F1 gradShow = new U2F1 ("0101 0101 0101");
        //Score: 1/1. This is what the other team also did, and we agree that this is correct. It correctly makes an object and initializes it. CORRECT FROM CLASS ANSWERS.

        ////B. Write a statmenet that will call the display method to display the light sequence for the gradShow object. Write the statment below.

        gradShow.display();
        //Score: 1/1. This is what the other team also did, and we agree that this is correct because it correctly runs the display method from the gradShow object. Uses the Dot Method to call a method through an object. This works correctly when we test it. CORRECT FROM CLASS ANSWERS.

        ////C. Write a statment that will be used to update the gradShow light sequence to "0011 0011 0011". Write the statment below.

        gradShow.changeSequence("0011 0011 0011");
        //Score: 1/1. This is also what the other team did, and we agree that this is the correct answer because it changes the sequence. Uses the object correctly and dot method to correctly call the Display method, this works correctly when we test it. CORRECT FROM CLASS ANSWERS.


        ////D. Write a code segment that will call the insertSegment method to insert the segment "1111 1111" in the current sequence for gradShow at index 4. The resulting sequence will be stored in the string resultSeq. Write the code segment below.

        String resultSeq = gradShow.insertSegment("1111 1111", 4);
        System.out.println(resultSeq);
        //Score: 1/1. The other team agrees with our answer because it correctly does what the question asks it to do. We correctly store the new result in a new variable and we correctly use the dot method to call on the correct method from the code. CORRECT FROM CLASS ANSWERS.


        ////E. Assume that the string oldSeq has been properly declared and initialized and contains the string segment. Write a code segment that will remove the first occurence of segment from oldSeq and store it in the string newSeq. Consider the following examples.

        // Remover("StringA","StringB");
        //Sample:
        Remover("Never","r"); //Check Remover method above.
        //Score: 0/1. This is also what the other group did, but this method is incorrect.
        //INCORRECT FROM CLASS ANSWERS. Instead of using .replace method, use the .replaceFirst(segment, "") method so that only the first instance is replaced. The .replace method replaces all instances, which is why this question is wrong.
        //If  using substrings, then simply find the index where the segment string starts and then just remove the length of the segment string. You might have to use this method if CollegeBoard doesn't accept built-in methods.


        ////F. Two lights will be arragned on a two-dimensional plane. The vertical distance between the two lights is stored in the double variable a. The horizontal distance between the two lights is stored in the double variable b. The straight line distance between the two lights is given by the formula sqrt(a^2 + b^2).

        // calculate(a,b);
        //Sample:
        calculate(5,6);
        //Score: 1/1. The method we wrote is really similar to the method the other group also wrote and we think this is correct because a physical calculator and this method both give us the same answers. We also correctly use the Math library to do what the question asks us to do. CORRECT FROM CLASS ANSWERS.
    }
}
