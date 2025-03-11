package LowLevelDesign.vamsiPractise.SnakeandLadderGame;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Game {

    Board board;
    Dice dice;
    Deque<Player> players;
    Player winner;
    int max;
    public Game() {
        board = new Board(10, 5, 5);
        max = board.boardSize*board.boardSize;
        dice = new Dice(1);
        players = new LinkedList<>();
        winner = null;
        addPlayers();
    }

    public void addPlayers(){
        Player player1 = new Player("Vamsi", 0);
        Player player2 = new Player("Pranathi", 0);
        players.add(player1);
        players.add(player2);
    }

    public void startGame(){

        while(winner == null){
            Player currentPlayer = players.removeFirst();
            System.out.println("player turn is:" + currentPlayer.playerName + " current position is: " + currentPlayer.currentPosition);
            int move = dice.rollDice();
            int playerPosition = currentPlayer.currentPosition+move;
            playerPosition = specialPosition(playerPosition);
            if(playerPosition == max){
                System.out.println(currentPlayer.playerName + " won!!!");
                winner = currentPlayer;
            }else if(playerPosition > max){
                System.out.println("Player is going out of bounds, try again!!");
            }else{
                currentPlayer.currentPosition = playerPosition;
                System.out.println("player turn is:" + currentPlayer.playerName + " new Position is: " + playerPosition);
            }
            players.addLast(currentPlayer);
        }
    }

    private int specialPosition (int playerNewPosition) {
        if(playerNewPosition > board.boardSize* board.boardSize-1 ){
            return playerNewPosition;
        }
        Cell cell = board.getCell(playerNewPosition);
        if(cell.specialCell != null && cell.specialCell.checkIfStart(playerNewPosition)) {
            int endPos = cell.specialCell.getEndPosition();
            if(endPos > playerNewPosition){
                System.out.println("Going up by the Ladder :)");
            }else{
                System.out.println("Eaten By Snake :(");
            }
            return endPos;
        }
        return playerNewPosition;
    }

}
