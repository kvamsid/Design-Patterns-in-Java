package LowLevelDesign.vamsiPractise.VisitorDesignPattern;

public class Main {
    public static void main(String[] args){
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomElement deluxeRoom = new DeluxeRoom();

        RoomVisitor roomPrice = new RoomPricingVisitor();
        RoomVisitor roomMaintenance = new RoomMaintenanceVisitor();

        singleRoom.accept(roomPrice);
        doubleRoom.accept(roomPrice);
        deluxeRoom.accept(roomPrice);
        singleRoom.accept(roomMaintenance);
        doubleRoom.accept(roomMaintenance);
        deluxeRoom.accept(roomMaintenance);
    }
}
