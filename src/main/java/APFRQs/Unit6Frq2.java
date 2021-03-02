package APFRQs;

//Final Score: 1/2. Some of the logic in the first part of the problem was incorrect, but correct logic is written in comments. Second part was correct.

import java.util.Arrays;
import java.lang.*;
import java.util.*;

public class Unit6Frq2 {

    int itemsSold[] = {5,6,5};
    double wages[] = {5,3,5};

    public static void main (String[] args){
        Unit6Frq2 c = new Unit6Frq2();
        c.computeBonusThreshold();
        c.computeWages(10.0,1.5);

        System.out.println("wages");
    } //Everything in driver is correct.

    public double computeBonusThreshold(){
        int highest = 0;
        int lowest = 0;
        int sum = 0;
        double answer = 0; //all instance variables are initialized correctly.

        for(int item: itemsSold){
            sum += item;

            if(item > highest){
                highest = item;
            } else if (item < highest){ // faulty logic
                lowest = item;//faulty logic
            }//faulty logic

    /*Faulty logic can be rewritten as:
    if(item<min) then min = item and if(item>max then max = item)
    */

            //0/1.Incorrect because of the faulty logic, but correct logic is in comment above.

            double ans = sum - highest - lowest;
            double arraylength = itemsSold.length;

            answer = ans/arraylength;
        }
        return answer;
    }

    public void computeWages(double fixedWage, double perItemWage){
        for(int employee = 0; employee < itemsSold.length; employee++){
            if(itemsSold[employee] > computeBonusThreshold()){
                double wagey = (fixedWage + (perItemWage * itemsSold[employee])* 1.1);
                wages[employee] = wagey;
            }
            else {
                double wagey = (fixedWage + (perItemWage * itemsSold[employee]));
                wages[employee] = wagey;
            }  //1/1. This part of the problem does everything correctly. Everything is calculated correctly. This could have been more efficient if the items sold was compared to the treshold first. CORRECT FROM CLASS ANSWERS.
        }
    }
}
