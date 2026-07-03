public class CurrentAccount extends Account {
    private double overdraft;
    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }
    public boolean withdraw(double amount) {
        if (balance - amount < -overdraft) return false;  // beyond overdraft limit
        balance -= amount;
        return true;
    }
}