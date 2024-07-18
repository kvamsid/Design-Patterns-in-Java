package LowLevelDesign.vamsiPractise.InterpreterDesignPattern;

import LowLevelDesign.vamsiPractise.MementoDesignPattern.ConfigurationMemento;

public class TerminalExpression implements Expression {
    String terminal;
    public TerminalExpression(String terminal) {
        this.terminal = terminal;
    }
    @Override
    public int interpret(Context context){
        return context.get(this.terminal);
    }
}
