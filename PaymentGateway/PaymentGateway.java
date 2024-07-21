package LowLevelDesign.vamsiPractise.PaymentGateway;

import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.BankInstrument;
import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentController;
import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentDO;
import LowLevelDesign.vamsiPractise.PaymentGateway.Instrument.InstrumentType;
import LowLevelDesign.vamsiPractise.PaymentGateway.Transaction.TransactionController;
import LowLevelDesign.vamsiPractise.PaymentGateway.Transaction.TransactionDO;
import LowLevelDesign.vamsiPractise.PaymentGateway.User.User;
import LowLevelDesign.vamsiPractise.PaymentGateway.User.UserController;
import LowLevelDesign.vamsiPractise.PaymentGateway.User.UserDO;

import java.util.List;

public class PaymentGateway {
    public static void main(String[] args){
        InstrumentController instrumentController = new InstrumentController();
        TransactionController transactionController = new TransactionController();
        UserController userController = new UserController();

        // Adding User1 to User list
        UserDO user1 = new UserDO();
        user1.setUserName("Vamsi");
        user1.setMail("vamsi@gmail.com");
        UserDO senderDetails = userController.addUser(user1);
        System.out.println("User-1 added with user Id: "+ senderDetails.getUserId()+ " "+ senderDetails.getUserName());

        //Adding User2 to User List
        UserDO user2 = new UserDO();
        user2.setUserName("Pranathi");
        user2.setMail("pranathi@gmail.com");
        UserDO receiverDetails = userController.addUser(user2);
        System.out.println("User-2 added with user Id: "+ receiverDetails.getUserId()+ " "+ receiverDetails.getUserName());

        // Adding Instrument1 for User1
        InstrumentDO instrumentDO1 = new InstrumentDO();
        instrumentDO1.setBankAccountNumber("123456789");
        instrumentDO1.setIfsc("12345");
        instrumentDO1.setUserId(senderDetails.getUserId());
        instrumentDO1.setInstrumentType(InstrumentType.BANK);
        InstrumentDO senderInstrument = instrumentController.addInstrument(instrumentDO1);
        System.out.println("Bank Account Added for User1: "+ senderInstrument.getInstrumentId());

        // Adding Instrument1 for User2
        InstrumentDO instrumentDO2 = new InstrumentDO();
        instrumentDO2.setBankAccountNumber("987654321");
        instrumentDO2.setIfsc("54321");
        instrumentDO2.setUserId(receiverDetails.getUserId());
        instrumentDO2.setInstrumentType(InstrumentType.BANK);
        InstrumentDO receiverInstrument = instrumentController.addInstrument(instrumentDO2);
        System.out.println("Bank Account Added for User2: "+ receiverInstrument.getInstrumentId());


        // Making a Payment
        TransactionDO transactionDO = new TransactionDO();
        transactionDO.setAmount(1000);
        transactionDO.setSenderId(senderDetails.getUserId());
        transactionDO.setReceiverId(receiverDetails.getUserId());
        transactionDO.setDebitInstrumentId(senderInstrument.getInstrumentId());
        transactionDO.setCreditInstrumentId(receiverInstrument.getInstrumentId());
        TransactionDO transaction = transactionController.makePayment(transactionDO);
        System.out.println("Transaction of amount " + transaction.getAmount() + " happened between Vamsi and Pranathi with txn id: "+ transaction.getTransactionID()+ " and the status of the transaction is "+ transaction.getTxnStatus());

        // Making a Second Payment
        TransactionDO transactionDO2 = new TransactionDO();
        transactionDO2.setAmount(500);
        transactionDO2.setSenderId(receiverDetails.getUserId());
        transactionDO2.setReceiverId(senderDetails.getUserId());
        transactionDO2.setDebitInstrumentId(receiverInstrument.getInstrumentId());
        transactionDO2.setCreditInstrumentId(senderInstrument.getInstrumentId());
        TransactionDO transaction2 = transactionController.makePayment(transactionDO2);
        System.out.println("Transaction of amount " + transaction2.getAmount() + " happened between Pranathi and Vamsi with txn id: "+ transaction2.getTransactionID()+ " and the status of the transaction is "+ transaction2.getTxnStatus());


        // Get all the Transactions for Vamsi
        List<TransactionDO> vamsiTransactions = transactionController.getTransactionHistory(senderDetails.getUserId());
        for(TransactionDO curr : vamsiTransactions){
            System.out.println("User " + curr.getSenderId()+ " with transactionID "+ curr.getTransactionID());
        }

        // Get all the Transactions for Pranathi
        List<TransactionDO> pranathiTransactions = transactionController.getTransactionHistory(senderDetails.getUserId());
        for(TransactionDO curr : pranathiTransactions){
            System.out.println("User " + curr.getSenderId()+ " with transactionID "+ curr.getTransactionID());
        }




    }
}
