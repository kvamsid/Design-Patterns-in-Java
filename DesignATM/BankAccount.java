package LowLevelDesign.vamsiPractise.DesignATM;

public class BankAccount {
    int balance;

    public void deductBalance(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
