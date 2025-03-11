package LowLevelDesign.vamsiPractise.SnakeandLadderGame;

public class SnakeCell implements SpecialCell{

    public int start;
    public int end;

    SnakeCell(int start, int end){
        this.start = start;
        this.end = end;
    }


    @Override
    public boolean checkIfStart(int pos) {
        return start == pos;
    }

    @Override
    public int getEndPosition() {
        return end;
    }
}
