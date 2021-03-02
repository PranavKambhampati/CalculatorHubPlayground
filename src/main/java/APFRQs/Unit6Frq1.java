package APFRQs;

//Final Score: 1/1. The method correctly does what it was supposed to do and prints out words that end with ing.

import java.lang.*;

public class Unit6Frq1 {

    public void bruh() {
        String words[] = {"reading","super","golfing"}; //Array correctly initialized
        for (String item: words) {
            int length = item.length();

            if(item.substring(length-3).equals("ing")) {
                System.out.println(item);
            }
        }
    } // 1/1. This was done correctly because it always works and prints out only the words that end in ing.

    public static void main(String[] args) {
        Unit6Frq1 c = new Unit6Frq1();
        c.bruh(); //Runs correctly.
    }
}