package LowLevelDesign.vamsiPractise.MementoDesignPattern;

public class Configuration {
    String name;
    int version;
    public Configuration(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }
}
