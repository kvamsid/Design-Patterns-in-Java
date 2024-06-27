package LowLevelDesign.vamsiPractise.CompositeDesignPattern.Implementation_2;

public class Number implements ArithmeticExpression {
     int num;
     public Number(int num){
         this.num = num;
     }

     public int calculate(){
         System.out.println("Number is "+num);
         return num;
     }
}
