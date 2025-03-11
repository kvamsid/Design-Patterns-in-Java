package LowLevelDesign.vamsiPractise.AdapterDesignPattern.Adapter;

import LowLevelDesign.vamsiPractise.AdapterDesignPattern.Adaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {
    WeightMachine weightMachine;
    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    public double getWeightInKgs(){
        double answer = weightMachine.getWeightInPounds();
        return answer* 0.45;
    }
}
