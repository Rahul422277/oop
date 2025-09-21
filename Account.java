class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of " + amount + " successful. New balance is " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance is " + balance);
        } else {
            System.out.println("Withdrawal failed. Check your balance and the amount.");
        }
    }

    public void checkBalance() {
        System.out.println("The current balance is " + balance);
    }

    public static void main(String[] args) {
        Account myAccount = new Account("Jane Doe", "123456789", 500.00);
        myAccount.checkBalance();
        myAccount.deposit(150.00);
        myAccount.withdraw(75.00);
        myAccount.checkBalance();
        myAccount.withdraw(1000.00);
    }
}
