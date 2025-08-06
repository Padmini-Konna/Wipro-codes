package pack1;

public class SavingsAccount extends Account2 {
    public static final double MIN_BALANCE = 500.0;

    public SavingsAccount(Person2 accHolder, double initialBalance) {
        super(accHolder, initialBalance);
        if (initialBalance < MIN_BALANCE) {
            throw new IllegalArgumentException("Must maintain minimum balance of INR " + MIN_BALANCE);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid withdrawal");
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalStateException("Withdrawal denied: minimum balance of INR " + MIN_BALANCE + " must be maintained.");
        }
        balance -= amount;
    }
}
