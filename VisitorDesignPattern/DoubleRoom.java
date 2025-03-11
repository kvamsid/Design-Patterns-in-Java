package LowLevelDesign.vamsiPractise.VisitorDesignPattern;

public class DoubleRoom implements RoomElement{
    int roomPrice = 0;
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
