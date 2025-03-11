package LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_2;



public class Main {
    public static void main(String[] args) {
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression three = new Number(3);
        ArithmeticExpression four = new Number(4);
        ArithmeticExpression exp1 = new Expression(three, four, Operation.ADD);
        ArithmeticExpression exp2 = new Expression(two, exp1, Operation.MULTIPLY);
        exp2.calculate();
    }
}
