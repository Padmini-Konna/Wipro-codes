package pack1;

class Person2 {
    private String name;
    private float age;

    
    public Person2() { }

    
    public Person2(String name, float age) {
        this.name = name;
        this.age = age;
    }

   
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

 
    public float getAge() {
        return age;
    }

    
    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2[name=" + name + ", age=" + age + "]";
    }
}

class Account {
    private static long nextAccNum = 1001L;

    private long accNum;
    private double balance;
    private Person2 accHolder;
    private static final double MIN_BALANCE = 500.0;

    public Account(Person2 kathyPerson, double initialBalance) {
        if (initialBalance < MIN_BALANCE) {
            throw new IllegalArgumentException(
                "Initial balance must be at least INR " + MIN_BALANCE);
        }
        this.accNum = nextAccNum++;
        this.accHolder = kathyPerson;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if (balance - amount < MIN_BALANCE) {
            throw new IllegalStateException(
                "Cannot withdraw INR " + amount +
                ". Minimum balance INR " + MIN_BALANCE + " must be maintained.");
        }
        balance -= amount;
    }

    
    public long getAccNum() { return accNum; }
    public double getBalance() { return balance; }
    public Person2 getAccHolder() { return accHolder; }

    public void setAccHolder(Person2 accHolder) {
        if (accHolder == null) throw new IllegalArgumentException("Holder cannot be null");
        this.accHolder = accHolder;
    }

    
    @Override
    public String toString() {
        return "Account[" +
               "accNum=" + accNum +
               ", holder=" + accHolder.getName() +
               ", age=" + accHolder.getAge() +
               ", balance=INR " + balance +
               "]";
    }
}

   
	


