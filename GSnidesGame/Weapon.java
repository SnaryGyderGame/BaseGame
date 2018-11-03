
/**
 * This is a weapon that the characters can use
 * Both enemies and players can use this
 * 
 * @Joshua Spergel 
 * @v6.14.18
 */
public class Weapon
{
    // instance variables - replace the example below with your own
    private int damage;
    private String name;

    /**
     * Constructor for objects of class Weapon with nothing
     */
    public Weapon()
    {
        // initialise instance variables
        damage = 1;
    }
    /**
     * Constructor for objects of class Weapon with both a name and the amount of damage it deals
     */
    public Weapon(int damage1, String name1)
    {
        damage = damage1;
        name = name1;
    }
    public int getDamage(){ return damage;} // returns the damage
    public String returnName(){return name;} // returns the name of the weapon
}