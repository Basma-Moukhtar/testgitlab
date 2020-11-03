/**
 * This class is an example of a simple user-defined Java class
 * It represents a rectangle that has two attributes: length and width
 * @author Mohammad El-Ramly 
 * @version 1.00 2010/3/10
 */

public class Rectangle
{
   private double length;
   private double width;

   /** The setLength method assigns a given value to the rectangle length 
   * @param givenLength is the value to set the rectangle length to */
   
    public void setLength (double givenLength) {
       length = givenLength;
    }
    
    /** The getLength method returns the value of the rectangle length.
      * @return returns the value of the rectangle length */
    
    public double getLength () {
       return length;
    }
    
    /** The setLength method assigns a given value to the rectangle width 
   * @param givenWidth is the value to set the rectangle width to */
   
    public void setWidth (double givenWidth) {
       width = givenWidth;
    }
    
    /** The getWidth method returns the value of the rectangle width.
      * @return returns the value of the rectangle width */
    
    public double getWidth () {
       return width;
    }
    
    /** The calculateArea method caluclulates and returns the rectangle area.
     * @return returns the area of the rectangle */
 
    public double calculateArea () {
       return length * width;
    }
}
