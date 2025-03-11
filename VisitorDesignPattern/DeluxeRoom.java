package LowLevelDesign.vamsiPractise.VisitorDesignPattern;

public class DeluxeRoom implements RoomElement{
    int roomPrice = 0;
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
