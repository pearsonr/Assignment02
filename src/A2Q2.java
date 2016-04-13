
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  City tw = new City();
     Robot karel = new Robot(tw,3,1,Direction.EAST);
     
   
    new Wall(tw, 3, 1, Direction.SOUTH);
    new Wall(tw, 3, 2, Direction.SOUTH);
    new Wall(tw, 3, 3, Direction.SOUTH);
    new Wall(tw, 3, 4, Direction.SOUTH);
    new Wall(tw, 3, 5, Direction.SOUTH);
    new Wall(tw, 3, 6, Direction.SOUTH);
    new Wall(tw, 3, 7, Direction.SOUTH);
    new Wall(tw, 3, 8, Direction.SOUTH);
    new Wall(tw, 3, 9, Direction.SOUTH);
    new Wall(tw, 3, 2, Direction.EAST);
    new Wall(tw, 3, 1, Direction.EAST);
    new Wall(tw, 3, 4, Direction.EAST);
    new Wall(tw, 3, 7, Direction.EAST);
    new Thing(tw, 3, 9);
    
   
     while(!karel.frontIsClear())
    {
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
      
  while(karel.frontIsClear()){
      karel.move();
  }}
    
    
  
   
    }
    
    
   
        
    }
    
  
    
