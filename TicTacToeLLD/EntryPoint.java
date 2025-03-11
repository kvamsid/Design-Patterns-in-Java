package LowLevelDesign.vamsiPractise.TicTacToeLLD;

public class EntryPoint {

    public static void main(String[] args){
        Game ticTacToe = new Game(3);
        System.out.println(ticTacToe.startGame());
    }
}
