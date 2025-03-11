package LowLevelDesign.vamsiPractise.SnakeandLadderGame;

import java.util.Random;

public class Board {

    public int boardSize;
    public int snakeCount;
    public int ladderCount;
    Cell[][] board;
    Random rand = new Random();
    public Board(int boardSize, int snakeCount, int ladderCount) {
        this.boardSize = boardSize;
        this.snakeCount = snakeCount;
        this.ladderCount = ladderCount;
        initializeCells();
        addSnakesAndLadders();
    }

    public void initializeCells() {
        board = new Cell[boardSize][boardSize];
        for(int i = 0;i<boardSize;i++) {
            for(int j = 0;j<boardSize;j++) {
                Cell cell = new Cell();
                board[i][j] = cell;
            }
        }
    }
    public void addSnakesAndLadders() {

        int max = boardSize*boardSize;
        int currSnake = 0;
        int currLadder = 0;
        while(currSnake < snakeCount) {
            int snakeStart = rand.nextInt(1, max-1);
            int snakeEnd = rand.nextInt(1, max-1);
            if(snakeStart <= snakeEnd){
                continue;
            }
            SpecialCell snake = new SnakeCell(snakeStart, snakeEnd);
            Cell snakeCell = getCell(snakeStart);
            snakeCell.specialCell = snake;
            currSnake++;
        }
        while(currLadder < ladderCount) {
            int ladderStart = rand.nextInt(1, max-1);
            int ladderEnd = rand.nextInt(1, max-1);
            if(ladderStart >= ladderEnd){
                continue;
            }
            SpecialCell ladder = new LadderCell(ladderStart, ladderEnd);
            Cell ladderCell = getCell(ladderStart);
            ladderCell.specialCell = ladder;
            currLadder++;
        }
    }

    public Cell getCell(int pos){
        int row = pos/boardSize;
        int col = pos%boardSize;
        return board[row][col];
    }
}
