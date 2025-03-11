package LowLevelDesign.vamsiPractise.SnakeandLadderGame;
import java.util.Random;
public class Dice {

    public int diceCount;
    Random rand = new Random();
    public int min = 1;
    public int max = 6;
    public Dice(int count){
        this.diceCount = count;
    }

    public int rollDice(){
        int total = 0;
        int diceRolled = 0;
        while(diceRolled < diceCount ){
            total += rand.nextInt(min, max);
            diceRolled++;
        }
        return total;
    }
}
