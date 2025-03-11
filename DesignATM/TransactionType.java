package LowLevelDesign.vamsiPractise.DesignATM;

public enum TransactionType {
    CASH_WITHDRAWL,
    CHECK_BALANCE;

    public static void showAllTransactionTypes(){

        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }
}
