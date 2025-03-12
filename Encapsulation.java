public  class Encapsulation {
    public static void main(String[] args) {
        // Creating a new BankAccount object
        BankAccount account = new BankAccount("John Doe", 1000);

        // Accessing data through getters
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());

        // Depositing and withdrawing money using methods
        account.deposit(500);
        System.out.println("New Balance: $" + account.getBalance());

        account.withdraw(300);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}


class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Default balance if negative amount is provided
        }
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance (no setter to prevent direct modification)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }
}

