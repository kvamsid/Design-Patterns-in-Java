package LowLevelDesign.vamsiPractise.MementoDesignPattern;

public class ConfigurationMemento {

    Configuration configuration;
    public ConfigurationMemento(Configuration configuration) {
        this.configuration = configuration;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
