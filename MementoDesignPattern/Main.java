package LowLevelDesign.vamsiPractise.MementoDesignPattern;

public class Main {

    public static void main(String[] args) {
        ConfigurationCaretaker configCareTaker = new ConfigurationCaretaker();

        // Create a Configuration
        Configuration config = new Configuration("First", 2024);
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(config);

        // Add a Memento and save it
        ConfigurationMemento configurationMemento = configurationOriginator.createMemento();

        // Add it to the history
        configCareTaker.addMemento(configurationMemento);

        // Again create a new configuration
        configurationOriginator.setConfiguration(new Configuration("Second", 2025));

        // Add a Memento and save it
        ConfigurationMemento configurationMemento2 = configurationOriginator.createMemento();

        // Add it to the history
        configCareTaker.addMemento(configurationMemento2);

        // Mistakenly added a wrong Configuration
        configurationOriginator.setConfiguration(new Configuration("Third", 2038));


        // Reverting Back using UNDO functionality
        ConfigurationMemento reStoreMemento = configCareTaker.undoMemento();
        configurationOriginator.reStoreConfiguration(reStoreMemento);

        System.out.println(configurationOriginator.getConfigName() + " -> " + configurationOriginator.getConfigVersion());

    }
}
