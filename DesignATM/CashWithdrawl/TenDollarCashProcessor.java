package LowLevelDesign.vamsiPractise.DesignATM.CashWithdrawl;

import LowLevelDesign.vamsiPractise.DesignATM.ATM;

public class TenDollarCashProcessor extends CashProcessor {

    int denomination = 10;
    public TenDollarCashProcessor(CashProcessor nextProcessor){
        super(nextProcessor);
    }

    public void withdraw(ATM atm, int amount){
        int required = amount/denomination;
        int balance = amount % denomination;
        int currCount = atm.getNoOfTenBills();
        if(required <= currCount){
            atm.deductTenBills(required);
        }else{
            atm.deductTenBills(currCount);
            balance = balance + (required - currCount);
        }

        if(balance > 0){
            super.withdraw(atm, balance);
        }
    }
}
