package LowLevelDesign.vamsiPractise.FlyWeightDesignPattern;

public class RoboticDog implements IRobot{
    private String type;
    private Sprites sprites;

    public RoboticDog(String type, Sprites sprites) {
        this.type = type;
        this.sprites = sprites;
    }

    public String getType() {
        return type;
    }
    public Sprites getSprites() {
        return sprites;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Robotic Dog at "+ x + " " + y);
    }
}
