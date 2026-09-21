class BankAccount {
    String account_holder_name;
    double balance;
    void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount){
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn : " + amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void checkBalance() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args)
    {
        BankAccount b = new BankAccount();
        b.account_holder_name = "Ashritha";
        b.balance = 5000;
        b.checkBalance();
        b.deposit(2000);
        b.withdraw(1000);
        b.checkBalance();
    }
}
