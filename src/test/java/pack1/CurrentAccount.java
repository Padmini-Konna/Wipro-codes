package pack1;

public class CurrentAccount extends Account2 {
    private double overdraftLimit;

    public CurrentAccount(Person2 accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid withdrawal");
        if (balance - amount < -overdraftLimit) {
            throw new IllegalStateException("Cannot withdraw: overdraft limit of INR " + overdraftLimit + " exceeded.");
        }
        balance -= amount;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double limit) {
        if (limit < 0) throw new IllegalArgumentException("Overdraft limit can't be negative");
        this.overdraftLimit = limit;
    }
}

