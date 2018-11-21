/* File Name: DrawMyName.java
 * Created by:  Judy Chun, cs8afug and Lingchen Dang, cs8afuk
 * Due Date:    Oct 8th, 2017
 *
 */

public class DrawMyName
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
      // This is some starter code, but it has errors.  You will 
      // fix these errors and then add your code to draw your name
      // here.  Be sure to remove this comment once you've fixed the 
      // errors and started adding your own code.
      World w = new World();
      Turtle judy = new Turtle(100,100,w); //Creates a turtle in w at (x,y) (100,100)  


      //Make a shape 
      judy.turnRight();
      judy.forward(60);
      judy.turn(180);
      judy.forward(30);
      judy.turnLeft();
      judy.forward(60);
      judy.penUp();
      judy.moveTo(190,100);
      
      //Make a shape
      judy.penDown();
      judy.forward(60);
      judy.penUp();
      judy.moveTo(190,100);
      judy.penDown();
      judy.turnLeft();
      judy.forward(30);
      judy.turnRight();
      judy.forward(30);
      judy.turnRight();
      judy.forward(30);
      judy.turn(225);
      judy.forward(42);
      judy.penUp();
      judy.moveTo(250,100);
      
     //Make a shape
      judy.turn(45);
      judy.penDown();
      judy.forward(60);
      judy.penUp();
      judy.moveTo(280,100);
      
      //Make a shape
      judy.turnLeft();
      judy.penDown();
      judy.forward(60);
      judy.turn(180);
      judy.forward(30);
      judy.turnLeft();
      judy.forward(60);
      judy.penUp();
      judy.moveTo(370,100);
      
      //Make a shape
      judy.penDown();
      judy.forward(60);
      judy.turnLeft();
      judy.forward(30);
      judy.turnLeft();
      judy.forward(60);
      judy.turnLeft();
      judy.forward(30);
      judy.penUp();
      judy.moveTo(430,100);
      
      //Make a shape
      judy.penDown();
      judy.turnLeft();
      judy.forward(60);
      judy.penUp();
      judy.moveTo(430,100);
      judy.penDown();
      judy.turn(330);
      judy.forward(67);
      judy.turn(210);
      judy.forward(60);
     
     Turtle lynette = new Turtle(100,190,w); //Creates a turtle in w at (x,y) (190,100)  
     
     //Make a shape
     lynette.turnRight();
     lynette.forward(60);
     lynette.penUp();
     lynette.moveTo(100,190);
     lynette.penDown();
     lynette.turnRight();
     lynette.forward(30);
     lynette.turnLeft();
     lynette.forward(60);
     lynette.turnRight();
     lynette.forward(30);
     lynette.turnRight();
     lynette.forward(60);
     lynette.penUp();
     lynette.moveTo(190,190);
     
     //Make a shape
     lynette.penDown();
     lynette.turnLeft();
     lynette.forward(60);
     lynette.penUp();
     lynette.moveTo(190,190);
     lynette.penDown();
     lynette.turnLeft();
     lynette.forward(30);
     lynette.turnRight();
     lynette.forward(30);
     lynette.turnRight();
     lynette.forward(30);
     lynette.penUp();
     lynette.moveTo(250,190);
     
     //Make a shape
      lynette.penDown();
      lynette.turnLeft();
      lynette.forward(60);
      lynette.penUp();
      lynette.moveTo(280,190);
     
      //Make a shape
      lynette.penDown();
      lynette.forward(60);
      lynette.penUp();
      lynette.moveTo(280,190);
      lynette.turnLeft();
      lynette.penDown();
      lynette.forward(60);
      lynette.turnRight();
      lynette.forward(30);
      lynette.turnRight();
      lynette.forward(60);
      lynette.turn(210);
      lynette.forward(67);
      lynette.penUp();
      lynette.moveTo(385,190);
     
      //Make a shape
      lynette.penDown();
      lynette.turn(60);
      lynette.forward(60);
      lynette.penUp();
      lynette.moveTo(430,190);

      //Make a shape
      lynette.penDown();
      lynette.turnLeft();
      lynette.forward(40);
      lynette.penUp();
      lynette.moveTo(450,190);
      lynette.penDown();
      lynette.turnRight();
      lynette.forward(60);
     
    
     
     


      
    }
}
