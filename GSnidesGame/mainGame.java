
/**
 * Has a lot of the functions
 * 
 * @Joshua Spergel 
 * @v6.14.18
 */
import java.util.Scanner;
public class mainGame
{
    // instance variables - replace the example below with your own
    private static int currentRoom = 0;//the current room that the player is in
    private Floor firstFloor = new Floor();//the floor that the player inhabits
    /**
     * Constructor for objects of class mainGame
     */
    public mainGame()
    {
        Floor firstFloor = new Floor();
    }
    public void changeRoom(int newRoom)//general term if the room needs to be changed wildly
    {
        currentRoom = newRoom;
    }
    public void incrementRoom()//increases room number by 1
    {
        currentRoom++;
    }
    public void decrementRoom()//decreases room number by 1
    {
        currentRoom--;
    }
    public int getCurrentRoomNum()//returns the current position of the character as a number
    {
        return currentRoom;
    }
    public room getCurrentRoom()//returns the ROOM the character is in
    {
        return firstFloor.getRoomFromNumber(currentRoom);
    }
    public Floor getFloor()//returns the floor if it is necessary
    {
        return firstFloor;
    }
    public void killOrcInRoom(int thisRoom)//is part of a chain if the orc needs to be killed
    {
        firstFloor.killThisOrc(thisRoom);
    }
    /**
     * Displays the room the player is in
     */
    public void displayRoom()
    {
        room thisRoom = firstFloor.getRoomFromNumber(currentRoom);
        System.out.println(thisRoom.getDesc());
    }
    public int getNum()//code for getting the number the character wants to do
    {
        System.out.println("What do you want to do?");
        System.out.println("Put in 1 to go forward, 2 to go backwards, 3 to get the room description again");
        System.out.println("4 to get your health and stats");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        return sc.nextInt();
    }
    
}