package LowLevelDesign.vamsiPractise.DesignATM;

import LowLevelDesign.vamsiPractise.DesignATM.ATMStates.ATMState;
import LowLevelDesign.vamsiPractise.DesignATM.ATMStates.IdleState;

public class ATM {

    private static ATM atmObject = new ATM(); //Singleton: eager initialization

    ATMState currentATMState;

    private int atmBalance;
    int noOfHundredBills;
    int noOfFiftyBills;
    int noOfTenBills;


    private ATM() {
    }

    public void setCurrentATMState(ATMState currentATMState) {
        this.currentATMState = currentATMState;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public static ATM getATMObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }

    public int getATMBalance() {
        return atmBalance;
    }

    public void setAtmBalance(int atmBalance, int noOfHundredBills, int noOfFiftyBills, int noOfTenBills) {
        this.atmBalance = atmBalance;
        this.noOfHundredBills = noOfHundredBills;
        this.noOfFiftyBills = noOfFiftyBills;
        this.noOfTenBills = noOfTenBills;
    }

    public int getNoOfHundredBills() {
        return noOfHundredBills;
    }

    public int getNoOfFiftyBills() {
        return noOfFiftyBills;
    }

    public int getNoOfTenBills() {
        return noOfTenBills;
    }

    public void deductATMBalance(int amount) {
        atmBalance = atmBalance - amount;
    }

    public void deductHundredBills(int number) {
        noOfHundredBills = noOfHundredBills - number;
    }

    public void deductFiftyBills(int number) {
        noOfFiftyBills = noOfFiftyBills - number;
    }

    public void deductTenBills(int number) {
        noOfTenBills = noOfTenBills - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("100Bills: " + noOfHundredBills);
        System.out.println("50Bills: " + noOfFiftyBills);
        System.out.println("10Bills: " + noOfTenBills);

    }
}

