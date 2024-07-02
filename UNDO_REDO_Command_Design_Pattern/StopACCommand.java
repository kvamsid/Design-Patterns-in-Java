package LowLevelDesign.vamsiPractise.UNDO_REDO_Command_Design_Pattern;

public class StopACCommand implements ICommand{

    AirConditioner Ac;
    public StopACCommand(AirConditioner ac) {
        this.Ac = ac;
    }

    @Override
    public void execute() {
        Ac.reduceCooling();
    }

    @Override
    public void undo(){
        Ac.startCooling();
    }

    @Override
    public void redo(){
        execute();
    }
}
