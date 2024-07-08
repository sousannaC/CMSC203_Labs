package Lab6;

public class CheckingAccount extends BankAccount {
    // Static constant representing the cost of clearing one check
    public static final double FEE = 0.15; // 15 cents

    // Constructor taking a name and initial amount
    public CheckingAccount(String name, double initialAmount) {
        // Call constructor for the superclass
        super(name, initialAmount);
        // Initialize accountNumber with the extension -10
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Override withdraw method from superclass
    @Override
    public boolean withdraw(double amount) {
        // Add fee for check clearing to the withdrawal amount
        double totalAmount = amount + FEE;
        // Call withdraw method from superclass and return its result
        return super.withdraw(totalAmount);
    }
}
