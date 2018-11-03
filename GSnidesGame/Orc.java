
/**
 * ARGH ORCCCCCC
 * @Joshua Spergel 
 * @v6.14.18
 */
public class Orc extends Creature
{
    // instance variables - replace the example below with your own

    /**
     * Creates a simple orc so it has the player's characteristics but worse
     */
    public Orc()
    {
        super();
        changeStr((int)(Math.random() * 8) + 2);
        changeDex((int)(Math.random() * 8) + 2);
        changeCon((int)(Math.random() * 8) + 2);
        changeIntel((int)(Math.random() * 8) + 2);
        changeWis((int)(Math.random() * 8) + 2);
        changeCha((int)(Math.random() * 8) + 2);
        calculateHealth();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */

    
}