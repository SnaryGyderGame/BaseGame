
/**
 * This is the code for a potential fight between the player and the enemy
 * 
 * @Joshua Spergel
 * @v6.14.18
 */
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class Fight
{
    // instance variables - replace the example below with your own
    private Creature mainCrea;
    private Creature enemy;
    /**
     * Constructor for objects of class Fight
     */
    public Fight(Creature alliedCreature, Creature enemy1)
    {
        mainCrea = alliedCreature;
        
        Weapon orcBlade = new Weapon( 4, "Blade");
        enemy1.getNewWeapon(orcBlade);
        enemy = enemy1;
    }
    public int getEnemyDirection(){ return (int)(Math.random() * 3) + 1;}//gives a random direction for the enemy 
    public int playerOptions()//prints out the various parts the player might defend or atack
    {
        System.out.println("Please enter where you want to perform this action");
        System.out.println("Press 1 for head");
        System.out.println("Press 2 for upper torso");
        System.out.println("Press 3 for lower torso");
        System.out.println("Press 4 for legs");
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        return sc.nextInt();
    }
    public boolean defendLine()//gives us what happens for the text part of defending
    {
        List<String> positions = Arrays.asList("head", "upper torso", "lower torso", "legs");;
        System.out.println("defend");
        System.out.println("The enemy is attacking your" + positions.get((int)Math.random() * 3));//gets a random part
        System.out.println("");
        int numOfPos = mainCrea.calculateDef();
        return true;
    }
    public int playerDefense()//gets the players chance to defend
    {
        defendLine();
        int numLeft = 4 - mainCrea.calculateDef();//this calculates the chance the player
        if(((int)Math.random() * numLeft) < 1){//there is a variable chance that the player will block the enemy
            int dmg = enemy.attack();
            mainCrea.changeHea(mainCrea.getHea() - dmg);
            return dmg;
        }
        else 
        {
            System.out.println("You have blocked the enemy!");
            return 0;
        }
    }
    public int AttackLine()// calls the rest of the attack section(just text section, no math)
    {
        System.out.println("attack");
        System.out.println("");
        return playerOptions();
    }
    public int playerAttack()// is the larger scale call for AttackLine & other parts of the code.
    {
        AttackLine();
        if(Math.random() > .75) //there is a 25% chance that the enemy will block the player
        {
            System.out.println("The enemy has blocked you!");
            return 0;
        }
        int dmg = mainCrea.attack(); // gets the damage from the main character's weapon
        enemy.changeHea(enemy.getHea() - dmg); // changes the enemy's remaining health
        return dmg;
    }
    /**
     * This is the battle sequence at the highest leve
     * First it calls for the player to hit a part of the enemy
     * Then it calls for the enemy to try to hit the palyer
     */
    public int sample()
    {
        while(true){
            int dmg1 = playerAttack();//gets the damage that the player will dea
            System.out.println("You dealt " + dmg1 + " damage!"); // gets the damage dealt
            System.out.println("The orc has " + enemy.getHea() + " remaining"); // gets the enemy's remaining health
            System.out.println("");
            if(enemy.getHea() < 0) return 1; // player wins
            int dmg2 = playerDefense(); // checks if the player gets damage or not
            System.out.println("The enemy dealt " + dmg2 + " damage!");// gets the damage dealt
            System.out.println("You have " + mainCrea.getHea() + " remaining");// gets the player's remaining health
            System.out.println("");
            if(mainCrea.getHea() < 0) return -1; // player loses
        }
        
    }
}