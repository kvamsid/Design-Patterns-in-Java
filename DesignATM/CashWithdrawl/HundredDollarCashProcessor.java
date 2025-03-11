package LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;

public class HundredDollarCashProcessor extends CashProcessor {

    int denomination = 100;
    public HundredDollarCashProcessor(CashProcessor nextProcessor){
        super(nextProcessor);
    }

    public void withdraw(ATM atm, int amount){
        int required = amount/denomination;
        int balance = amount % denomination;
        int currCount = atm.getNoOfHundredBills();
        if(required <= currCount){
            atm.deductHundredBills(required);
        }else{
            atm.deductHundredBills(currCount);
            balance = balance + (required - currCount);
        }

        if(balance > 0){
            super.withdraw(atm, balance);
        }
    }
}
