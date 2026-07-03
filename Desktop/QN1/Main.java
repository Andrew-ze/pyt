//Creates the objects and runs the methods
public class Main {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA001", 1000, 5);
        CurrentAccount ca = new CurrentAccount("CA001", 1000, 100);

        sa.withdraw(200);
        sa.addInterest();
        ca.withdraw(600);
        Customer c = new Customer("Salim");
        c.addAccount(sa);
        c.addAccount(ca);

        System.out.println(sa.generateStatement());
        System.out.println(ca.generateStatement());
        System.out.println("Total worth: " + c.totalWorth());
    }
}