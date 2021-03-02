package Factorial;

import java.util.stream.LongStream;

public class FactorialStreams {

    public long factorialcalc(long n){
        return LongStream.rangeClosed(1,n).reduce(1,(long a,long b) -> a*b);
    }

    public static void main(String[] args) {
        FactorialStreams a = new FactorialStreams();
        System.out.println(a.factorialcalc(5)); //For testing
    }

}
