package APFRQs;

//Total Score: 2/4

//Decided to host all three class pertaining to this frq in 1 class.

class Unit8Frq{

    public static void main(String[] args) {
        Plot[][] testing = new Plot[][]{
                {new Plot("corn", 20), new Plot("corn", 30), new Plot("peas",10)},
                {new Plot("peas", 30), new Plot("corn", 40), new Plot("corn",62)},
                {new Plot("wheat", 10), new Plot("corn", 50), new Plot("rice",30)},
                {new Plot("corn", 55), new Plot("corn", 30), new Plot("peas",30)},
        }; //Array of given 2D array for testing purposes

        ExperimentalFarm test = new ExperimentalFarm(testing);
        System.out.println(test.getHighestYield("corn"));
        System.out.println(test.getHighestYield("peas"));
        // Prints memory locations because toString method is not used

    }

}


class Plot{ // Class Plot which has some methods pertaining to the plot in the experimental farm.
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield){
        cropType = crop;
        cropYield = yield;
    }

    public String getCropType(){
        return cropType;
    }

    public int getCropYield(){
        return cropYield;
    }
}

class ExperimentalFarm { //ExperimentalFarm Class has methods to navigate the 2D array created.

    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p){
        farmPlots = p;
    }

    //A. Returns the plot with the highest yield for a given crop type.
    public Plot getHighestYield(String c){
        Plot highestyield = null;
//loop iterates through the 2D array.
        for (int row = 0; row < farmPlots.length; row++){
            for(int col = 0; col <farmPlots[row].length; col++){
                Plot current = farmPlots[row][col];

                if (current.getCropType().equals(c) && (highestyield != null ? current.getCropYield() > highestyield.getCropYield():true)){ //Conditional was incorrect, copied from class
                    highestyield = current;
                }
            }
        }
        return  highestyield;
    }
//1/2. We were able to come up with the logic for returning the highest yield plot, however, we weren't able to write the condition on line 56. This is why we lose a point.

    //B. Returns true if all plots in a given column in the 2D array farmPlots contain the same type of crop, or false otherwise.
    public boolean sameCrop(int col){
        String crop = farmPlots[0][col].getCropType();

        for (int row = 1; row < farmPlots.length; row++){
            if(!farmPlots[row][col].getCropType().equals(crop)){ //Conditional was incorrect, copied from class
                return false;
            }
        }

        return true;
    }
    //1/2. Once again, we were able to come up with the logic pertaining to the question, however, we were unable to write the conditonal statement on line 70. We lose a point for this mistake.
}

