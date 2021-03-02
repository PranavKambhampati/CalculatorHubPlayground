package APFRQs;

import java.util.ArrayList;
import java.util.Arrays;

public class Unit7Frq1 {

// a. Write the constructor for the UserName class. The constructor initializes and fills possibleNames with possible user names based on the firstName and lastName parameters. The possible user names are obtained by concatenating lastName with different substrings of firstName. The substrings begin with the first character of firstName and the lengths of the substrings take on all values from 1 to the length of firstName.

//The following example shows the contents of possibleNames after a UserName object has been instantiated.

    private ArrayList possibleNames = new ArrayList();



    public static void main (String args[]) {
        Unit7Frq1 c = new Unit7Frq1("john","smith");

    }

    public Unit7Frq1 (String firstName, String lastName) {
        for (int i = 1; i < firstName.length()+1; i++) {
            possibleNames.add(lastName + firstName.substring(0,i));
        }

        // 1/1, even through the loop begins at i = 1, the substring is adjusted correctly and prints the correct username possiblities

        System.out.println(possibleNames);

    }
    public boolean isUsed(String name, ArrayList arr) {
        if (arr.contains(name)) {
            return true;
        } else {
            return false;
        }
    }

    public void setAvailableUserNames(String[] usedNames) {
        for (int i = 0; i < usedNames.length; i++) {
            if (isUsed(usedNames[i] , possibleNames)) {
                System.out.println("Before: ");
                System.out.println("used" + Arrays.toString(usedNames));
                System.out.println("possible names :" + possibleNames);

                possibleNames.remove(possibleNames.indexOf(usedNames[i]));

                i--;
            }
        }
    }
}

// Other parts of the FRQ were not attempted as we were unsure on how to proceed
// b. Pranav and I were unsure on how to do this problem at the beginning, however, after looking at it we now understand how to do the problem

//Write the UserName method setAvailableUserNames. The method removes from possibleNames all names that are found in usedNames. These represent user names that have already been assigned in the online system and are therefore unavailable.

//A helper method, isUsed, has been provided. The isUsed method searches for name in arr. The method returns true if an exact match is found and returns false otherwise.

//The example below shows the intended behavior of the setAvailableUserNames method.

//Assume that the constructor works as specified, regardless of what you wrote in part (a). You must use isUsed appropriately to receive full credit.

//Complete the setAvailableUserNames method below.

/** Removes strings from possibleNames that are found in usedNames as described in part (b).

 */

