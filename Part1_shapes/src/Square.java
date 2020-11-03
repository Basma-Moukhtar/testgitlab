/**
 * This class is an example of a simple user-defined Java class
 * It represents a square and has only one data field: side
 * @author Mohammad El-Ramly 
 * @version 1.00 2010/3/10
 */

public class Square 
{  
    private double side;
    
    /** The setSide method assigns a given value to the sqaure side 
      * @param givenSide The value to set the square side to */
    
    public void setSide (double givenSide) {
       side = givenSide;
    }
    
    /** The getSide method returns the value of the square side.
      * @return returns the value of the square side */
    
    public double getSide () {
       return side;
    }
    
     /** The calculateArea method caluclulate and returns the square area.
       * @return returns the area of the square */
    
    public double calculateArea () {
       return side * side;
    }
}
