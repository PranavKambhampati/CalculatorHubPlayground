package APFRQs;

public class Unit3Frq1 {
    //Score: 4/4

    // Variables initialized
    static boolean rsvp;
    static int selection;
    static String option1;
    static String option2;

    public static void main (String args[]){
        ////A. Write a code segment that prints "attending" if rsvp is true and prints "not attending" otherwise.

        rsvp=true;

        if (rsvp) {
            System.out.println("attending");
        } else {
            System.out.println("not attending");
        }

        // 1/1. This uses a simple if/else statement to check whether the rsvp was attending or not. CORRECT FROM CLASS ANSWERS.

        ////B. Write a code segment that prints the food item associated with selection. For example, if selection is 3, the code segment should print "pasta".

        selection = 1;

        if (selection == 1) {
            System.out.println("beef");
        } else if (selection == 2) {
            System.out.println("chicken");
        } else if (selection == 3) {
            System.out.println("pasta");
        } else {
            System.out.println("fish");
        }

        // 1/1. This uses if/else statements to check what selection the rsvp had. It's also possible to use a switch case for this question. CORRECT FROM CLASS ANSWERS.

        ////C. Write a code segment that will store a dinner selection in option1 based on the values of rsvp and selection. The intended behavior of the code segment is described below.

        if(rsvp){
            if(selection == 1){
                option1 = "Thanks for attending. You will be served beef.";
            } else if(selection ==2){
                option1 = "Thanks for attending. You will be served chicken.";
            } else if(selection == 3) {
                option1 = "Thanks for attending. You will be served pasta.";
            } else {option1 = "Thanks for attending. You will be served fish.";
            }
        } else{
            option1 = "Sorry you can't make it.";
        }

        // 1/1. This uses more if/else statements to decide the atendee's food option based on if they're attending or not. CORRECT FROM CLASS ANSWERS.

        ////D. Write a code segment that will print true if the strings option1 and option2 contain the same values and will print false otherwise.

        if(option1.equals(option2)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // 1/1. This is correct because it uses the .equals method to check equivalency. You could have also put the codition in a print statement. CORRECT FROM CLASS ANSWERS.
    }


}



