package Factorial;

public class FactorialIteration {

    public int factorialcalc(int num){

        int answer = 1;

        for(int i = 1; i <= num; i++){
            answer*=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        FactorialIteration a = new FactorialIteration();
        System.out.println(a.factorialcalc(5)); //For testing
    }

}
