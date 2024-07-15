package LowLevelDesign.vamsiPractise.VisitorDesignPattern;

public class RoomMaintenanceVisitor implements RoomVisitor{

    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Maintenance done for single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Maintenance done for double room");
    }

    @Override
    public void visit(DeluxeRoom deluxeRoom) {
        System.out.println("Maintenance done for deluxe room");
    }
}
