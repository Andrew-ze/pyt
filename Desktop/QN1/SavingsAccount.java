public class SavingsAccount extends Account {
    private double rate;
    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }
    public boolean withdraw(double amount) {
        if (amount > balance) return false;   // can't go below 0
        balance -= amount;
        return true;
    }
    public void addInterest() { balance += balance * rate / 100; }
}