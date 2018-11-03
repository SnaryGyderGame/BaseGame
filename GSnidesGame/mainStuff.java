
/**
 * Write a description of class mainStuff here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainStuff
{
    public static void main(String[] args)
    {
        Player character = new Player();
        Weapon sword = new Weapon(8, "sword");
        character.getNewWeapon(sword);
        mainGame game = new mainGame();
        boolean finished = false;
        while(finished == false)
        {
            game.displayRoom();
            room thisRoom = game.getCurrentRoom();
            if(thisRoom.isOrc() == 1)
            {
                System.out.println("There is an orc here! He comes to attack you!");
                Orc orcy = new Orc();
                Fight thisBattle = new Fight(character,orcy);
                int result = thisBattle.sample();
                if(result == -1)
                {
                    finished = true;
                }
                else 
                {
                    character.changeHea(character.getHea() + 5);
                    System.out.println("you find a carrot on the orc's body! You gain 5 health!");
                    game.killOrcInRoom(game.getCurrentRoomNum());
                }
            }
            if(thisRoom.isOrc() == -1)
            {
                System.out.println("There is a dead orc here!");
                
            }
            int num1 = game.getNum();
            if(num1 == 1)
            {
                if(game.getFloor().getSize() == game.getCurrentRoomNum() + 1)
                {
                    System.out.println("You have defeated the dungeon! The treasure is yours!");
                    finished = true;
                }
                
                else game.incrementRoom();
            }
            else if(num1 == 2)
            {
                if(game.getCurrentRoomNum() == 0) System.out.println("You can't wimp out now!");
                else game.decrementRoom();
            }
            else if(num1 == 3){game.displayRoom();}
            else character.getAll();
        }
    }
}