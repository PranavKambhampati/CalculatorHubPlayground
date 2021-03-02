package Factorial;

import java.math.BigInteger;

public class FactorialBigInteger {

    public BigInteger factorialcalc(int num){
        BigInteger result = BigInteger.ONE;
        for(int i=1; i<=num; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        FactorialBigInteger a = new FactorialBigInteger();
        System.out.println(a.factorialcalc(20));
    }
}
