/**
 * This class is a demo for using Square and Rectangle classes
 * @author Mohammad El-Ramly 
 * @version 1.00 2010/3/10
 */

import java.util.Scanner;
public class Demo 
{  
   public static void main(String[] args) { 
      Square s1;
      Rectangle r1;
      int choice;
      double side, length, width;
      
      Scanner keyboard = new Scanner (System.in);
      System.out.println ("Welcome object manipulator and area claculator !!");
      System.out.println ("Press \"1\" if you want a square");
      System.out.println ("Press \"2\" if you want a rectangle");
      System.out.println ("===>");
      choice = keyboard.nextInt();
      
      if (choice == 1) {
         System.out.println ("Please enter square side: ");   
         side = keyboard.nextDouble();
         
         s1 = new Square();
         s1.setSide (side);
         
         System.out.println ("I created a square for you.");
         System.out.println ("Its side is " + s1.getSide() + " and its area is " + s1.calculateArea());   
      }
      
      if (choice == 2) {
         System.out.println ("Please enter rectangle's length and width seperated by space: ");   
         length = keyboard.nextDouble();
         width = keyboard.nextDouble();
         
         r1 = new Rectangle();
         r1.setLength (length);
         r1.setWidth (width);
         
         System.out.println ("I created a rectangle for you.");
         System.out.println ("Its length is " + r1.getLength() + " and its width is " + r1.getWidth());   
         System.out.println ("Its area is " + r1.calculateArea());   
      }
   }
}
