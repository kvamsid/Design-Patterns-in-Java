package LowLevelDesign.vamsiPractise.UNDO_REDO_Command_Design_Pattern;

public class StartACCommand implements ICommand{

    AirConditioner Ac;
    public StartACCommand(AirConditioner ac){
        this.Ac = ac;
    }

    @Override
    public void execute(){
        Ac.startCooling();
    }

    @Override
    public void undo(){
        Ac.reduceCooling();
    }

    @Override
    public void redo(){
        execute();
    }
}
