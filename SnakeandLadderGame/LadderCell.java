package LowLevelDesign.vamsiPractise.SnakeandLadderGame;

public class LadderCell implements SpecialCell{
    public int start;
    public int end;
    public LadderCell(int start, int end){
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
