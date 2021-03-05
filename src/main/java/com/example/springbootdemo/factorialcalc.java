package com.example.springbootdemo;

public class factorialcalc {

    int numbero;

    public factorialcalc(int var){
        this.numbero = var;
    }



    public int factorialcalco(int num){
        if (num >= 1){
            return num*factorialcalco(num-1);
        } else {
            return 1;
        }
    }

    public static int driver(int num){
        factorialcalc cases = new factorialcalc(num);
        int answer = cases.factorialcalco(num);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(factorialcalc.driver(10));
    }

}
