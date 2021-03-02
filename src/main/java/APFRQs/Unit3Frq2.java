package APFRQs;


public class Unit3Frq2 {
    // Score: 3/5

    //This is meant to draw a Square that fits on the coordinate plane based on the arguments entered into the function.

/** Precondition: All parameters are between 0 and 10, inclusive.
 * Draws a line segment in a  10 -by- 10   xy -coordinate grid.
 * The line segment is drawn from (x1, y1) to (x2, y2).
 */
    /** Precondition: 0 ≤ x < 10, 0 < y ≤ 10, and len > 0.
     * Draws a square on a  10 -by- 10   xy -coordinate grid
     * and prints the square’s side length and area.
     * The upper left corner of the square will be located
     * at the coordinate (x, y) and the side length of the
     * square will be len (or as large as will fit in the grid).
     */

    //dummy method
    public static void drawLine (int x, int y, int x2, int y2) {
        int answer = x + y + x2 + y2;
    }

    public static void drawSquare(int x, int y, int len){
    /*
    while(len>10-x && len>10-y){
      len--;
    } // Incorrect way to write the if statement condition because it doesn't assign the correct len value
    drawLine(x,y,(x+len),y);
    drawLine((x+len),y,(x+len),(y-len));
    drawLine((x+len),(y-len),x,(y-len));
    drawLine(x,(y-len),x,y);
    System.out.println("The area is: " + len * len);
    System.out.println("The perimeter is: " + len*4);
    */

        //Correct Answer
        if(len > y && y <= (10-x)){ //Better way to assign len value to the function
            len = y; //Checks if len is larger than it could fit on the y axis
        }
        if(len > (10-x) && (10-x) <= y){
            len = x; //Checks if len is larger than it could fit on the x axis
        }
        drawLine(x,y,(x+len),y); //Draws the square
        drawLine(x,y,x,y-len); //Draws the square
        drawLine(x,y-len,x+len,y-len); //Draws the square
        drawLine(x+len,y,x+len,y-len); //Draws the square
        System.out.println("The area is: " + len * len); //Prints area. Uses the len that is initialized.
        System.out.println("The side length is: " + len); //Prints side length of square.

    }

    public static void main(String args[]){
        drawSquare(1,2,4); //Method call to draw the square
    }

    //Get points for drawing the square, properly writing the class using correct Java Syntax, and printing the area and side length. However, the algorithm is the incorrect so lose points for that. INCORRECT FROM CLASS ANSWERS (see comments above).

}
