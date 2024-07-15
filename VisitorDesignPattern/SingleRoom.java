package LowLevelDesign.vamsiPractise.VisitorDesignPattern;

public class SingleRoom implements RoomElement{
    int roomPrice = 0;
    public void accept(RoomVisitor visitor){
        visitor.visit(this);
    }
}
