package LowLevelDesign.vamsiPractise.PaymentGateway.Transaction;

import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentController;
import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentDO;

import java.util.*;

public class TransactionService {
    public static Map<Integer, List<Transaction>> userTransactionList = new HashMap<>();
    InstrumentController instrumentController;
    Processor processor;

    public TransactionService(){
        instrumentController = new InstrumentController();
        processor = new Processor();
    }

    public List<TransactionDO> getTransactionHistory(int userId){
        List<Transaction> transactions = userTransactionList.get(userId);
        List<TransactionDO> result = new ArrayList<>();
        for(Transaction transaction : transactions){
            result.add(convertTransaction(transaction));
        }
        return result;
    }

    public TransactionDO makePayment(TransactionDO transactionDO){
        InstrumentDO senderInstrumentDO = instrumentController.getInstrumentByID(transactionDO.getSenderId(), transactionDO.getDebitInstrumentId());
        InstrumentDO receiverInstrumentDO = instrumentController.getInstrumentByID(transactionDO.getReceiverId(), transactionDO.getCreditInstrumentId());
        processor.processPayment(senderInstrumentDO, receiverInstrumentDO);
        Transaction transaction = new Transaction();
        transaction.setTxnId((int) new Random().nextInt(100-10)+10);
        transaction.setAmount(transactionDO.getAmount());
        transaction.setCreditInstrumentId(transactionDO.getCreditInstrumentId());
        transaction.setReceiverId(transactionDO.getReceiverId());
        transaction.setTransactionStatus(TransactionStatus.ACCEPTED);
        transaction.setSenderId(transactionDO.getSenderId());
        transaction.setDebitInstrumentId(transactionDO.getDebitInstrumentId());
        List<Transaction> senderList = userTransactionList.get(transactionDO.getSenderId());
        if(senderList == null){
            senderList = new ArrayList<>();
        }
        senderList.add(transaction);
        userTransactionList.put(transaction.getSenderId(), senderList);
        List<Transaction> receiverList = userTransactionList.get(transactionDO.getReceiverId());
        if(receiverList == null){
            receiverList = new ArrayList<>();
        }
        receiverList.add(transaction);
        userTransactionList.put(transaction.getReceiverId(), receiverList);
        return convertTransaction(transaction);
    }

    private TransactionDO convertTransaction(Transaction transaction){
        TransactionDO result = new TransactionDO();
        result.setTransactionID(transaction.getTxnId());
        result.setAmount(transaction.getAmount());
        result.setCreditInstrumentId(transaction.getCreditInstrumentId());
        result.setReceiverId(transaction.getReceiverId());
        result.setTxnStatus(transaction.getTransactionStatus());
        result.setSenderId(transaction.getSenderId());
        result.setDebitInstrumentId(transaction.getDebitInstrumentId());
        return result;
    }
}
