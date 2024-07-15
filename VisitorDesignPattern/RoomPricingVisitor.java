package LowLevelDesign.vamsiPractise.VisitorDesignPattern;

public class RoomPricingVisitor implements RoomVisitor {

    @Override
    public void visit(SingleRoom singleRoom){
        singleRoom.roomPrice = 1000;
        System.out.println("Room Price for single room is " +singleRoom.roomPrice);
    }

    @Override
    public void visit(DoubleRoom doubleRoom){
        doubleRoom.roomPrice = 2000;
        System.out.println("Room Price for double room is " +doubleRoom.roomPrice);
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom){
        deluxeRoom.roomPrice = 5000;
        System.out.println("Room Price for deluxe room is " +deluxeRoom.roomPrice);
    }
}
