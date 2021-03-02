package APFRQs;

//Final Score: 5/6. Need to implement static for total password count variable since that variable is shared among all objects.

import java.util.Random;

public class Unit5Frq2{
    private int numofpasswords = 0; //This is incorrect because it should be static.
    private int numlength;
    private String prefix;
    private static Random random = new Random();

    //Prompt:
    //Creating a password consisting of a specified prefix, a period, and a randomly generated numeric portion of specified length
    //Creating a password consisting of the default prefix "A", a period, and a randomly generated numeric portion of specified length
    //Reporting how many passwords have been generated
    //Write the complete PasswordGenerator class. Your implementation must meet all specifications and conform to the example.

    public Unit5Frq2(int num, String prefi){
        this.numlength = num;
        this.prefix = prefi;
    } // 1/1 This constructor is correct.

    public Unit5Frq2(int num){
        this.numlength = num;
    } // 1/1 This constructor is correct.

    public String pwGen() {
        String pwd = prefix + "." ;
        for(int i =0; i<numlength; i++) {
            pwd += random.nextInt(10);
        }
        numofpasswords++;
        return pwd;
    } // 1/1 This method is correct.

    public String pwGen2() {
        String pwd = "A.";
        for(int i =0; i<numlength; i++){

            pwd += random.nextInt(10);
        }
        numofpasswords++;
        return pwd;
    } // 1/1 This method is correct

    public int pwCount(){
        return numofpasswords;
    } // 0/1 This method is incorrect because it needs to be static since numofpasswords was supposed to be static.

    public static void main(String[] args){
        Unit5Frq2 p1 = new Unit5Frq2(4,"chs");
        System.out.println(p1.pwGen());

        Unit5Frq2 p2 = new Unit5Frq2(4);
        System.out.println(p2.pwGen2());
    } // Everything in the tester is correct

}