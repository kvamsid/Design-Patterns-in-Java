package LowLevelDesign.vamsiPractise.UNDO_REDO_Command_Design_Pattern;

public interface ICommand {
    public abstract void execute();
    public abstract void undo();
    public abstract void redo();
}
