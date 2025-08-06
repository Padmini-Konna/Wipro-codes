package pack1;

public class Main {
    public static void main(String[] args) {
        Person2 smithPerson = new Person2("Smith", 45.0f);
        Person2 kathyPerson = new Person2("Kathy", 30.0f);

        Account smith = new Account(smithPerson, 2000.0);
        Account kathy = new Account(kathyPerson, 3000.0);

        System.out.println("Initial accounts:");
        System.out.println(smith);
        System.out.println(kathy);

        smith.deposit(2000.0);
        try {
            kathy.withdraw(2000.0);
        } catch (Exception e) {
            System.out.println("Withdrawal error for Kathy: " + e.getMessage());
        }

        System.out.println("\nUpdated accounts:");
        System.out.println(smith);
        System.out.println(kathy);
    }
}
