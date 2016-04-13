
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City tw = new City();
   Robot joe = new Robot(tw,0,0,Direction.EAST);
    
    new Wall(tw, 1, 1, Direction.WEST);
    new Wall(tw, 1, 1, Direction.NORTH);
    new Wall(tw, 1, 1, Direction.EAST);
    new Wall(tw, 1, 1, Direction.SOUTH);
    
    new Wall(tw, 4, 1, Direction.WEST);
    new Wall(tw, 4, 1, Direction.SOUTH);
    new Wall(tw, 4, 1, Direction.NORTH);
    new Wall(tw, 4, 1, Direction.EAST);
    
    new Wall(tw, 4, 4, Direction.SOUTH);
    new Wall(tw, 4, 4, Direction.NORTH);
    new Wall(tw, 4, 4, Direction.EAST);
    new Wall(tw, 4, 4, Direction.WEST);
    
    new Wall(tw, 1, 4, Direction.SOUTH);
    new Wall(tw, 1, 4, Direction.NORTH);
    new Wall(tw, 1, 4, Direction.WEST);
    new Wall(tw, 1, 4, Direction.EAST);
    
    new Wall(tw, 2, 2, Direction.WEST);
    new Wall(tw, 3, 2, Direction.WEST);
    new Wall(tw, 2, 2, Direction.NORTH);
    new Wall(tw, 2, 3, Direction.NORTH);
    new Wall(tw, 2, 3, Direction.EAST);
    new Wall(tw, 3, 3, Direction.EAST);
    new Wall(tw, 3, 2, Direction.SOUTH);
    new Wall(tw, 3, 3, Direction.SOUTH);
    
    while( joe.frontIsClear())
    {
    joe.move();
    joe.move();
    joe.turnLeft();
    joe.turnLeft();
    joe.turnLeft();
    joe.move();
    joe.turnLeft();
    joe.move();
    joe.turnLeft();
    joe.move();
    joe.turnLeft();
    joe.turnLeft();
    joe.turnLeft();
    joe.move();
    joe.move();
    joe.turnLeft();
    joe.turnLeft();
    joe.turnLeft();
   
    }
    
  
    
    
    
  
    
      
    
    
    
   
    
          
    
    
    
    
    
    
    
    }
}
