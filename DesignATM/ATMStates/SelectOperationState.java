package LowLevelDesign.vamsiPractise.DesignATM.ATMStates;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;
import LowLevelDesign.vamsiPractise.DesignATM.Card;
import LowLevelDesign.vamsiPractise.DesignATM.TransactionType;

public class SelectOperationState extends ATMState {

    public SelectOperationState(){
        showOperations();
    }

    private void showOperations() {
        System.out.println("Select an Operation from below");
        TransactionType.showAllTransactionTypes();
    }


    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txnType) {
        if(txnType == TransactionType.CASH_WITHDRAWL){
            atm.setCurrentATMState(new CashWithdrawlState());
        }else{
            atm.setCurrentATMState(new CashWithdrawlState());
        }
    }
}
