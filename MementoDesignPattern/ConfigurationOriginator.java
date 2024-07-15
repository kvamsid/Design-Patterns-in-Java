package LowLevelDesign.vamsiPractise.MementoDesignPattern;

public class ConfigurationOriginator {
    Configuration config;
    public ConfigurationOriginator(Configuration config) {
        this.config = config;
    }
    public void setConfiguration(Configuration config) {
        this.config = config;
    }

    public String getConfigName() {
        return config.getName();
    }

    public int getConfigVersion(){
        return config.getVersion();
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.config);
    }

    public void reStoreConfiguration(ConfigurationMemento memento){
        this.config = memento.configuration;
    }
}
