package Lab6;

public class SavingsAccount extends BankAccount {
    // Instance variable representing the annual interest rate (2.5%)
    private double rate = 0.025;

    // Instance variable representing the savings account number
    private int savingsNumber = 0;

    // Instance variable representing the account number
    private String accountNumber;

    // Constructor taking a name and initial balance
    public SavingsAccount(String name, double initialBalance) {
        // Call constructor for the superclass
        super(name, initialBalance);
        // Increment savingsNumber for each new account
        savingsNumber++;
        // Set accountNumber based on superclass accountNumber and savingsNumber
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    // Method to calculate and deposit monthly interest
    public void postInterest() {
        double interest = getBalance() * rate / 12;
        deposit(interest);
    }

    // Override getAccountNumber method
    @Override
    public String getAccountNumber() {
        return accountNumber;
    }

    // Copy constructor
    public SavingsAccount(SavingsAccount originalAccount, double initialBalance) {
        // Call copy constructor of superclass
        super(originalAccount, initialBalance);
        // Increment savingsNumber for each new account
        savingsNumber++;
        // Set accountNumber based on superclass accountNumber and savingsNumber
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }
}
