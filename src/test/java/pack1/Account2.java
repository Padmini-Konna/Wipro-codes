package pack1;

public class Account2 {
    protected long accNum;
    protected double balance;
    protected Person2 accHolder;

    public Account2(Person2 accHolder, double initBalance) {
        
        this.accHolder = accHolder;
        this.balance = initBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid withdrawal");
        
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new IllegalStateException("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    
}
