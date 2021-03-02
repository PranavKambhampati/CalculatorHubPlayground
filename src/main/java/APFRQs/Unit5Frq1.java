package APFRQs;

//Final Score: 3/4.

class Unit5Frq1 {

    private String hostName;
    private String address;

    public Unit5Frq1 (String n, String a) {
        hostName = n;
        address = a;
    }

    public static void main (String args[]){
        Unit5Frq1 c = new Unit5Frq1("Aryan", "Pranav");

        c.UpdateAddress("San Diego");
        System.out.println(c.Message("Pranav"));
        c.Invitation("San Diego");
    }
    //(a)   Write a method for the Invitation class that returns the name of the host.
    //Write the method below.
    public String NameOfHost() {
        return hostName;
    }
    //1/1. Correctly gets name of host. This is bascially just a getter method. To follow better code practices, we could have used the this keyword. CORRECT FROM CLASS ANSWERS.

    //b)   Write a method for the Invitation class that accepts a parameter and uses it to //update the address for the event.
    //Write the method below.

    public void UpdateAddress(String newAddress) {
        //newAddress = address;
        address = newAddress;
    }

    //1/1. Correctly updates instance variable. To ensure that this always works, use the this keyword so that it's this.address = newAddress;. CORRECT FROM CLASS ANSWERS.

    //(c)   Write a method for the Invitation class that will accept the name of a person who will be invited as a string parameter and return a string consisting of the name of the person being invited along with name of the host and location of the event.
    //For example, if the host name is "Karen", the party location is "1234 Walnut Street", and the person invited is "Cheryl", the method should return a string in the following format.

    //Dear Cheryl, please attend my event at 1234 Walnut Street. See you then, Karen.

    //Write the method below. Your implementation must conform to the example above.

    public String Message(String invitee) {
        return ("Dear " + invitee + " , please attend my event at " + address + ". See you then, " + hostName + ".");
    }

    //0/1. Correctly concatenates all variables together. Once again, you can use the this keyword to refer to the correct instance variable of the class. However, in order to get the correct hostname, we need to call the getter method and not the instance variable. INCORRECT FROM CLASS ANSWERS.



    //(d)   A student has written the following one-parameter constructor to be included in the Invitation class. The method is intended to construct a new Invitation object that sets address to the value of the parameter and sets hostName to the default name "Host". The constructor does not work as intended.
    //public Invitation(String address)
    //{
    //address = address;
    //hostName = "Host";
    //}
    // Write a correct implementation of the one-parameter Invitation constructor that avoids the error in the student’s implementation.

//Write the method below.

    public void Invitation (String address1) {
        address = address1;
        hostName = "Host";
    }

    //1/1. Correctly updates the instance variable. However, to make this even better, use the this keywords in front of hostName. CORRECT FROM CLASS ANSWERS.

    //
}
