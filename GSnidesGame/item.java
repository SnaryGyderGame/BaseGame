
/**
 * Is the class that extends into weapon. It won't be used much
 * 
 * @Joshua Spergel 
 * @v6.14.18
 */
public class item
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class item
     */
    public item()
    {
        // initialise instance variables
        value = 0;
    }
    public item(int value1){ // if the user wants the item to have a specific value
        value = value1;
    }
    /**
     * If the user wants to get the value of the item
     */
    public int  getValue() 
    {
        return value;
    }
}