package LowLevelDesign.vamsiPractise.UNDO_REDO_Command_Design_Pattern;
import java.util.Stack;

public class Invoker {
    Stack<ICommand> myStack = new Stack<>();
    ICommand command;
    public Invoker() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
        myStack.add(command);
    }
    public void undo() {
        if (!myStack.isEmpty()) {
            ICommand lastCommand = myStack.pop();
            lastCommand.undo();
        }
    }
}
