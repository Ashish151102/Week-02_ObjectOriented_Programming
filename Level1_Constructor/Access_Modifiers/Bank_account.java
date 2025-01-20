class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance){
		balance -= amount;
		}
        else{ 
		System.out.println("Insufficient funds.");
		}
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolder + ", Balance: $" + getBalance());
    }
}

public class Bank_account {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12346, "Ashish", 1500.0);
        sa.displayAccountDetails();
        sa.deposit(500.0);
        sa.withdraw(300.0);
        sa.displayAccountDetails();
    }
}
