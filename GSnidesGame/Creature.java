
/**
 * Creates a template for a creature
 * 
 * @Joshua Spergel
 * @v5.23.18
 */
public abstract class Creature
{
    // instance variables - replace the example below with your own
    private int str; // strength
    private int dex; // dexterity
    private int con; // constitution
    private int intel; // intelligence
    private int wis; // wisdom
    private int cha; // charisma
    private int hea; // health
    private Weapon wep; // character's weapon
    private int def; // the chance the player will see
    private int bns; // damage bonus
    /**
     * The following are the modifier and accessor codes for the various variables
     */
    public int getStr() {return str;}
    public void changeStr(int newStr){ str = newStr;}
    
    public int getDex() {return dex;}
    public void changeDex(int newDex){ dex = newDex;}
    
    public int getCon() {return con;}
    public void changeCon(int newCon){ con = newCon;}
    
    public int getIntel() {return intel;}
    public void changeIntel(int newIntel){ intel = newIntel;}
    
    public int getWis() {return wis;}
    public void changeWis(int newWis){ wis = newWis;}
    
    public int getCha() {return cha;}
    public void changeCha(int newCha){ cha = newCha;}
    
    public int getHea() {return hea;}
    public void changeHea(int newHea){ hea = newHea;}
    public void calculateHealth() {hea = (str + con);}// this calculates the health for the players
    public int attack()// this is the calculation for the random damage the player or enemy deals
    {
        return ((int)(Math.random() * wep.getDamage()) + 1) + getStr() / 10;
    }
    /*
     * this calculates the chance a character will block
     * For example: A character might only know of two positions the enemy will attack so they
     * will have a 50% chance to block it
     */
    public int calculateDef(){ //
        int ran = (int)(Math.random() * 3);
        int def1 = 4 - (int)((ran) + ((getDex() - 10) / 4));
        def = def1;
        return def1;
    }
    public void getNewWeapon(Weapon newWep){ wep = newWep;}
    public int dealDamage()
    {
        return wep.getDamage() + bns;
    }
}