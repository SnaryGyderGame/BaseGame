
/**
 * A floor made up of rooms
 * 
 * @Joshua Spergel 
 * @v6.14.18
 */
import java.util.Random;
import java.util.*;
public class Floor
{
    // instance variables - replace the example below with your own
    ArrayList<room> dunLine = new ArrayList<room>(); // creates a arraylist of rooms
    /**
     * Constructor for objects of class Floor
     */
    public Floor()
    {
        int floorCount = (int)(Math.random() * 8) + 6; // creates a random number of rooms in the floor
        for(int y = 0; y < floorCount; y++) 
        {
            room thisRoom = new room();
            dunLine.add(thisRoom);
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public room getRoomFromNumber(int num)//returns a room from the number its at
    {
        return dunLine.get(num);
    }
    public void killThisOrc(int thisRoom)// the middle chain in the process to kill an orc
    {
        dunLine.get(thisRoom).killOrc();
    }
    public int getSize()//gets the size of the 
    {
        return dunLine.size();
    }
}