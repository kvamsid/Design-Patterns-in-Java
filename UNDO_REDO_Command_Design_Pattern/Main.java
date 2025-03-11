package LowLevelDesign.vamsiPractise.UNDO_REDO_Command_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();

        Invoker invoker = new Invoker();

        invoker.setCommand(new StopACCommand(airConditioner));
        invoker.pressButton();
        invoker.undo();
    }
}
