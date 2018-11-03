
/**
 * Makes a room to be used in a floor
 * 
 * @Joshua Spergel
 * @v6.4.18
 */
import java.util.Random;
import java.util.*;
public class room
{
    // instance variables - replace the example below with your own
    String[] descriptions1 = {"damp", "smelly", "foul", "dark", "bloody", "craggy"};// a list of descriptions for the room
    private String description;//the description of the specific room
    private int isEnemyAlive;//checks if there is an orc and if it is alive

    /**
     * sets up the room to be made
     */
    public room()
    {
        if(Math.random() < 0.4) isEnemyAlive = 1;//there is a 40% chance that there will be an orc in any given room
        description = createDescription();//creates a description for a room
    }

    /**
     * 
     * 
     */
    public String createDescription()//makes a description of the room
    {
        String descrt = descriptions1[((int)(Math.random() * 6))];
        return "This dungeon room is very " + descrt;
    }
    public String getDesc()//gets the description of the room
    {
        return description;
    }
    public int isOrc()//checks if there is an orc in the room
    {
        return isEnemyAlive;
    }
    public void killOrc()//changes the orc from position 1 to negative 1 to kill it
    {
        isEnemyAlive = -1;
    }
}