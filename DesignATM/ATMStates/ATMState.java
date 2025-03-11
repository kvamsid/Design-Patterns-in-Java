package LowLevelDesign.vamsiPractise.DesignATM.ATMStates;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;
import LowLevelDesign.vamsiPractise.DesignATM.Card;
import LowLevelDesign.vamsiPractise.DesignATM.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card){
        System.out.println("This Action is not allowed");
    }

    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("This Action is not allowed");
    }

    public void selectOperation(ATM atm, Card card, TransactionType txnType){
        System.out.println("This Action is not allowed");
    }

    public void cashWithdrawl(ATM atm, Card card, int amount){
        System.out.println("This Action is not allowed");
    }

    public void checkBalance(ATM atm, Card card){
        System.out.println("This Action is not allowed");
    }

    public void returnCard(){
        System.out.println("This Action is not allowed");
    }

    public void exit(ATM atm){
        System.out.println("This Action is not allowed");
    }
}
