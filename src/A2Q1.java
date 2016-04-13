
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pearr2740
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        City KW = new City();
        Robot karel = new Robot(KW,1,1,Direction.EAST);
        
        
        new Thing(KW,1,2);
        new Thing(KW,1,3);
        new Thing(KW,1,4);
        new Thing(KW,1,5);
        new Thing(KW,1,6);
        new Thing(KW,1,7);
        new Thing(KW,1,8);
        new Thing(KW,1,9);
        new Thing(KW,1,10);
        
        while( karel.frontIsClear()){
            karel.move();
            if(karel.canPickThing()){
        karel.pickThing();
    }

        }
    }
}
      
    


        
    
    
    
    
    
        
        
      
        
        
        
        
        
       
    
   
    


  
        
    

