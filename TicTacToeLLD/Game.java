package LowLevelDesign.vamsiPractise.TicTacToeLLD;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {

    Deque<Player> players;
    Board gameBoard;
    int size;
    Game(int boardSize){
        this.size = boardSize;
        this.gameBoard = new Board(size);
        this.players = new LinkedList<>();
        Player player1 = new Player("Pranathi", new PlayingPieceX());
        Player player2 = new Player("Vamsi", new PlayingPieceO());
        players.add(player1);
        players.add(player2);
    }

    public String startGame(){
        boolean noWinner = true;
        while(noWinner){
            boolean isFilled = gameBoard.isFilled();
            if(isFilled){
                break;
            }else{
                gameBoard.printBoard();
                Player playerToPlay = players.removeFirst();
                System.out.print("Player:" + playerToPlay.userName + " Enter row,column: ");
                Scanner inputScanner = new Scanner(System.in);
                String s = inputScanner.nextLine();
                String[] values = s.split(",");
                int inputRow = Integer.parseInt(values[0]);
                int inputColumn = Integer.parseInt(values[1]);
                boolean isAdded = gameBoard.addPiece(playerToPlay.playingPiece, inputRow, inputColumn);
                if(!isAdded){
                    players.addFirst(playerToPlay);
                    System.out.println("Incorrect position chosen, please try again");
                }else{
                    players.addLast(playerToPlay);
                    boolean winner = isGameDone(inputRow, inputColumn, playerToPlay.playingPiece.type);
                    if(winner){
                        gameBoard.printBoard();
                        return "We have a Winner and it is "+ playerToPlay.userName;
                    }
                }
            }
        }
        return "Game is Tied!!!!";
    }

    public boolean isGameDone(int row, int column, PieceType pieceType){
        boolean rowWin = true;
        boolean columnWin = true;
        boolean diagonalWin = true;
        boolean antiDiagonalWin = true;

        for(int i = 0;i<size;i++){
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].type != pieceType){
                rowWin = false;
                break;
            }
        }
        for(int i = 0;i<size;i++){
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].type != pieceType){
                columnWin = false;
                break;
            }
        }
        for(int i = 0, j=0;i<size;i++, j++){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType){
                diagonalWin = false;
                break;
            }
        }
        for(int i = 0, j = size-1;i<size;i++, j--){
            if(gameBoard.board[i][j] == null || gameBoard.board[i][j].type != pieceType){
                antiDiagonalWin = false;
                break;
            }
        }

        return rowWin || columnWin || diagonalWin || antiDiagonalWin;
    }
}
