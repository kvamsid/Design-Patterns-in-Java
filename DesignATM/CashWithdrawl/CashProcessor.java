package LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;

public abstract class CashProcessor {
    CashProcessor nextProcessor;

    CashProcessor(CashProcessor nextProcessor){
        this.nextProcessor = nextProcessor;
    }

    public void withdraw(ATM atm, int amount){
        if(nextProcessor != null){
            nextProcessor.withdraw(atm, amount);
        }
    }

}
