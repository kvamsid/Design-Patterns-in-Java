package LowLevelDesign.vamsiPractise.DesignATM;

public class Card {
    private int cardNumber;
    static int PIN = 241299;
    private int cvv;
    BankAccount bankAccount;

    public boolean isCorrectPin(int pin){
        if(pin == PIN){
            System.out.println("User Authenticated successfully!!!");
            return true;
        }
        return false;
    }

    public int getBalance(){
        return bankAccount.getBalance();
    }

    public void deductBalance(int amount){
        bankAccount.deductBalance(amount);
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }
}
