package LowLevelDesign.vamsiPractise.InterpreterDesignPattern;

public class BinaryNonTerminalExpression implements Expression{
    Expression leftExpression;
    Expression rightExpression;
    char operator;
    public BinaryNonTerminalExpression(Expression leftExpression, Expression rightExpression, char operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }
    public int interpret(Context context){
        return switch (operator) {
            case '+' -> leftExpression.interpret(context) + rightExpression.interpret(context);
            case '-' -> leftExpression.interpret(context) - rightExpression.interpret(context);
            case '*' -> leftExpression.interpret(context) * rightExpression.interpret(context);
            default -> 0;
        };
    }
}
