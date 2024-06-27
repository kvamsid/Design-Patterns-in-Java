package LowLevelDesign.vamsiPractise.AdapterDesignPattern.Client;

import LowLevelDesign.vamsiPractise.AdapterDesignPattern.Adaptee.WeightMachine;
import LowLevelDesign.vamsiPractise.AdapterDesignPattern.Adaptee.WeightMachineConcrete;
import LowLevelDesign.vamsiPractise.AdapterDesignPattern.Adapter.WeightMachineAdapter;
import LowLevelDesign.vamsiPractise.AdapterDesignPattern.Adapter.WeightMachineAdapterImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachine = new WeightMachineAdapterImpl(new WeightMachineConcrete());
        System.out.println(weightMachine.getWeightInKgs());

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
