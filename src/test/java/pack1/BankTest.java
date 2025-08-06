package pack1;

public class BankTest {
    public static void main(String[] args) {
        Person2 smith = new Person2("Smith", 45);
        Person2 kathy = new Person2("Kathy", 30);

        SavingsAccount sa = new SavingsAccount(smith, 2000);
        CurrentAccount ca = new CurrentAccount(kathy, 3000, 1000);

        System.out.println("Before operations:");
        System.out.println("Savings: balance = INR " + sa.getBalance());
        System.out.println("Current: balance = INR " + ca.getBalance());

        sa.deposit(500);
        try {
            sa.withdraw(1800);  // should fail if drops below INR 500
        } catch (Exception e) {
            System.out.println("Savings withdrawal error: " + e.getMessage());
        }

        ca.withdraw(3500);  // allowed since overdraft limit is INR 1000

        System.out.println("\nAfter operations:");
        System.out.println("Savings balance = INR " + sa.getBalance());
        System.out.println("Current balance = INR " + ca.getBalance());
    }
}

