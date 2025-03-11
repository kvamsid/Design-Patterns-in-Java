package LowLevelDesign.vamsiPractise.InterpreterDesignPattern;

import LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_2.ArithmeticExpression;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.put("a", 5);
        context.put("b", 6);
        context.put("c", 7);
        context.put("d", 8);

        Expression expression = new BinaryNonTerminalExpression(new BinaryNonTerminalExpression(new TerminalExpression("a"), new TerminalExpression("b"), '*'),
                new BinaryNonTerminalExpression(new TerminalExpression("c"), new TerminalExpression("d"), '*'), '+');

        System.out.println(expression.interpret(context));
    }
}
