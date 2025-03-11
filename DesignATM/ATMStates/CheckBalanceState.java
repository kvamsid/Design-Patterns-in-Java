package LowLevelDesign.vamsiPractise.DesignATM.ATMStates;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;
import LowLevelDesign.vamsiPractise.DesignATM.Card;

public class CheckBalanceState extends ATMState {

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("Your current Balance is :" + card.getBalance());
        exit(atm);
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit from ATM");
    }

    @Override
    public void returnCard() {
        System.out.println("Return card");
    }
}
