package LowLevelDesign.vamsiPractise.FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {
    private static Map<String, IRobot> robotMap = new HashMap<String, IRobot>();

    public static IRobot createRobot(String robotType){
        if(robotMap.containsKey(robotType)) {
            return robotMap.get(robotType);
        }else{
            if(robotType.equalsIgnoreCase("HUMANOID")){
                Sprites sprites = new Sprites();
                HumanoidRobot humanoidRobot = new HumanoidRobot(robotType, sprites);
                robotMap.put(robotType, humanoidRobot);
            }else{
                Sprites sprites = new Sprites();
                RoboticDog dogRobot = new RoboticDog(robotType, sprites);
                robotMap.put(robotType, dogRobot);
            }
        }
        return robotMap.get(robotType);
    }
}
