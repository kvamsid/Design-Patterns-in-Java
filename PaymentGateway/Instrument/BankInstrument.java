package LowLevelDesign.vamsiPractise.PaymentGateway.Instrument;

public class BankInstrument extends Instrument{
    String bankAccount;
    String IFSCNo;


    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getIFSCNo() {
        return IFSCNo;
    }

    public void setIFSCNo(String IFSCNo) {
        this.IFSCNo = IFSCNo;
    }
}
