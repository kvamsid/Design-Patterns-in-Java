package LowLevelDesign.vamsiPractise.DesignATM.ATMStates;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;
import LowLevelDesign.vamsiPractise.DesignATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Insert card successful");
        atm.setCurrentATMState(new HasCardState());
    }

}
