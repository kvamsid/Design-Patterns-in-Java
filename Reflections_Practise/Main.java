package LowLevelDesign.vamsiPractise.Reflections_Practise;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

//    public static void main(String[] args) {
//
//        Consumer<Integer> consumer = (Integer val) -> {
//            if(val > 100) {
//                System.out.println(val);
//            }
//        };
//
//        Supplier<Integer> supplier = () -> 1000;
//
//        Function<Integer, String> intToString = (Integer num)->{
//            return num.toString();
//        };
//
//        Predicate<Integer> check = (Integer i)->{
//            return i>100;
//        };
//
//
//        System.out.println(check.test(1900));
//
//        System.out.println(intToString.apply(100));
//
//        consumer.accept(10000);
//
//        System.out.println(supplier.get());
//    }


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class eagleClass = Eagle.class;
//        System.out.println(eagleClass.getName());
//        System.out.println(eagleClass.getModifiers());
//        System.out.println(eagleClass.getFields());
        //     \\\\\\\\\\\\\\\\  for methods
//        Method[] methods = eagleClass.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            System.out.println(method.getDeclaringClass());
//        }

        // \\\\\\\\\\\\\\ for public fields
//        Eagle eagle = new Eagle();
//        Field field = eagleClass.getDeclaredField("breed");
//        field.set(eagle, "breed set");
//        System.out.println(eagle.breed);

        // \\\\\\\\\\\\ for private fields
//        Eagle eagle = new Eagle();
//        Field field = eagleClass.getDeclaredField("canSwim");
//        field.setAccessible(true);
//        field.set(eagle, true);
//        if(field.getBoolean(eagle)){
//            System.out.println("value is set to be true ");
//        }

        //       \\\\\\\\\\\\ Private constructor accessed using Reflections

        Constructor[] eagleConstructors = eagleClass.getDeclaredConstructors();
        for(Constructor eagleConstructor : eagleConstructors) {
            eagleConstructor.setAccessible(true);
            Eagle eagleObj = (Eagle) eagleConstructor.newInstance();
            eagleObj.fly();
        }
    }
}
