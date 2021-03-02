package Factorial;

public class FactorialRecursion {
    public int factorialcalc(int num){
        if (num >= 1){
            return num*factorialcalc(num-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        FactorialRecursion a = new FactorialRecursion();
        System.out.println(a.factorialcalc(5)); //For testing
    }
}
