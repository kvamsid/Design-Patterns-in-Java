package LowLevelDesign.vamsiPractise.DesignATM.ATMStates;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;
import LowLevelDesign.vamsiPractise.DesignATM.Card;
import LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl.CashProcessor;
import LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl.FiftyDollarCashProcessor;
import LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl.HundredDollarCashProcessor;
import LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl.TenDollarCashProcessor;

public class CashWithdrawlState extends ATMState {

    public CashWithdrawlState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    @Override
    public void cashWithdrawl(ATM atm, Card card, int withdrawalAmount) {
        if(atm.getATMBalance() < withdrawalAmount) {
            System.out.println("Insufficient Balance in ATM");
            exit(atm);
        }else if(card.getBalance() < withdrawalAmount){
            System.out.println("Insufficient Balance in Account");
            exit(atm);
        }else{
            card.deductBalance(withdrawalAmount);
            atm.deductATMBalance(withdrawalAmount);
            CashProcessor cashProcessor = new HundredDollarCashProcessor(new FiftyDollarCashProcessor(new TenDollarCashProcessor(null)));
            cashProcessor.withdraw(atm, withdrawalAmount);
            exit(atm);
        }
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
