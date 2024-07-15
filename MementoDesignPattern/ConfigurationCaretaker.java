package LowLevelDesign.vamsiPractise.MementoDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {
    List<ConfigurationMemento> configurationMementoList = new ArrayList<ConfigurationMemento>();

    public void addMemento(ConfigurationMemento memento) {
        configurationMementoList.add(memento);
    }

    public ConfigurationMemento undoMemento(){
        if(!configurationMementoList.isEmpty()){
            ConfigurationMemento configurationMemento = configurationMementoList.getLast();
            configurationMementoList.removeLast();
            return configurationMemento;
        }
        return null;
    }
}
