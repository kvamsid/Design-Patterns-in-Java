package LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;

public class FiftyDollarCashProcessor extends CashProcessor {

    int denomination = 50;
    public FiftyDollarCashProcessor(CashProcessor nextProcessor){
        super(nextProcessor);
    }

    public void withdraw(ATM atm, int amount){
        int required = amount/denomination;
        int balance = amount % denomination;
        int currCount = atm.getNoOfFiftyBills();
        if(required <= currCount){
            atm.deductFiftyBills(required);
        }else{
            atm.deductFiftyBills(currCount);
            balance = balance + (required - currCount);
        }

        if(balance > 0){
            super.withdraw(atm, balance);
        }
    }
}
