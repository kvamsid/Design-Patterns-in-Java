package LowLevelDesign.vamsiPractise.TicTacToeLLD;

public class Board {
    int size;
    PlayingPiece[][] board;

    Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }
    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].type.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

    public boolean addPiece(PlayingPiece piece, int i, int j){
        if(board[i][j] != null) {
            return false;
        }else{
            board[i][j] = piece;
            return true;
        }
    }

    public boolean isFilled(){
        for(int i = 0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == null) {
                    return false;
                }
            }
        }
        return true;
    }
}
