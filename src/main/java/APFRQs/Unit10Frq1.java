package APFRQs;

//Total Score: 3/4

class NumberSystem{

    public int gcf(int a, int b){

        while (a != b){
            if(a>b){
                a=a-b;
            } else{
                b=b-a;
            }
        }
        return b;

        /*

        int modResult = a%b;
        if(modResult == 0) {return b};
        return gcf(b,modresult);

        */
    } // 1/2 This is a much easier way to solve this problem. Even though the un-commented apporach works, it doesn't use recursion. Therefore, we lose a point for this.

    public void reduceFraction(int numerator, int denominator){
        int x = numerator;
        int y = denominator;

        int reducednumer = numerator/gcf(x,y);
        int reduceddenom = y/gcf(x,y);

        System.out.println(numerator + "/" + denominator + " reduces to " + reducednumer + "/" + reduceddenom);
    } // 2/2 This method is implemented correctly and calls the gcf method properly. While this can be coded using if/else statements, this looks like the shorter way to do this.
}


public class Unit10Frq1 {
    public static void main(String[] args) {
        NumberSystem obj = new NumberSystem();
        System.out.println(obj.gcf(25,10)); //Tester for method
        obj.reduceFraction(8,20);
    } //This is the implementation for this FRQ and it works as required.
}
