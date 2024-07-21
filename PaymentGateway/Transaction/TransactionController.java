package LowLevelDesign.vamsiPractise.PaymentGateway.Transaction;

import java.util.List;

public class TransactionController {
    TransactionService transactionService;
    public TransactionController() {
        transactionService = new TransactionService();
    }

    public TransactionDO makePayment(TransactionDO transactionDO) {
        return transactionService.makePayment(transactionDO);
    }

    public List<TransactionDO> getTransactionHistory(int userId){
        return transactionService.getTransactionHistory(userId);
    }
}
