package LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_2;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression left;
    ArithmeticExpression right;
    Operation operation;
    public Expression(ArithmeticExpression left, ArithmeticExpression right, Operation operation){
        this.left = left;
        this.right = right;
        this.operation = operation;
    }
    public int calculate(){
        int value = switch (operation) {
            case ADD -> left.calculate() + right.calculate();
            case SUBTRACT -> left.calculate() - right.calculate();
            case DIVIDE -> left.calculate() / right.calculate();
            case MULTIPLY -> left.calculate() * right.calculate();
        };
        System.out.println("Calculated Value is "+value);
        return value;
    }
}
