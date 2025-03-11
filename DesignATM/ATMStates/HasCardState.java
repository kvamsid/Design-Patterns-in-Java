package LowLevelDesign.vamsiPractise.DesignATM.ATMStates;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;
import LowLevelDesign.vamsiPractise.DesignATM.Card;

public class HasCardState extends ATMState {

    @Override
    public void authenticatePin(ATM atm, Card card, int pin){
        if(card.isCorrectPin(pin)){
            atm.setCurrentATMState(new SelectOperationState());
        }else{
            exit(atm);
        }
    }
    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

}
