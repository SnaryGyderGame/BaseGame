import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class Player here.
 * 
 * @Joshua Spergel
 * @v5.25.18
 */
public class Player extends Creature
{
    // instance variables - replace the example below with your own
    private item[] inventory;
    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        changeStr((int)(Math.random() * 8) + 10);
        changeDex((int)(Math.random() * 8) + 10);
        changeCon((int)(Math.random() * 8) + 10);
        changeIntel((int)(Math.random() * 8) + 10);
        changeWis((int)(Math.random() * 8) + 10);
        changeCha((int)(Math.random() * 8) + 10);
        calculateHealth();
    }
    
    public void getAll()
    {
        System.out.println("Str: " + getStr());
        System.out.println("Dex: " + getDex());
        System.out.println("Com: " + getCon());
        System.out.println("Intel: " + getIntel());
        System.out.println("Wis: " + getWis());
        System.out.println("Cha: " + getCha());
        System.out.println("Hea: " + getHea());
    }
}